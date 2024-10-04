package org.example.annotations;

public @interface WithValues {

    String value() default "a fazer";
    String oQueFazer();
    boolean foiFeito();

}
