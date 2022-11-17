package io.github.arthuramaraim.clientes.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;


import javax.persistence.*;

import javax.validation.constraints.*;
import java.time.LocalDate;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    @NotEmpty(message = "O campo nome é obrigatório.")
    private String nome;

    @Column(nullable = false, length = 11)
    @NotNull(message = "{campo.cpf.obrigatorio}")
    private String cpf;

    @Column(name = "data_cadastro", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;


    @PrePersist
    public void prePresist(){
        setDataCadastro(LocalDate.now());
    }
}
