package com.example.AppStore_1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@PersistenceContext
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "fact_proveedores")
public class FactProveedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idFactprov;


    @ManyToOne
    private Administrador admin;

    @ManyToOne
    private Preveedor proveedor;


    @Column(name = "fecha_registro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;


    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @Column(name = "subtotal", nullable = false)
    private Float subtotal;

    @Column(name = "Total", nullable = false)
    private Float total;

    public FactProveedores(Administrador admin, Preveedor proveedor, Date fechaRegistro, int cantidad, Float subtotal, Float total) {
        this.admin = admin;
        this.proveedor = proveedor;
        this.fechaRegistro = fechaRegistro;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
    }

    @Override
    public String toString() {
        return "FactProveedores{" +
                "idFactprov=" + idFactprov +
                ", admin=" + admin +
                ", proveedor=" + proveedor +
                ", fechaRegistro=" + fechaRegistro +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", total=" + total +
                '}';
    }
}
