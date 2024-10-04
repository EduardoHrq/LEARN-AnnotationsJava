package org.example.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(TODOsHolder.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TODO {

    String value(); // parametro sem chave valor, usa-se value

}
