package org.example;

import org.example.annotations.TODO;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationsProcessors {
    public static void main(String[] args) {
        inspectTODO(ClassExample.class);
        inspectTODO(OutraClasse.class);
    }

    public static void inspectTODO(Class<?> classe) {
        TODO[] toDos = classe.getAnnotationsByType(TODO.class);
        if (toDos.length != 0) {

            System.out.println("\n"+classe.getName());
            for (TODO todo : toDos) {
                System.out.println("\t⎕ -> " + todo.value());
            }
        } else {
            System.out.println("Not TODO found");
        }

    }
}