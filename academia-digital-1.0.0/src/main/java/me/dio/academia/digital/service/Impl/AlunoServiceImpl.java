package me.dio.academia.digital.service.Impl;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository acao;


    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return acao.save(aluno);

    }

    @Override
    public Aluno get(Long id) {
        return acao.getById(id);
    }

    @Override
    public List<Aluno> getAll() {
        return acao.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) throws IOException {
        File logApagados = new File("apagadosLog.txt");
        FileWriter criarArquivo = null;
        if(!logApagados.exists()){
            criarArquivo = new FileWriter(logApagados);
            ;
        } else {
            criarArquivo = new FileWriter(logApagados, true);;
        }
        BufferedWriter bw = new BufferedWriter(criarArquivo);
        Aluno aluno = acao.getById(id);
        bw.write(aluno.toString().concat(" - Horário exclusão : " + LocalDate.now()));
        bw.flush();
        bw.close();
        acao.deleteById(id);

    }
}
