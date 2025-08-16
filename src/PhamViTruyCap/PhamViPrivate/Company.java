package PhamViTruyCap.PhamViPrivate;

public class Company {

    String address = "Hà Nội";
    public static void main(String[] args) {

        Employee employee = new Employee();
//        employee.age; không thể gọi khi được khởi tạo là private, vậy nên chỉ đk sd trong nội bộ class
        employee.getName();
    }
}
