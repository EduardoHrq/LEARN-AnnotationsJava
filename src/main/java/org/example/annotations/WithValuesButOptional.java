package org.example.annotations;

public @interface WithValuesButOptional {

    String valor1() default "default1";
    String valor2() default "default2";

}
