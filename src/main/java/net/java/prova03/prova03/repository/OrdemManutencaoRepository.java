package net.java.prova03.prova03.repository;

import net.java.prova03.prova03.model.Administrador;
import net.java.prova03.prova03.model.OrdemManutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemManutencaoRepository extends JpaRepository<OrdemManutencao,Integer> {
}
