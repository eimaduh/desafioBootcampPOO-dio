import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
   public static void main(String[] args) {
      
      Curso curso1 = new Curso();
      
      curso1.setTitulo("Java");
      curso1.setDescricao("Curso de POO");
      curso1.setCargaHoraria(6);

      System.out.println(curso1);

      Curso curso2 = new Curso();
      
      curso2.setTitulo(" QA");
      curso2.setDescricao("Curso de tipos de teste manuais");
      curso2.setCargaHoraria(6);

      System.out.println(curso2);

      Mentoria mentoria1 = new Mentoria();
      mentoria1.setTitulo("Java no dia a dia");
      mentoria1.setDescricao("Como é trabalhar com Java no dia a dia");
      mentoria1.setData(LocalDate.now());

      System.out.println(mentoria1);



      Bootcamp bootcamp = new Bootcamp();

      bootcamp.setNome("Java Development");
      bootcamp.setDescricao("Programa de formação com Java");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria1);

      System.out.println("---------");

      Dev devMaria = new Dev();
      devMaria.setNome("Maria Eduarda");
      devMaria.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
      System.out.println("---");
      devMaria.progredir();
      devMaria.progredir();
      System.out.println("Conteudos Concluidos Maria: " + devMaria.getConteudosConcluidos());
      System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
      System.out.println("Total XP: " + devMaria.calcularTotalXP());

      System.out.println("---------");

      Dev devLuis = new Dev();
      devLuis.setNome("Luis");
      devLuis.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Luis: " + devLuis.getConteudosInscritos());
      System.out.println("---");
      devLuis.progredir();
      System.out.println("Conteudos Concluidos Luis: " + devLuis.getConteudosConcluidos());
      System.out.println("Conteudos Inscritos Luis: " + devLuis.getConteudosInscritos());
      System.out.println("Total XP: " + devLuis.calcularTotalXP());

   }

}
