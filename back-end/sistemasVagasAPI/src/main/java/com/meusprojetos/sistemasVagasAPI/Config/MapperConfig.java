package com.meusprojetos.sistemasVagasAPI.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		var model =  new ModelMapper();
		configuraMapeamento(model);
		return model;
	}
	
	private void configuraMapeamento(ModelMapper model) {
		// TODO Auto-generated method stub
		
	}

}
