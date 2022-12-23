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
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idFactura;

    @ManyToOne
    private OrderCompra orden;

    @ManyToOne
    private OrderCompra cliente;

    @ManyToOne
    private Pago pago;


    @Column(name = "fecha_fac", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFac;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @Column(name = "iva", nullable = false)
    private Float iva;

    @Column(name = "subtotal", nullable = false)
    private Float subtotal;

    @Column(name = "total", nullable = false)
    private Float total;

    public Factura(OrderCompra orden, OrderCompra cliente, Pago pago, Date fechaFac, Float iva, Float subtotal, Float total) {
        this.orden = orden;
        this.cliente = cliente;
        this.pago = pago;
        this.fechaFac = fechaFac;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", orden=" + orden +
                ", cliente=" + cliente +
                ", pago=" + pago +
                ", fechaFac=" + fechaFac +
                ", iva=" + iva +
                ", subtotal=" + subtotal +
                ", total=" + total +
                '}';
    }
}
