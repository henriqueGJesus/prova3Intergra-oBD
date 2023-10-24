package net.java.prova03.prova03.controller;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.Solicitante;
import net.java.prova03.prova03.service.SolicitanteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/solicitante")
@AllArgsConstructor
public class SolicitanteController {
    private final SolicitanteService solicitanteService;

    @GetMapping("/{id}")
    public Solicitante buscarUsuario(@PathVariable Integer id){
        return solicitanteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Solicitante> buscarTodos(){
        return solicitanteService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        solicitanteService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Solicitante solicitante){
        solicitanteService.salvar(solicitante);
    }

    @PutMapping
    public void atualizar(@RequestBody Solicitante solicitanteAtualizado){
        solicitanteService.salvar(solicitanteAtualizado);
    }
}
