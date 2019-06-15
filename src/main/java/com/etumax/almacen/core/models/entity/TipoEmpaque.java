package com.etumax.almacen.core.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
@Table(name = "tipo_empaque")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TipoEmpaque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_empaque")
    private Long codigoEmpaque;
    @Column(name = "descripcion")
    @NotEmpty
    private String descripcion;
    @OneToMany(mappedBy = "tipoEmpaque", fetch = FetchType.LAZY)
    private List<Producto> productos;
}