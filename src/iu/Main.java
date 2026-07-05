package iu;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        GestorServicios gs = new GestorServicios();


        gs.pruebaSemana_7(); //carga datos pre-guardados
        List<ServicioTuristico> lista = gs.obtenerLista(); //obtiene una copia de la lista de GestorServicios


        System.out.println("\n\n----lista desde main----");
        for (ServicioTuristico aux1:lista){ //recorre lista copiada
            contador++;
            System.out.print(contador+".-");
            aux1.mostrarInformacion(); //muestra informacion con poliformismo
        }


    }
}