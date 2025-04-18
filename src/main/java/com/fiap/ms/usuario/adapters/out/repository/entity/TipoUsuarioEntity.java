package com.fiap.ms.usuario.adapters.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_tipo_usuario")
public class TipoUsuarioEntity {

    @Id
    private Long id;

    private String descricao;
}
