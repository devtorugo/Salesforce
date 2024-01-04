package Cabecalho;

public class Suporte {
    private String ajudaEdocumentacao;
    private String comunidade;
    private String servicosEplanos;

    public Suporte() {
    }

    public Suporte(String ajudaEdocumentacao, String comunidade, String servicosEplanos) {
        this.ajudaEdocumentacao = ajudaEdocumentacao;
        this.comunidade = comunidade;
        this.servicosEplanos = servicosEplanos;
    }

    public String getAjudaEdocumentacao() {
        return ajudaEdocumentacao;
    }

    public void setAjudaEdocumentacao(String ajudaEdocumentacao) {
        this.ajudaEdocumentacao = ajudaEdocumentacao;
    }

    public String getComunidade() {
        return comunidade;
    }

    public void setComunidade(String comunidade) {
        this.comunidade = comunidade;
    }

    public String getServicosEplanos() {
        return servicosEplanos;
    }

    public void setServicosEplanos(String servicosEplanos) {
        this.servicosEplanos = servicosEplanos;
    }
}
