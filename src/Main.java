import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoş Geldiniz...");
        System.out.println("Faiz Oranı: %6");
        int anaPara,vade;
        System.out.println("Yatırmak İstediğiniz Tutar:");
        anaPara=scanner.nextInt();
        System.out.println("Paranızı kaç yıl yatırmak İstiyorsunuz:");
        vade=scanner.nextInt();
        double toplamPara=anaPara;
        double faizOran=0.06;
        for (int i=1;i<=vade;i++){
            toplamPara=(toplamPara*faizOran)+toplamPara;
            System.out.println(i+".yılın sonunda toplam para: "+toplamPara);



        }
    }
}
