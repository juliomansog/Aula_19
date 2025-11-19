import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.print("Digite o login: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        try {
            sistema.fazerLogin(usuario, senha);
            System.out.println("Acesso permitido.");
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso Negado: Credenciais incorretas");
        }

        sc.close();
    }
}
