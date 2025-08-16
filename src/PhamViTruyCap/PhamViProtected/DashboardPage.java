package PhamViTruyCap.PhamViProtected;

import PhamViTruyCap.Common.BasePage;

public class DashboardPage extends BasePage{ // từ khoá extends đại diện cho kế  thừa class

    public void getDriver(){
        System.out.println(driver);
    }
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();

        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);

        BasePage basePage = new BasePage();
        //basePage.getDriver(); không thể vì k thấy hàm getDriver() trong class BasePage

        DashboardPage dashboardPage = new DashboardPage();
        System.out.println(dashboardPage.driver);
        dashboardPage.getDriver();

//        System.out.println(driver);// không phải biến static nên k thể gọi trực tiếp hàm main
    }
}
