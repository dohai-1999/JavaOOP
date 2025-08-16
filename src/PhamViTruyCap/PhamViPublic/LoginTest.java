package PhamViTruyCap.PhamViPublic;

import PhamViTruyCap.PhamViProtected.LoginPage;

public class LoginTest {
    public static void main(String[] args) {
        ConfigData configData = new ConfigData();
        System.out.println(configData.BROWER);   // cùng package, khác class

        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.buttonLogin); // khác package
    }
}
