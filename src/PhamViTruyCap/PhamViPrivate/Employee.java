package PhamViTruyCap.PhamViPrivate;

public class Employee {

    private  String name = "Trúc Phương";

    private int age = 25;

    private void getInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public void getName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo();
    }
}
