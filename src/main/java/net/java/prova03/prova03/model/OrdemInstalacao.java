package net.java.prova03.prova03.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrdemInstalacao extends OrdemDeServico {
    private Integer dataInstalcao;
}
