import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Package to use input
        Scanner input = new Scanner(System.in);

        System.out.println("Qual número inteiro quer multiplicar?");
        int limit = 10;
        int number = input.nextInt();

        System.out.println("Tabela de multiplicação de " + number);
        for (int counter = 0; counter <= limit; counter++) {
            System.out.println(number + " x " + counter + " = " + number * counter);
        }
    }
}
