package haitester.Login;

import Customer.CustomerTest;

public class LoginTest {
    String name = "Selenium";
    public void testLoginSuccess(){
        System.out.println("TestLogin Success");
    }

    public void testLoginailWithEmailInvalid(){
        System.out.println("Test login Fail");
    }
    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest(); //LoginTest là class , loginTest là object
        loginTest.testLoginSuccess();
        System.out.println(loginTest.name);

        LoginTest loginTest2 = new LoginTest(); //LoginTest là class , loginTest2 là object
        loginTest2.testLoginSuccess();

        CustomerTest loginTest3 = new CustomerTest();

        new LoginTest().testLoginSuccess(); // gọi kiểu anonymous (ẩn danh )
        new LoginTest().testLoginailWithEmailInvalid();
    }
}
