package Basic;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,select;

        System.out.print("Birinci sayıyı girin: ");
        a = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        b = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        System.out.println("1-Toplama:\n" +
                "2-Çıkarma:\n" +
                "3-Çarpma:\n" +
                "4-Bölme:");
        select = input.nextInt(); //Burada yapmak istediğimiz işlem seçiliyor

        switch (select) {
            case 1:
                System.out.println("Toplama: " + (a + b));
                break;  //Bu işleme girdiyse döngüyü burada sonlandırır

            case 2:
                if(a < b){
                    System.out.println("Çıkarma: " + (b - a));
                }else{
                    System.out.println("Çıkarma: " + (a - b));
                }
                break;

            case 3:
                System.out.println("Çarpma: " + (a*b));
                break;

            case 4:
                if(a < b){
                    System.out.println("Bölme: " + ( b / a));
                }else{
                    System.out.println("Bölme: " + (a / b));
                }
                break;

            default:
                System.out.println("Hatalı seçenek!");
        }
    }
}
