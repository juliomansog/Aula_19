
import java.util.Scanner;
    public class Exercicio1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = sc.nextInt();

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = sc.nextInt();

                int resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Erro: não é possível dividir por zero, Tente novamente.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro: você deve digitar um número inteiro, Tente novamente.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
