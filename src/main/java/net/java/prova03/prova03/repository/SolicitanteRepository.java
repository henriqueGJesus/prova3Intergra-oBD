package net.java.prova03.prova03.repository;

import net.java.prova03.prova03.model.Administrador;
import net.java.prova03.prova03.model.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante,Integer> {
}
