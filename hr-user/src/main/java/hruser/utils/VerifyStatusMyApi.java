package hruser.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import java.io.Serializable;

public class VerifyStatusMyApi implements Serializable {

    private static Logger log = LoggerFactory.getLogger(VerifyStatusMyApi.class);

    @Value("${test.config}")
    private static String nameApi;

    @Value("#{systemProperties['java.version']}")
    private static String javaVersion;

    @Value("${spring.h2.console.path}")
    private static String pathH2;

    public VerifyStatusMyApi(){
    }

    public static String verifyStatusMyApi(boolean viewLog) {
        if (viewLog) {
            if (nameApi != null && !nameApi.isEmpty())
                log.info("Parameters read ok! Api Name: " + nameApi);
            else
                log.error("Parameters NOT Ok! name API is: " + nameApi);

            if (javaVersion != null && !javaVersion.isEmpty())
                log.info("Version JVM/JDK is: " + javaVersion);
            else
                log.error("Not Version Java Loaded! " + javaVersion);

            if (pathH2 != null && !pathH2.isEmpty())
                log.info("Database H2 Path: " + pathH2);
            else
                log.error("Not Database H2 path! " + pathH2);
        }

        return returnString(viewLog);

    }

    private static String returnString(boolean viewlog) {
        String str = "not loaded parameters on API Config Server";
        if (!viewlog) {
                   str = "Api  name:  " + nameApi
                   str += "\r\n"
                   str += "Java Version: " + javaVersion + "\n";
                   str += "Database H2: " + pathH2;
        }
        return str;
    }


}
