package school.sptech;

import school.sptech.especialistas.DesenvolvedorMobile;
import school.sptech.especialistas.DesenvolvedorWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(){}

    public Consultoria(String nome, Integer vagas, List<Desenvolvedor> desenvolvedores) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = desenvolvedores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public void contratar(Desenvolvedor desenvolvedor){
        if(vagas > 0){
            desenvolvedores.add(desenvolvedor);
        }
    }

    public void contratarFullstack(DesenvolvedorWeb desenvolvedor){
        if(desenvolvedor.isFullstack() == true){
            desenvolvedores.add(desenvolvedor);
        }
    }

    public Double getTotalSalarios(){
        Double soma = 0.0;
        for(Desenvolvedor d : desenvolvedores){
            soma += d.calcularSalario();
        }
        return soma;
    }

    public Integer qtdDesenvolvedoresMobile() {
        int qtd = 0;
        for (Desenvolvedor d : desenvolvedores) {
            if (d instanceof DesenvolvedorMobile) {
                qtd++;
            }
        }

        return qtd;
    }

    public List<Desenvolvedor> buscarPorSalarioMaiorIgualQue(Double salario) {
        List<Desenvolvedor> desenv = new ArrayList<>();

        for (Desenvolvedor d : desenvolvedores) {
            if (d.calcularSalario() >= salario){
                desenv.add(d);
            }
        }

        return desenv;
    }


    public Desenvolvedor buscarMenorSalario(){
        Desenvolvedor menor = desenvolvedores.get(0);

        for (Desenvolvedor d : desenvolvedores) {
            if (d.calcularSalario() < menor.calcularSalario()) {
                menor = d;
            }
        }

        return menor;
    }
}
