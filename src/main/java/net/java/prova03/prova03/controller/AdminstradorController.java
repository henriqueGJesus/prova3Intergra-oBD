package net.java.prova03.prova03.controller;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.Administrador;
import net.java.prova03.prova03.service.AdminstradorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequestMapping("/adminstrador")
@AllArgsConstructor
public class AdminstradorController {
    private final AdminstradorService adminstradorService;

    @GetMapping("/{id}")
    public Administrador buscarUsuario(@PathVariable Integer id){
        return adminstradorService.buscarUm(id);
    }

    @GetMapping
    public Collection<Administrador> buscarTodos(){
        return adminstradorService.buscarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        adminstradorService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Administrador administrador){
        adminstradorService.salvar(administrador);
    }

    @PutMapping
    public void atualizar(@RequestBody Administrador administradorAtualizado){
        adminstradorService.salvar(administradorAtualizado);
    }
}
