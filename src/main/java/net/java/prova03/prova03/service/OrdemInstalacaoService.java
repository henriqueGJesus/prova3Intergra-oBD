package net.java.prova03.prova03.service;

import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.OrdemInstalacao;
import net.java.prova03.prova03.repository.OrdemInstalacaoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrdemInstalacaoService {
    private final OrdemInstalacaoRepository ordemInstalacaoDefaultRepository;
    public void salvar(OrdemInstalacao ordemInstalacao){
        ordemInstalacaoDefaultRepository.save(ordemInstalacao);
    }

    public void deletar(Integer id) {
        ordemInstalacaoDefaultRepository.deleteById(id);
    }

    public OrdemInstalacao buscarUm(Integer id) {
        Optional<OrdemInstalacao> ordemInstalacaoOptional= ordemInstalacaoDefaultRepository.findById(id);
        return ordemInstalacaoOptional.get();
    }

    public Collection<OrdemInstalacao> buscarTodos() {
        return ordemInstalacaoDefaultRepository.findAll();
    }
}
