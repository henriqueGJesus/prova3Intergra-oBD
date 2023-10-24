package net.java.prova03.prova03.controller;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.Atendente;
import net.java.prova03.prova03.model.Solicitante;
import net.java.prova03.prova03.service.AtendenteService;
import net.java.prova03.prova03.service.SolicitanteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequestMapping("/atendente")
@AllArgsConstructor
public class AtendenteController {
    private final AtendenteService atendenteService;

    @GetMapping("/{id}")
    public Atendente buscarUsuario(@PathVariable Integer id){
        return atendenteService.buscarUm(id);
    }

    @GetMapping
    public Collection<Atendente> buscarTodos(){
        return atendenteService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        atendenteService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Atendente atendente){
        atendenteService.salvar(atendente);
    }

    @PutMapping
    public void atualizar(@RequestBody Atendente atendenteAtualizado){
        atendenteService.salvar(atendenteAtualizado);
    }

}
