package com.etumax.almacen.core.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_producto")
    private Long codigoProducto;
    @NotEmpty
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio_unitario")
    private Double precioUnitario;
    @Column(name = "precio_por_docena")
    private Double precioPorDocena;
    @Column(name = "precio_por_mayor")
    private Double precioPorMayor;
    @Column(name = "existencia")
    private int existencia;
    @Column(name = "imagen")
    private String imagen;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_categoria")
    private Categoria categoria;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_empaque")
    private TipoEmpaque tipoEmpaque;
}
