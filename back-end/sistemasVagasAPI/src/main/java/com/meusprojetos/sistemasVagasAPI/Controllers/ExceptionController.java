package com.meusprojetos.sistemasVagasAPI.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> trataMethodArgumentNotValidException(MethodArgumentNotValidException e){
		return ResponseEntity.badRequest().body("erro");
	}
	
}
