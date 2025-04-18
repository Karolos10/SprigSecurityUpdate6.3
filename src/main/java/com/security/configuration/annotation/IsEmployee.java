package com.security.configuration.annotation;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//MetaAnottaciones nueva funcionalidad spring Security 6.3
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@PreAuthorize("hasAnyRole('{value}')")
public @interface IsEmployee {

    String [] value();
}
