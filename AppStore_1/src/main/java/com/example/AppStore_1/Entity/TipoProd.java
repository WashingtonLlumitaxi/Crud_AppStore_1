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
@Table(name = "tipo_prod")
public class TipoProd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idTipoprenda;

    @ManyToOne
    private CategoriaProd categoria;

    @Column(name = "nombre_tip", nullable = false)
    private String nombreTip;

    @Column(name = "caracteristica", nullable = false)
    private String caracteristica;

    public TipoProd(CategoriaProd categoria, String nombreTip, String caracteristica) {
        this.categoria = categoria;
        this.nombreTip = nombreTip;
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "TipoProd{" +
                "idTipoprenda=" + idTipoprenda +
                ", categoria=" + categoria +
                ", nombreTip='" + nombreTip + '\'' +
                ", caracteristica='" + caracteristica + '\'' +
                '}';
    }
}
