package net.java.prova03.prova03.service;
import lombok.AllArgsConstructor;
import net.java.prova03.prova03.model.Administrador;
import net.java.prova03.prova03.repository.AdministradorRepository;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AdminstradorService {
    private final AdministradorRepository administradorDefaultRepository;

    public void salvar(Administrador administrador){
        administradorDefaultRepository.save(administrador);
    }

    public void deletar(Integer id) {
        administradorDefaultRepository.deleteById(id);
    }

    public Administrador buscarUm(Integer id) {
        Optional<Administrador> administradorOptional= administradorDefaultRepository.findById(id);
        return administradorOptional.get();
    }

    public Collection<Administrador> buscarTodos() {
        return administradorDefaultRepository.findAll();
    }
}
