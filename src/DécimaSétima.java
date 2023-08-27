import java.util.Scanner;

public class DécimaSétima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int number = in.nextInt();
        in.close();

        if (number % 5 == 0) {
            System.out.println("Esse número é multiplo de 5");
        }
        else {
            System.out.println("Esse número não é multiplo de 5");
        }
    }
}
