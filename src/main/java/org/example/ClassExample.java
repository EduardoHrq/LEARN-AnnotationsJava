package org.example;

import org.example.annotations.*;

@OnlyClass

// Repeatable permite a repetição da annotation
@TODO("Fazer um construtor")
@TODO("Fazer outro getter e setter")
public class ClassExample {

    @Basic
    private String name;

//    @OnlyMethod -> erro pois só é aceito em metodos
    private Long id;

    private String password;

    @WithValues(oQueFazer = "outros getter e setter", foiFeito = false)

    @WithValuesButOptional

    @OnlyMethod
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
