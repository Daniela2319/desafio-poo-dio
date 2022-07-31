import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Métorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso.java");
        curso1.setDescricao("descricao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso.jS");
        curso2.setDescricao("descricao do curso jS");
        curso2.setCargaHoraria(4);

        Métorias metoria = new Métorias();

        metoria.setTitulo("Metoria java");
        metoria.setDescricao("Metoria descricao java");
        metoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(metoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(metoria);

        Dev devDaniela = new Dev();
        devDaniela.setNome("Daniela");
        devDaniela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Daniela" + devDaniela.getConteudoInstrito());
        devDaniela.progredir();
        devDaniela.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscrito Daniela" + devDaniela.getConteudoInstrito());
        System.out.println("Conteudo Concluidos Daniela" + devDaniela.getConteudoConcluido());
        System.out.println("XP:  " + devDaniela.calcularTotalXp());


        System.out.println("--------");

        Dev devFrank = new Dev();
        devFrank.setNome("Frank");
        devFrank.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito Frank" + devFrank.getConteudoInstrito());
        devFrank.progredir();
        devFrank.progredir();
        devFrank.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscrito Frank" + devFrank.getConteudoInstrito());
        System.out.println("Conteudo Concluidos Frank" + devFrank.getConteudoConcluido());
        System.out.println("XP:  " + devFrank.calcularTotalXp());







    }
}
