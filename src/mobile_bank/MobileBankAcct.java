package mobile_bank;

import java.util.*;

public class MobileBankAcct {
    private String authentication;
    private String userInputField;
    private String recordModifier;
    Map <String,Object> Profile = new HashMap<>();


    MobileBankAcct(String name){
        this.authentication = name;
        
        Profile.put("userName", authentication);
    }

    public String SayYourName(){
        Scanner collect = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = collect.nextLine();
        return authentication;
//        return
    }

    public String UserInput(int input){
        Scanner collect = new Scanner(System.in);
        System.out.println("Enter amount of money");
        int userInput = collect.nextInt();
        return userInputField;
    }

    public void 


}
//    public void setIdAuthenticator(String name){
//        this.idAuthenticator = name;
//    }
//
//    public String getIdAuthenticator() {
//        return this.idAuthenticator;
//    }
//
//    public void setUserInputField(String input){
//        this.userInputField = input;
//    }
//
//    public String getUserInputField() {
//        return this.userInputField;
//    }
//
//    public void setRecordModifier(String record){
//        this.recordModifier= record;
//    }
//
//    public String getRecordModifier() {
//        return this.recordModifier;
//    }
//}
//
