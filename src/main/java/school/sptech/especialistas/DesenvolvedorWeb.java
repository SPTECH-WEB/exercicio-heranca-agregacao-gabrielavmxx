package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {
    private String backend;
    private String frontend;
    private String sgbd;
    private Integer horasMentoria;
    private DesenvolvedorWeb desenvolvedorWeb;

    public DesenvolvedorWeb(Double valorHora, Integer qtdHoras, String nome, String backend, String frontend, String sgbd, Integer horasMentoria, DesenvolvedorWeb desenvolvedorWeb) {
        super(valorHora, qtdHoras, nome);
        this.backend = backend;
        this.frontend = frontend;
        this.sgbd = sgbd;
        this.horasMentoria = horasMentoria;
        this.desenvolvedorWeb = desenvolvedorWeb;
    }

    public DesenvolvedorWeb(){}

    public DesenvolvedorWeb getDesenvolvedorWeb() {
        return desenvolvedorWeb;
    }

    public void setDesenvolvedorWeb(DesenvolvedorWeb desenvolvedorWeb) {
        this.desenvolvedorWeb = desenvolvedorWeb;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getSgbd() {
        return sgbd;
    }

    public void setSgbd(String sgbd) {
        this.sgbd = sgbd;
    }

    public Integer getHorasMentoria() {
        return horasMentoria;
    }

    public void setHorasMentoria(Integer horasMentoria) {
        this.horasMentoria = horasMentoria;
    }

    public Double calcularSalario(){
        return qtdHoras*valorHora+(horasMentoria*300);
    }

    public Boolean isFullstack(){
        if(backend == null || frontend== null || sgbd == null){
            return false;
        }else{
            return true;
        }
    }
}
