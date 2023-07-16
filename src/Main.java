import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kg;
        double boy, endeks;


        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz : ");
        kg = input.nextInt();

        System.out.println("Boyunuzu Giriniz : ");
        boy = input.nextDouble();

        endeks = kg / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + endeks);

    }

}