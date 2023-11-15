
package manavkasa;

import java.util.Scanner;


public class ManavKasa {

  
    public static void main(String[] args) {

        double toplam,armut=2.14,
               elma=3.67,
               domates=1.11,
               muz=0.95,
               patlıcan=5.00;
            Scanner scn=new Scanner(System.in);
        
        System.out.print("Lutfen Kac Kilo Armut Aldiginizi Giriniz : ");
        double akg=scn.nextDouble();
        System.out.print("Lutfen Kac Kilo Elma Aldiginizi Giriniz : ");
        double ekg=scn.nextDouble();
        System.out.print("Lutfen Kac Kilo Domates Aldiginizi Giriniz : ");
        double dkg=scn.nextDouble();
        System.out.print("Lutfen Kac Kilo Muz Aldiginizi Giriniz : ");
        double mkg=scn.nextDouble();
        System.out.print("Lutfen Kac Kilo Patlican Aldiginizi Giriniz : ");
        double pkg=scn.nextDouble();
        
        toplam=armut*akg+elma*ekg+domates*dkg+muz*mkg+patlıcan*pkg;
        
        System.out.println("Kasada Odemeniz Gereken Toplam Tutar : "+toplam);
        
        

    }
    
}
