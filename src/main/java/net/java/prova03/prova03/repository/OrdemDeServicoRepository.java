package net.java.prova03.prova03.repository;

import net.java.prova03.prova03.model.Administrador;
import net.java.prova03.prova03.model.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico,Integer> {
}
