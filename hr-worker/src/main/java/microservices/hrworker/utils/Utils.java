package microservices.hrworker.utils;

import microservices.hrworker.entities.EncriptString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;

@Component
public class Utils implements Serializable {

    private static Logger log = LoggerFactory.getLogger(Utils.class);


    public EncriptString encriptString(String origin){
        EncriptString enc = new EncriptString();
        enc.setStringOrigin(origin);
        enc.setStringEncoding(transformChars(origin));
        enc.setStringMD5(encriptMD5(origin));
        enc.setBcript("notBcriptWaiting");
        return enc;
    }

    private static String transformChars(String origin) {
        String newString = "";
        int qtdChars = origin.length();
        int qtdeReserv = 0;
        char character;
        int qtdview = 3;

        if (origin != null && !origin.equals("") && qtdChars >=2) {
            qtdChars = qtdChars - qtdview;
            if (qtdChars >= 0) {
                if (qtdChars > 4) {
                        qtdeReserv = (qtdChars - qtdview);
                } else {
                    qtdeReserv = 0;
                }

                for (int i=0; i<=qtdChars; i++) {
                    character = origin.charAt(i);

                    if (
                              String.valueOf(character).equals(" ") || String.valueOf(character).equals("-")
                          || (String.valueOf(character).equals(" - ")	|| String.valueOf(character).equals("("))
                          || (String.valueOf(character).equals(")")	|| String.valueOf(character).equals("/"))
                    ) {
                        newString = newString + origin.charAt(i);
                    } else if (i >= qtdeReserv) {
                        newString = newString + origin.charAt(i);
                    } else {
                        newString = newString + "*";
                    }
                }
            }
        }
        return newString;
    }

    private static String encriptMD5(String origin){
        String newMD5 = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1,md.digest(origin.getBytes()));
            newMD5 = hash.toString(18);
        } catch (Exception e) {
            log.error("Erro on encripting MD5 String!!! metod: encriptMD5()");
            e.printStackTrace();
        }
        return newMD5;
    }

}
