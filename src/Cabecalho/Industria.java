package Cabecalho;

public class Industria {
    private String automotivo;
    private String comunicacoes;
    private String bensDeConsumo;
    private String servicoseFinanceiros;
    private String saudeECienciaDaVida;
    private String midia;
    private String setorPublico;
    private String varejo;
    private String tecnologia;

    public Industria(){

    }

    public Industria(String automotivo, String comunicacoes, String bensDeConsumo, String servicoseFinanceiros, String saudeECienciaDaVida, String midia, String setorPublico, String varejo, String tecnologia) {
        this.automotivo = automotivo;
        this.comunicacoes = comunicacoes;
        this.bensDeConsumo = bensDeConsumo;
        this.servicoseFinanceiros = servicoseFinanceiros;
        this.saudeECienciaDaVida = saudeECienciaDaVida;
        this.midia = midia;
        this.setorPublico = setorPublico;
        this.varejo = varejo;
        this.tecnologia = tecnologia;
    }

    public String getAutomotivo() {
        return automotivo;
    }

    public void setAutomotivo(String automotivo) {
        this.automotivo = automotivo;
    }

    public String getComunicacoes() {
        return comunicacoes;
    }

    public void setComunicacoes(String comunicacoes) {
        this.comunicacoes = comunicacoes;
    }

    public String getBensDeConsumo() {
        return bensDeConsumo;
    }

    public void setBensDeConsumo(String bensDeConsumo) {
        this.bensDeConsumo = bensDeConsumo;
    }

    public String getServicoseFinanceiros() {
        return servicoseFinanceiros;
    }

    public void setServicoseFinanceiros(String servicoseFinanceiros) {
        this.servicoseFinanceiros = servicoseFinanceiros;
    }

    public String getSaudeECienciaDaVida() {
        return saudeECienciaDaVida;
    }

    public void setSaudeECienciaDaVida(String saudeECienciaDaVida) {
        this.saudeECienciaDaVida = saudeECienciaDaVida;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public String getSetorPublico() {
        return setorPublico;
    }

    public void setSetorPublico(String setorPublico) {
        this.setorPublico = setorPublico;
    }

    public String getVarejo() {
        return varejo;
    }

    public void setVarejo(String varejo) {
        this.varejo = varejo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
