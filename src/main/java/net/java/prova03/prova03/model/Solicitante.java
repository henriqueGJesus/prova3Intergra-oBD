package net.java.prova03.prova03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class  Solicitante extends Usuario {
    @OneToMany
    private Set<OrdemDeServico> ordemDeServicos;

}
