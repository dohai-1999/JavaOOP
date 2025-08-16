package HamXayDung;

public class HamXayDungCoThamSo {
    public String name;
    public String phone;
    public String address;

    public HamXayDungCoThamSo(String name, String phone, String address){
        this.name = name;
        this.phone =  phone;
        this.address = address;
    }

    public HamXayDungCoThamSo(String name, String phone){
        this.name = name;
        this.phone =  phone;
    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo = new HamXayDungCoThamSo("Lan", "099999999" );
        System.out.println(hamXayDungCoThamSo.name);
        System.out.println(hamXayDungCoThamSo.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Huệ", "088888888" );
        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo3 = new HamXayDungCoThamSo("Mai", "077777777","Hà Nội" );
        System.out.println(hamXayDungCoThamSo3.name);
        System.out.println(hamXayDungCoThamSo3.phone);
        System.out.println(hamXayDungCoThamSo3.address);


    }
}
