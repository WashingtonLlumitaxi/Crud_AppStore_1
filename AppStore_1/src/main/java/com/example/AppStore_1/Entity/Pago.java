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
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idPago;


    @Column(name = "tipo_pago", nullable = false)
    private String tipoPago;

    public Pago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "idPago='" + idPago + '\'' +
                ", tipoPago='" + tipoPago + '\'' +
                '}';
    }
}
