package com.example.AppStore_1.Repository;

import com.example.AppStore_1.Entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepos extends JpaRepository<Factura, Integer> {
}
