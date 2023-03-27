package microservices.hrworker.entities;

import java.io.Serializable;

public class EncriptString implements Serializable {

    private String stringOrigin;
    private String stringEncoding;
    private String stringMD5;
    private String bCript;

    public EncriptString(){
    }
    public EncriptString (String stringOrigin) {
        this.stringOrigin = stringOrigin;
    }

    public String getStringOrigin() {
        return stringOrigin;
    }

    public String getStringEncoding() {
        return stringEncoding;
    }

    public String getStringMD5(){
        return stringMD5;
    }

    public String getbCript() {
        return bCript;
    }

    public void setStringEncoding(String stringEncoding) {
        this.stringEncoding = stringEncoding;
    }

    public void setStringOrigin (String stringOrigin){
        this.stringOrigin = stringOrigin;
    }

    public void setStringMD5 (String stringMD5) {
        this.stringMD5 = stringMD5;
    }

    public void setBcript(String bCript){
        this.bCript = bCript;
    }
}
