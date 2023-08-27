import java.util.Scanner;

public class DécimaNona {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double nota1;
        Double nota2;
        Double nota3;
        Double nota4;

        System.out.println("Digite sua primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        nota3 = scan.nextDouble();


        System.out.println("Digite sua quarta nota: ");
        nota4 = scan.nextDouble();
        
        Double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média foi: %.2f",  resultado);

        
    }
}