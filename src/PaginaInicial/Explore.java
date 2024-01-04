package PaginaInicial;

public class Explore{
    private String visaoGeral;
    private String produtos;
    private String financialServicesCloud;
    private String seguros;
    private String hipotecaeEmprestimo;
    private String recursos;
    private String perguntasFrquentes;

    public Explore() {
    }

    public Explore(String visaoGeral, String produtos, String financialServicesCloud, String seguros, String hipotecaeEmprestimo, String recursos, String perguntasFrquentes) {
        this.visaoGeral = visaoGeral;
        this.produtos = produtos;
        this.financialServicesCloud = financialServicesCloud;
        this.seguros = seguros;
        this.hipotecaeEmprestimo = hipotecaeEmprestimo;
        this.recursos = recursos;
        this.perguntasFrquentes = perguntasFrquentes;
    }

    public String getVisaoGeral() {
        return visaoGeral;
    }

    public void setVisaoGeral(String visaoGeral) {
        this.visaoGeral = visaoGeral;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getFinancialServicesCloud() {
        return financialServicesCloud;
    }

    public void setFinancialServicesCloud(String financialServicesCloud) {
        this.financialServicesCloud = financialServicesCloud;
    }

    public String getSeguros() {
        return seguros;
    }

    public void setSeguros(String seguros) {
        this.seguros = seguros;
    }

    public String getHipotecaeEmprestimo() {
        return hipotecaeEmprestimo;
    }

    public void setHipotecaeEmprestimo(String hipotecaeEmprestimo) {
        this.hipotecaeEmprestimo = hipotecaeEmprestimo;
    }

    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public String getPerguntasFrquentes() {
        return perguntasFrquentes;
    }

    public void setPerguntasFrquentes(String perguntasFrquentes) {
        this.perguntasFrquentes = perguntasFrquentes;
    }
}
