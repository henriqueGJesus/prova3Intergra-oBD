package net.java.prova03.prova03.controller;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.OrdemManutencao;
import net.java.prova03.prova03.service.OrdemManutencaoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequestMapping("/ordemDeManutencao")
@AllArgsConstructor
public class OrdemManutencaoController {

    private final OrdemManutencaoService ordemManutencaoService;

    @GetMapping("/{id}")
    public OrdemManutencao buscarUsuario(@PathVariable Integer id){
        return ordemManutencaoService.buscarUm(id);
    }

    @GetMapping
    public Collection<OrdemManutencao> buscarTodos(){
        return ordemManutencaoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        ordemManutencaoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemManutencao ordemManutencao){
        ordemManutencaoService.salvar(ordemManutencao);
    }

    @PutMapping
    public void atualizar(@RequestBody OrdemManutencao ordemManutencaoAtualizado){
        ordemManutencaoService.salvar(ordemManutencaoAtualizado);
    }
}
