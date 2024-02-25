package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.Impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> obterAlunos()  {
        return service.getAll();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody AlunoForm alunoJson)  {
        return service.create(alunoJson);
    }

    @DeleteMapping("/{id}")
    public String remover (@PathVariable Long id) throws IOException {
         String retorno = "{" + "\"status\": " + "\"sucesso\"}";
         service.delete(id);
         return retorno;
    }
}


