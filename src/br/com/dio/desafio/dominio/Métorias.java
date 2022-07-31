package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Métorias extends Conteudo {


    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_Padrao + 20d;
    }

    public Métorias() {
    }



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Métorias{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
