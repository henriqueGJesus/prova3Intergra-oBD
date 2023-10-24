package net.java.prova03.prova03.controller;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.OrdemInstalacao;
import net.java.prova03.prova03.service.OrdemInstalacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/ordemDeInstalcao")
@AllArgsConstructor
public class OrdemInstalacaoController {
    private final OrdemInstalacaoService ordemInstalacaoService;

    @GetMapping("/{id}")
    public OrdemInstalacao buscarUsuario(@PathVariable Integer id){
        return ordemInstalacaoService.buscarUm(id);
    }

    @GetMapping
    public Collection<OrdemInstalacao> buscarTodos(){
        return ordemInstalacaoService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        ordemInstalacaoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody OrdemInstalacao ordemInstalacao){
        ordemInstalacaoService.salvar(ordemInstalacao);
    }

    @PutMapping
    public void atualizar(@RequestBody OrdemInstalacao ordemInstalacaoAtualizado){
        ordemInstalacaoService.salvar(ordemInstalacaoAtualizado);
    }
}
