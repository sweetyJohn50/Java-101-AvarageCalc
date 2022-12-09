package avarageCalc;
import java.util.Scanner;

public class AvarageCalc {

    public static void main(String[] args) {
        
        int mat,fzk,trkc,kim,muz;

        Scanner i = new Scanner(System.in);
        
        System.out.print("Matematik notunuz : ");

        mat = i.nextInt();

        if ((mat <= 0) && (mat > 100)){
            System.out.println("1-100 arasinda bir rakam giriniz");
        }

        System.out.print("Fizik notunuz : ");

        fzk = i.nextInt();

        if ((fzk <= 0 ) && (fzk > 100)){
            System.out.println("1-100 arasinda bir rakam giriniz");
        }

        System.out.print("Turkce notunuz : ");

        trkc = i.nextInt();

        if ((trkc <= 0) && (trkc > 100)){
            System.out.println("1-100 arasinda bir rakam giriniz");
        } 

        System.out.print("Kimya notunuz : ");

        kim = i.nextInt();

        if ((kim <= 1) && (kim > 100)){
            System.out.println("1-100 arasinda bir rakam giriniz");
        }

        System.out.print("Muzik notunuz : ");
        
        muz = i.nextInt();

        if ((muz <= 0) && (muz > 100)){
            System.out.println("1-100 arasinda bir rakam giriniz");
        }

        i.close();

        double avarage = (mat+fzk+trkc+kim+muz) /5;

        if (avarage < 55){
            System.out.print("Malesef sinifta kaldiniz ");

        } else{
            System.out.print("Tebrikler sinifi gectiniz ");

        }
          
        System.out.print("Ortalamaniz : " + avarage);
    }

    
}
