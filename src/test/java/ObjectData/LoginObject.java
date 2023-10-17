package ObjectData;

import java.util.HashMap;

public class LoginObject {
    private String email;
    private String password;
    private String errorMessage;

    public LoginObject(HashMap<String,String> testData) {

    }
    public void populateData(HashMap<String,String> tesData){
        for(String key:tesData.keySet()){
            switch (key){
                case "email":
                    setEmail(tesData.get(key));
                    break;
                case "password":
                    setPassword(tesData.get(key));
                    break;
                case "errorMessage":
                    setErrorMessage(tesData.get(key));
                    break;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
