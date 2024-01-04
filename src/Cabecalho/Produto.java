package Cabecalho;

public class Produto {
    private String vendas;
    private String atendimentoAoCliente;
    private String marketing;
    private String commerce;
    private String plataforma;
    private String sustentabilidade;
    private String especialistasEAppsDeParceiros;
    private String servicosEplanos;

    public Produto(){

    }

    public Produto(String vendas, String atendimentoAoCliente, String marketing, String commerce, String plataforma, String sustentabilidade, String especialistasEAppsDeParceiros, String servicosEplanos) {
        this.vendas = vendas;
        this.atendimentoAoCliente = atendimentoAoCliente;
        this.marketing = marketing;
        this.commerce = commerce;
        this.plataforma = plataforma;
        this.sustentabilidade = sustentabilidade;
        this.especialistasEAppsDeParceiros = especialistasEAppsDeParceiros;
        this.servicosEplanos = servicosEplanos;
    }

    public String getVendas() {
        return vendas;
    }

    public void setVendas(String vendas) {
        this.vendas = vendas;
    }

    public String getAtendimentoAoCliente() {
        return atendimentoAoCliente;
    }

    public void setAtendimentoAoCliente(String atendimentoAoCliente) {
        this.atendimentoAoCliente = atendimentoAoCliente;
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public String getCommerce() {
        return commerce;
    }

    public void setCommerce(String commerce) {
        this.commerce = commerce;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getSustentabilidade() {
        return sustentabilidade;
    }

    public void setSustentabilidade(String sustentabilidade) {
        this.sustentabilidade = sustentabilidade;
    }

    public String getEspecialistasEAppsDeParceiros() {
        return especialistasEAppsDeParceiros;
    }

    public void setEspecialistasEAppsDeParceiros(String especialistasEAppsDeParceiros) {
        this.especialistasEAppsDeParceiros = especialistasEAppsDeParceiros;
    }

    public String getServicosEplanos() {
        return servicosEplanos;
    }

    public void setServicosEplanos(String servicosEplanos) {
        this.servicosEplanos = servicosEplanos;
    }
}
