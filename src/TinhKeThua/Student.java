package TinhKeThua;

public class Student extends Person {

    private String phone;
    private String address;


    public Student(String name, int age, float height, String phone) { //cấu trúc của class con không cần giống như câu strúc cha, có thể ít/nhiều hơn, chỉ cần đảm bảo chỗ supper là đúng KDL
        super(name, age, height); //Truyền data ngược về class

        this.phone = phone;
        this.address ="Hà Nội";
    }

    public Student() { //class con không có tham số thì dưới super phải truyền cứng giá trị
        super("Hải",26,155F);

    }

    public  void showInfoStudent(){
        getInfo();// Từ class cha Person
        getName();

// DÙng từ khoá super để goi những thành phần từ class Cha khi bị trùng từ khoá
        super.getInfo();
//        System.out.println("Phone:"+phone); // từ class con
//        System.out.println("Address: "+address); // từ class con
    }

    // Ghi đè phương thức từ class Cha ( trùng hàm getInfor , sẽ ưu tiên ở class con )

    public void getInfo(){
        System.out.println("Phone:"+phone);
        System.out.println("Address: "+address);
    }

    public static void main(String[] args) {


        Student student = new Student("Phương", 26, 170F, "09999999");
        student.showInfoStudent();

//        Student student1 = new Student();
//        student1.getInfo();



    }
}