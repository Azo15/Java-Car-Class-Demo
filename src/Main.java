//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Car c1 = new  Car("BMW","Sport",2025,true);
        c1.bilgileriYazdir();

        System.out.println('\n');

        Car c2 = new  Car("AUDI","Sport",2023,false);
        c2.bilgileriYazdir();

        System.out.println('\n');

        Car c3 = new Car();
        c3.bilgileriYazdir();

        System.out.println('\n');System.out.println('\n');

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());


    }
}