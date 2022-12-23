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
@Table(name = "administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idAdmin;


    @Column(name = "cedula", nullable = false)
    private int cedula;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "telefono", nullable = false)
    private Integer telefono;

    @Column(name = "fecha_registro", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;



    public Administrador(int cedula, String nombre, String apellido, Integer telefono, Date fechaRegistro) {
        //this.idAdmin = idAdmin;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "idAdmin=" + idAdmin +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
