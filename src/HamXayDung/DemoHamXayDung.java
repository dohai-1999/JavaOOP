package HamXayDung;

public class DemoHamXayDung {

    public String name;
    public  String phome;

    //Hàm xây dựng - có tên hàng giống tên class
    public DemoHamXayDung(){ //khởi tạo giá trị cho các biến
        name = "Nhung";
        phome = "099938234";
    }

    public static void main(String[] args) {

        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();

        System.out.println(demoHamXayDung.name);
        System.out.println(demoHamXayDung.phome);
    }
}
