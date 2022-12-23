package com.example.AppStore_1.Repository;

import com.example.AppStore_1.Entity.Preveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedorRepos extends JpaRepository<Preveedor, Integer> {
    List<Preveedor> getPreveedorByRuc (String ruc);

}
