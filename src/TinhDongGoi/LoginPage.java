package TinhDongGoi;

import haitester.Login.LoginTest;

public class LoginPage {

    private  String url;
    private  String email;
    private  String password;

    

    public String getEmail(){
        return email;
    }
     public String getPassword(){
        return password;
     }
     public  String getUrl(){
        return url;
     }

     public void setEmail(String email){
        this.email= email;
     }
    public void setPassword(String password){
        this.password= password;
    }
    public void setUrl(String url){
        this.email= url;
    }

    public void loginCRM(){
        System.out.println("Open URL:"+getUrl());
        System.out.println("Enter Email:"+getEmail());
        System.out.println("Enter Password:"+getPassword());
    }

    public static void main(String[] args) {
        LoginPage loginPage  = new LoginPage();
        loginPage.setUrl("https://anhtester.com/lesson/selenium-java-bai-2-java-oop");
        loginPage.setEmail("admin@example.com");
        loginPage.setPassword("123456");
        loginPage.loginCRM();

        LoginPage loginPage2  = new LoginPage();
        loginPage.setUrl("https://anhtester.com/lesson/selenium-java-bai-2-java-oop");
        loginPage2.setEmail("customer@example.com");
        loginPage2.setPassword("12345678");
        loginPage2.loginCRM();

    }
}
