package com.empresa.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.empresa.model.Empleado;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSON {

    public static ObjectMapper mapeador = new ObjectMapper();
    // public static String rutaArchivo;

    public static <T> void cargarDatos(List<T> obje)
            throws StreamWriteException, DatabindException, IOException {

        String json = mapeador.writerWithDefaultPrettyPrinter().writeValueAsString(obje);
        System.out.println("=== JSON que se va a escribir ===");
        System.out.println(json);
        System.out.println("=================================");

        mapeador.writeValue(new File("C:\\Users\\Asus\\Downloads\\datos.json"), obje);
    }

    public static <T> List<T> leerDatos(Class<T> class1)
            throws StreamReadException, DatabindException, IOException {

        List<T> list = new ArrayList<T>();

        try {
            ObjectMapper mapeador = new ObjectMapper();
            Empleado persona = mapeador.readValue(new File("datos.json"), Empleado.class);

            System.out.println(persona.getNombre());
            System.out.println(persona.getApellido());
            System.out.println(persona.getIdentificacion());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}