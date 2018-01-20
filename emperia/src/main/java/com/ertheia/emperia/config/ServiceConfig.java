package com.ertheia.emperia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ertheia.emperia.service.CadastroMaterialService;

@Configuration
@ComponentScan(basePackageClasses = CadastroMaterialService.class)
public class ServiceConfig {
	
	
	

}
