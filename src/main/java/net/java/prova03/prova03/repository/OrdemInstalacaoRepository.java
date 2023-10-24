package net.java.prova03.prova03.repository;

import net.java.prova03.prova03.model.Administrador;
import net.java.prova03.prova03.model.OrdemInstalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemInstalacaoRepository extends JpaRepository<OrdemInstalacao,Integer> {
}
