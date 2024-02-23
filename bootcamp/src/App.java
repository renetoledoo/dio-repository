import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso meuCurso = new Curso();

        meuCurso.setCargaHoraria(60);
        meuCurso.setDescricao("Curso de Herança de JAVA");
        meuCurso.setTitulo("Java - Herança  e Poliformismo");

        Mentoria minhaMentoria = new Mentoria();
        minhaMentoria.setData(LocalDate.now());
        minhaMentoria.setDescricao("Consumir AWS S3 para upload e otimização seu sistema");
        minhaMentoria.setTitulo("Java e AWS S3 Upload Blob Item");

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(meuCurso);
        bootcamp.getConteudos().add(minhaMentoria);

        
            // Meu método
        Dev rene = new Dev();
        rene.inscreverBootcamp(bootcamp);
        rene.setNome("Renê - Java Developer");
        System.out.println(rene.getConteudosConcluidos());


    }
}
