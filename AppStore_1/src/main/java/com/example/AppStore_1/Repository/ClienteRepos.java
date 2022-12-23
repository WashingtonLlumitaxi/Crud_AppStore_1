package com.example.AppStore_1.Repository;

import com.example.AppStore_1.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepos extends JpaRepository<Cliente, Integer> {

    @Query("select c from Cliente c where c.nombre = :nombre")
    Cliente findByName(String titular);



}
