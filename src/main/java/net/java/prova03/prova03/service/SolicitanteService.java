package net.java.prova03.prova03.service;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.Solicitante;
import net.java.prova03.prova03.repository.SolicitanteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SolicitanteService {
    private final SolicitanteRepository solicitanteDefaultRepository;

    public void salvar(Solicitante solicitante){
        solicitanteDefaultRepository.save(solicitante);
    }

    public void deletar(Integer id) {
        solicitanteDefaultRepository.deleteById(id);
    }

    public Solicitante buscarUm(Integer id) {
        Optional<Solicitante> solicitanteOptional= solicitanteDefaultRepository.findById(id);
        return solicitanteOptional.get();
    }

    public Collection<Solicitante> buscarTodos() {
        return solicitanteDefaultRepository.findAll();
    }
}
