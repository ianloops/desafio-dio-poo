import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso de Java e POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso de Javascript completo");
        curso2.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Iniciando em Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2.toString());
        System.out.println(mentoria1.getDescricao());
    }
}