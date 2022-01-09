package cocukyardımı;   //@ author Saffet Demir

import java.util.Scanner;

public class Cocukyardımı {

    public static void main(String[] args) { // Ana metot
        Scanner scan = new Scanner(System.in); // Klavye girişi

        System.out.print("Normal maaş mıktarını giriniz : "); // Veri girişi
        double maas = scan.nextDouble();
        System.out.print("Çocuk başına alınacak prim miktarını giriniz : ");
        double prim = scan.nextDouble();
        System.out.print("Çocuk sayısını giriniz : ");
        int cocuk = scan.nextInt();
        if (cocuk > 0) { //Çocuk sayısının 0 dan fazla olması durumunda prim alınır
            maas += (prim * cocuk);
            System.out.println("Toplam Maaş = " + (long) maas);
            System.out.println("Alınan Prim = " + (long) (prim * cocuk));
        } else {
            System.out.println("Toplam Maaş = " + (long) maas);
        }
    }
}
