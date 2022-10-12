import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a altura de uma pessoa:");
        double altura = sc.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + peso);

    }
}