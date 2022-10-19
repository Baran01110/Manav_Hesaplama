import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Arm=2.14,Elm=3.67,Dom=1.11,Muz=0.95,Pat=5.00,Toplam;
        double KgArm,KgElm,KgDom,KgMuz,KgPat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? ");
        KgArm = inp.nextDouble();

        System.out.print("Elma kaç kilo ? ");
        KgElm = inp.nextDouble();

        System.out.print("Domates kaç kilo ? ");
        KgDom = inp.nextDouble();

        System.out.print("Muz kaç kilo ? ");
        KgMuz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo ? ");
        KgPat = inp.nextDouble();

        Toplam = (Arm*KgArm) + (Elm*KgElm) + (Dom*KgDom) + (Muz*KgMuz) + (Pat*KgPat);

        System.out.println("Toplam tutar: " + Toplam);
    }
}