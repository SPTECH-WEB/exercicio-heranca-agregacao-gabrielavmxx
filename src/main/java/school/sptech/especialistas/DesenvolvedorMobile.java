package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorMobile extends Desenvolvedor {
    private String plataforma;
    private String linguagem;
    private Integer horasPrototipacao;
    private Desenvolvedor desenvolvedor;

    public DesenvolvedorMobile(){}

    public DesenvolvedorMobile(String plataforma, String linguagem, Integer horasPrototipacao, Desenvolvedor desenvolvedor) {
        this.plataforma = plataforma;
        this.linguagem = linguagem;
        this.horasPrototipacao = horasPrototipacao;
        this.desenvolvedor = desenvolvedor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHorasPrototipacao() {
        return horasPrototipacao;
    }

    public void setHorasPrototipacao(Integer horasPrototipacao) {
        this.horasPrototipacao = horasPrototipacao;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public Double calcularSalario() {
        return (qtdHoras * valorHora) + (horasPrototipacao * 200);
    }
}
