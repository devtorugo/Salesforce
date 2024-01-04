package Cabecalho;

public class Empresa {
    private String sobreAsalesforce;
    private String nossosValores;
    private String nossosImpacto;
    private String carreiras;
    private String noticias;
    private String maisMarcasdaSalesforce;

    public Empresa() {
    }

    public Empresa(String sobreAsalesforce, String nossosValores, String nossosImpacto, String carreiras, String noticias, String maisMarcasdaSalesforce) {
        this.sobreAsalesforce = sobreAsalesforce;
        this.nossosValores = nossosValores;
        this.nossosImpacto = nossosImpacto;
        this.carreiras = carreiras;
        this.noticias = noticias;
        this.maisMarcasdaSalesforce = maisMarcasdaSalesforce;
    }

    public String getSobreAsalesforce() {
        return sobreAsalesforce;
    }

    public void setSobreAsalesforce(String sobreAsalesforce) {
        this.sobreAsalesforce = sobreAsalesforce;
    }

    public String getNossosValores() {
        return nossosValores;
    }

    public void setNossosValores(String nossosValores) {
        this.nossosValores = nossosValores;
    }

    public String getNossosImpacto() {
        return nossosImpacto;
    }

    public void setNossosImpacto(String nossosImpacto) {
        this.nossosImpacto = nossosImpacto;
    }

    public String getCarreiras() {
        return carreiras;
    }

    public void setCarreiras(String carreiras) {
        this.carreiras = carreiras;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }

    public String getMaisMarcasdaSalesforce() {
        return maisMarcasdaSalesforce;
    }

    public void setMaisMarcasdaSalesforce(String maisMarcasdaSalesforce) {
        this.maisMarcasdaSalesforce = maisMarcasdaSalesforce;
    }
}
