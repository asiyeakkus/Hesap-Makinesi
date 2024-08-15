import java.util.Scanner;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean T=true;

        int cevap;
        while (T) {
        System.out.print("İlk sayıyı girin.");
        int sayi1 = scanner.nextInt();
        System.out.print("İşlem yapmak istediğiniz operatörü girin.");
        char operator = scanner.next().charAt(0);

        System.out.print("İkinci sayıyı giriniz.");
        int sayi2 = scanner.nextInt();

        if (operator == '+') {
            cevap = sayi1 + sayi2;
            System.out.println("Cevap: " + cevap);
        } else if (operator == '-') {
            cevap = sayi1 - sayi2;
            System.out.println("Cevap: " + cevap);
        }
        else if (operator == '*') {
            cevap = sayi1 * sayi2;
            System.out.println("Cevap: " + cevap);
        }
        else if (operator == '/') {
            if (sayi2==0){
                System.out.print("Tanımsız /n ");
                continue;
            }
            cevap = sayi1 / sayi2;
            System.out.println("Cevap: " + cevap);
        }

        System.out.println("Çıkmak istiyorsan 0'a bas.");
        System.out.println("Devam etmek istiyorsan herhangi bir rakama bas.");
        int cikis = scanner.nextInt();
        if(cikis == 0)
            break;

    }}}
