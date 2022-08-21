import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Iniciando em Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2.toString());
//        System.out.println(mentoria1.getDescricao());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIan = new Dev();
        devIan.setNome("Ian");
        devIan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Ian: " + devIan.getConteudosInscritos());
        devIan.progredir();
        devIan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Ian: " + devIan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Ian: " + devIan.getConteudosConcluidos());
        System.out.println("XP: " + devIan.calcularTotalXp());

        System.out.println("-------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Lucas: " + devLucas .getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Lucas: " + devLucas .getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Lucas: " + devLucas .getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
    }
}