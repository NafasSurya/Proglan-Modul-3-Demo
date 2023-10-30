import java.util.Scanner;
public class AutocompleteAndTemplate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan panjang sisi b: ");
        double b = input.nextDouble();

        double keliling = 2 * (a + b);
        System.out.println("Keliling jajargenjang adalah " + keliling);
    }
}


