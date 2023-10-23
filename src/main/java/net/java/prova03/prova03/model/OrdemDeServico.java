package net.java.prova03.prova03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrdemDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroOrdem;
    private String descricao;
    private String status;
}
