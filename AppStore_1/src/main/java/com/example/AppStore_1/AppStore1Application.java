package com.example.AppStore_1;

import com.example.AppStore_1.Repository.ProveedorRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStore1Application {


	@Autowired
	public ProveedorRepos proveedorRepos;

	public static void main(String[] args) {

		SpringApplication.run(AppStore1Application.class, args);
	}









}
