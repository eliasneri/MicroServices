package microservices.hrworker.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ConvertLGPD implements Serializable {

    public String transformsChar(String text){

            String textCoder = "";
            int b = text.length();
            int c;
            char letra;

            if (b>0){

            }




            for (int i=0; i<b; i++) {
                if (text.charAt(i) != (b-3)){
                    letra = text.charAt(i);


                    textCoder = textCoder + "*";
                    System.out.println(b);
                } else {
                    textCoder = textCoder + text.charAt(i);
                }
            }

        return textCoder;
        }
    }

