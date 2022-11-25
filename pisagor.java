import java.util.Scanner;

public class pisagor {
    public static void main(String[] args) {
        double kisa_kenar1 , kisa_kenar2 , uzun_kenar;

        Scanner inpunt= new Scanner(System.in);
        System.out.println("1. kısa kenarı giriniz");
        kisa_kenar1= inpunt.nextDouble();
        System.out.println("2. kısa kenarı giriniz");
        kisa_kenar2= inpunt.nextDouble();

        uzun_kenar= Math.sqrt((kisa_kenar1*kisa_kenar1)+(kisa_kenar2*kisa_kenar2));

System.out.println("Hipotenüs: "+ uzun_kenar);











    }
}
