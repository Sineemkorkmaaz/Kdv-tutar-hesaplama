import java.util.Scanner;

public class kdvhesap {

    public static void main(String[] args) {
        double tutar , kdvOranı = 0.18 , kdvTutar , kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz :");
        tutar = input.nextDouble();
        
        kdvTutar = tutar * kdvOranı;
        kdvliTutar = tutar + kdvTutar ;

        System.out.println("KDV Oranı:" + kdvOranı);
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);

    }
}