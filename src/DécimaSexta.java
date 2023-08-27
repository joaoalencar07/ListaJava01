import java.util.Scanner;

public class DécimaSexta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int number = in.nextInt();
        in.close();

        if (number % 3 == 0) {
            System.out.println("Esse número é multiplo de 3");
        }
        else {
            System.out.println("Esse número não é multiplo de 3");
        }
    }
}

