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
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idCliente;


    @Column(name = "cedula", nullable = false)
    private int cedula;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private Integer telefono;

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, int cedula, String nombre, String apellido, String correo, String direccion, Integer telefono) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(int cedula, String nombre, String apellido, String correo, String direccion, Integer telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
