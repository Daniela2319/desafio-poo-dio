package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInstrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){

        this.conteudoInstrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){

        Optional<Conteudo> conteudo = this.conteudoInstrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInstrito.remove(conteudo.get());
        } else {
            System.err.println("voce nao esta matriculado em nenhum conteudo");
        }

    }

    public double calcularTotalXp(){

       return this.conteudoConcluido.stream().mapToDouble(Conteudo::calcularXp).sum();


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInstrito() {
        return conteudoInstrito;
    }

    public void setConteudoInstrito(Set<Conteudo> conteudoInstrito) {
        this.conteudoInstrito = conteudoInstrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInstrito, dev.conteudoInstrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInstrito, conteudoConcluido);
    }
}
