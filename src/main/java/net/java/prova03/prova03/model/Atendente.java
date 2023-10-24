package net.java.prova03.prova03.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Atendente extends Usuario {
    @OneToMany
    private Set<OrdemDeServico> ordemDeServicos;
    @ManyToOne
    @JoinColumn(nullable = true)
    private Administrador administrador;
}
