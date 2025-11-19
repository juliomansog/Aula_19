public class SistemaLogin {
    private String senhaSecreta;

    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!senha.equals(senhaSecreta)) {
            throw new LoginInvalidoException("Credenciais incorretas");
        }
    }
}
