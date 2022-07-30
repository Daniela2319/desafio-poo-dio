import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Métorias metoria = new Métorias();

        metoria.setTitulo("Metoria java");
        metoria.setDescricao("Metoria descricao java");
        metoria.setData(LocalDate.now());

        System.out.println(metoria);

    }
}
