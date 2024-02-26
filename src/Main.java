import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayısı Giriniz : ");       // orta yükseklik yıldız sayısı iste
        int n = input.nextInt();                                // yüksekliği kaydet ve n'e ata

        for (int i = 1; i <= n; i++) {                    // yükseklikten azaltalarak yukarıdan aşşağı sırala
            for (int k = 1; k <= (n - i); k++) {         // sol tarafı 1 arttırarak bolşuk yok
                System.out.print(" ");                     // tekrar kadar boşluk yazdır
            }
            for (int x = 1; x <= (2 * i) - 1; x++) {        // sıralı artarak yıldız yazdır
                System.out.print("*");
            }
            System.out.println();                   // her yıldız satırından sonra satır atla
        }

        for (int a = n ; a > 0 ; a--) {             // elmasın en kalın yerinden azaltarak boşluk ata
            for (int b = n; b > a-1; b--) {         // n sayısını soldan eksilterek boşluk koy
                System.out.print(" ");              // tekrar kadar boşluk yazdır.
            }
            for (int c = 1 ; c < (a*2-2) ; c++) {       //n sayısını 2  azaltarak yıldız yazdır
                System.out.print("*");                  // yıldızı yazdır
            }
            System.out.println();
        }
    }
}               //Ali Eren KÖSE 26/02/2024  20:05
