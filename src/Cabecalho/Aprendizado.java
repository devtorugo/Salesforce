package Cabecalho;

public class Aprendizado {
    private String aprendizadoNoTrailhead;
    private String eventosEExperiencias;
    private String blogs;
    private String topico;
    private String tipoDeConteudo;
    private String funcao;
    private String industria;

    public Aprendizado() {
    }

    public Aprendizado(String aprendizadoNoTrailhead, String eventosEExperiencias, String blogs, String topico, String tipoDeConteudo, String funcao, String industria) {
        this.aprendizadoNoTrailhead = aprendizadoNoTrailhead;
        this.eventosEExperiencias = eventosEExperiencias;
        this.blogs = blogs;
        this.topico = topico;
        this.tipoDeConteudo = tipoDeConteudo;
        this.funcao = funcao;
        this.industria = industria;
    }

    public String getAprendizadoNoTrailhead() {
        return aprendizadoNoTrailhead;
    }

    public void setAprendizadoNoTrailhead(String aprendizadoNoTrailhead) {
        this.aprendizadoNoTrailhead = aprendizadoNoTrailhead;
    }

    public String getEventosEExperiencias() {
        return eventosEExperiencias;
    }

    public void setEventosEExperiencias(String eventosEExperiencias) {
        this.eventosEExperiencias = eventosEExperiencias;
    }

    public String getBlogs() {
        return blogs;
    }

    public void setBlogs(String blogs) {
        this.blogs = blogs;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public String getTipoDeConteudo() {
        return tipoDeConteudo;
    }

    public void setTipoDeConteudo(String tipoDeConteudo) {
        this.tipoDeConteudo = tipoDeConteudo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }
}
