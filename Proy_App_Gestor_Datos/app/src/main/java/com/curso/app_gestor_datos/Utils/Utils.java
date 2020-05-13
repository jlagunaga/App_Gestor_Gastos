package com.curso.app_gestor_datos.Utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<String> filtroPeriodo(){
        return new ArrayList<String>(){{
            add("Resumen 3 Meses");
            add("Resumen 6 Meses");
            add("Resumen 1 Año");
        }};
    }

}// fin de Clase
