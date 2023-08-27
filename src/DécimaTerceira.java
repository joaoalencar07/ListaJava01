import java.util.Scanner;

public class DécimaTerceira {
    public static void main(String[] args) {
        int number = 4;

        if (0 <= number && number <= 10) {
            System.out.println("Numero entre zero e dez");
        } else if (number < 0) {
            System.out.println("Este numero é menor que zero");
        } else {
            System.out.println("Este numero é maior que dez");  
                    
        }
    }
}

