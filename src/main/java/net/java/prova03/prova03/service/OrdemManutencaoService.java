package net.java.prova03.prova03.service;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.OrdemManutencao;
import net.java.prova03.prova03.repository.OrdemManutencaoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrdemManutencaoService {
    private final OrdemManutencaoRepository ordemManutencaoDefaultRepository;
    public void salvar(OrdemManutencao ordemManutencao){
        ordemManutencaoDefaultRepository.save(ordemManutencao);
    }

    public void deletar(Integer id) {
        ordemManutencaoDefaultRepository.deleteById(id);
    }

    public OrdemManutencao buscarUm(Integer id) {
        Optional<OrdemManutencao> ordemManutencaoOptional= ordemManutencaoDefaultRepository.findById(id);
        return ordemManutencaoOptional.get();
    }

    public Collection<OrdemManutencao> buscarTodos() {
        return ordemManutencaoDefaultRepository.findAll();
    }
}
