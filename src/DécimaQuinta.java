import java.util.Scanner;

public class DécimaQuinta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Por favor insina o número ");
        int number = in.nextInt();
        in.close();

        if (number % 2 != 0) {
            System.out.println("Esse número é par");
        }
        else {
            System.out.println("Esse número é impar");
        }

    }
}
