package net.java.prova03.prova03.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ArrayList<OrdemDeServico> ordemDeServicos = new ArrayList<>();
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    private int cpf;
    private String nome;
}
