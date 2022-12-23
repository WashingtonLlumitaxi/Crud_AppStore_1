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
@Table(name = "orden_compra")
public class OrderCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idOrden;

    @ManyToOne
    private Producto productoo;

    @ManyToOne
    private Cliente clienteo;


    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio", nullable = false)
    private Float precio;

    @Column(name = "descuento", nullable = false)
    private Float descuento;

    public OrderCompra(Producto productoo, Cliente clienteo, String estado, Integer cantidad, Float precio, Float descuento) {
        this.productoo = productoo;
        this.clienteo = clienteo;
        this.estado = estado;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "OrderCompra{" +
                "idOrden=" + idOrden +
                ", productoo=" + productoo +
                ", clienteo=" + clienteo +
                ", estado='" + estado + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", descuento=" + descuento +
                '}';
    }
}
