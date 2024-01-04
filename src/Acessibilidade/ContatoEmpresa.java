package Acessibilidade;

import Usuario.Cadastro;

public class ContatoEmpresa extends Cadastro {
    private String perguntasEcomentarios;
    private boolean comunicados;

    public ContatoEmpresa(String perguntasEcomentarios, boolean comunicados) {
        this.perguntasEcomentarios = perguntasEcomentarios;
        this.comunicados = comunicados;
    }

    public ContatoEmpresa(String nome, String sobrenome, String cargo, String email, String telefone, String empresa, String pais, String idioma, boolean termo, String senha, String perguntasEcomentarios, boolean comunicados) {
        super(nome, sobrenome, cargo, email, telefone, empresa, pais, idioma, termo, senha);
        this.perguntasEcomentarios = perguntasEcomentarios;
        this.comunicados = comunicados;
    }

    public String getPerguntasEcomentarios() {
        return perguntasEcomentarios;
    }

    public void setPerguntasEcomentarios(String perguntasEcomentarios) {
        this.perguntasEcomentarios = perguntasEcomentarios;
    }

    public boolean isComunicados() {
        return comunicados;
    }

    public void setComunicados(boolean comunicados) {
        this.comunicados = comunicados;
    }

    public void ReceberContato(){

    }
}
