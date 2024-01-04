package Usuario;

public class Login {
    private String email;
    private String senha;
    private boolean lembrarSenha;

    public Login(){

    }

    public Login(String email, String senha, boolean lembrarSenha) {
        this.email = email;
        this.senha = senha;
        this.lembrarSenha = lembrarSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLembrarSenha() {
        return lembrarSenha;
    }

    public void setLembrarSenha(boolean lembrarSenha) {
        this.lembrarSenha = lembrarSenha;
    }

    public void EsqueceuSuaSenha(){

    }
    public void FazerLogin(){

    }
    public void FazerCadastro(){

    }

}
