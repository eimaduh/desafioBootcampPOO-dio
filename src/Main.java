import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main {
   public static void main(String[] args) {
      
      Curso curso1 = new Curso();
      
      curso1.setTitulo("Java");
      curso1.setDescricao("Curso de POO");
      curso1.setCargaHoraria(6);

      System.out.println(curso1);

      Mentoria mentoria1 = new Mentoria();
      mentoria1.setTitulo("Java no dia a dia");
      mentoria1.setDescricao("Como é trabalhar com Java no dia a dia");
      mentoria1.setData(LocalDate.now());

      System.out.println(mentoria1);
   }
}
