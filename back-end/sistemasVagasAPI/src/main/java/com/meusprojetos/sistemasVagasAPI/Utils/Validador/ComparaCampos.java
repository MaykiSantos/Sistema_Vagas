package com.meusprojetos.sistemasVagasAPI.Utils.Validador;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ComparaCamposValidador.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ComparaCampos {

    String message() default "valores são diferentes";

    String field();

    String fieldMatch();
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};

    @Target({ ElementType.TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
    	ComparaCampos[] value();
    }
}