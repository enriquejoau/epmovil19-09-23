package com.example.examen.Utils;

public class Apis {

    public static  final String URL_001="http://192.168.30:8080";

    public static PersonaService getPersonaService(){
        return Cliente.getClientes(URL_001).create(PersonaService.class);
    }

}
