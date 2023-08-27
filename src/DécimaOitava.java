import java.util.Scanner;

public class DécimaOitava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int number = in.nextInt();
        in.close();

        if (number % 7 == 0) {
            System.out.println("Esse número é multiplo de 7");
        }
        else {
            System.out.println("Esse número não é multiplo de 7");
        }
    }
}

