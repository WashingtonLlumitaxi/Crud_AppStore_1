package com.example.AppStore_1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@PersistenceContext
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idProducto;

    @ManyToOne
    private CategoriaProd categoria;

    @ManyToOne
    private TipoProd tipo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "caracteristica", nullable = false)
    private String caracteristica;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @Column(name = "talla", nullable = false)
    private Float talla;

    @Column(name = "precio", nullable = false)
    private Float precio;

    @Column(name = "descuento", nullable = false)
    private Float descuento;

    public Producto(CategoriaProd categoria, TipoProd tipo, String descripcion, String caracteristica, Float talla, Float precio, Float descuento) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.caracteristica = caracteristica;
        this.talla = talla;
        this.precio = precio;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", categoria=" + categoria +
                ", tipo=" + tipo +
                ", descripcion='" + descripcion + '\'' +
                ", caracteristica='" + caracteristica + '\'' +
                ", talla=" + talla +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }
}
