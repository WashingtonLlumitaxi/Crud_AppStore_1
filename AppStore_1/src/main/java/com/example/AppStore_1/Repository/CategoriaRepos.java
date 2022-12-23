package com.example.AppStore_1.Repository;

import com.example.AppStore_1.Entity.CategoriaProd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepos extends JpaRepository<CategoriaProd, Integer> {

}
