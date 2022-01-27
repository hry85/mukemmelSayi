import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,sonuc=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi=sc.nextInt();

        for (int i=1;i<sayi;i++){
            if (sayi % i == 0){
                sonuc += i;

            }
        }
             if (sayi == sonuc){
                 System.out.print(sayi+ " Mukemmel sayidir. ");
             }else {
                 System.out.print(sayi+ " Mukemmel sayi degildir. ");
             }


    }
}
