package com.dossier.msdossiermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsDossierMicroserviceApplication {


	public static void main(String[] args) {

		SpringApplication.run(MsDossierMicroserviceApplication.class, args);
	}

}
