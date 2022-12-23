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
@Table(name = "proveedor")
public class Preveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idProveedor;


    @Column(name = "ruc", nullable = false)
    private String ruc;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;


    @Column(name = "fecha_registro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;


    @Column(name = "sucursal", nullable = false)
    private String sucursal;


    @Column(name = "descripcion", nullable = false)
    private String descripcion;


    public Preveedor(String ruc, String razonSocial, Date fechaRegistro, String sucursal, String descripcion) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.fechaRegistro = fechaRegistro;
        this.sucursal = sucursal;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Preveedor{" +
                "idProveedor=" + idProveedor +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", sucursal='" + sucursal + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }


}
