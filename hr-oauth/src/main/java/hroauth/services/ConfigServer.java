package hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class ConfigServer {

    @Value("${credentials.name}")
    private String credentialsName;
    @Value("${credentials.password}")
    private String credentialsPass;

    private static Logger log = LoggerFactory.getLogger(ConfigServer.class);

    public ConfigServer(){
    }

    public Boolean loadCredentials(){
        boolean ok = false;
        try {
            if ((!credentialsName.isEmpty() && !credentialsName.isBlank() && credentialsName != null) &&
                  (!credentialsPass.isEmpty() && !credentialsPass.isBlank() && credentialsPass != null)) {
                ok = true;
            }
            return ok;
        } catch (Exception e) {
            log.error("Error Loading Credentials: "+ String.valueOf(e));
        }
        return ok;
    }

    public String getCredentialsName() {
        if (!loadCredentials())
            return "error loading credentials name";
        else
            return credentialsName;
    }

    public String getCredentialsPass() {
        if (!loadCredentials())
            return "error loading credentials passWord";
        else
            return credentialsPass;
    }
}
