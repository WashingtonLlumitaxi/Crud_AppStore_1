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
@Table(name = "categoria_prod")
public class CategoriaProd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer idCategoria;


    @Column(name = "nombre_cat", nullable = false)
    private String nombreCat;


    @Column(name = "tipo_cat", nullable = false)
    private String tipoCat;

    public CategoriaProd(String nombreCat, String tipoCat) {
        //this.idCategoria = idCategoria;
        this.nombreCat = nombreCat;
        this.tipoCat = tipoCat;
    }

    @Override
    public String toString() {
        return "CategoriaProd{" +
                "idCategoria=" + idCategoria +
                ", nombreCat='" + nombreCat + '\'' +
                ", tipoCat='" + tipoCat + '\'' +
                '}';
    }
}
