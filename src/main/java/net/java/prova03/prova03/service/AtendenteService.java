package net.java.prova03.prova03.service;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.Atendente;
import net.java.prova03.prova03.repository.AtendenteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@AllArgsConstructor
@Service
public class AtendenteService {

    private final AtendenteRepository atendenteDefaultRepository;

    public void salvar(Atendente atendente){
        atendenteDefaultRepository.save(atendente);
    }

    public void deletar(Integer id) {
        atendenteDefaultRepository.deleteById(id);
    }

    public Atendente buscarUm(Integer id) {
        Optional<Atendente> atendenteOptional= atendenteDefaultRepository.findById(id);
        return atendenteOptional.get();
    }

    public Collection<Atendente> buscarTodos() {
        return atendenteDefaultRepository.findAll();
    }

}
