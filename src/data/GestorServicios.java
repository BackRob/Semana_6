package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;

public class GestorServicios {
    private final ArrayList<ServicioTuristico> eCList = new ArrayList<>();
    private final ArrayList<PaseoLacustre> pLList = new ArrayList<>();
    private final ArrayList<RutaGastronomica> rGList = new ArrayList<>();

    public GestorServicios() {}

    //metodos para agregar con y sin datos ExcursionCultural
    public void agregarEC(){
        eCList.add(new ExcursionCultural());
    }
    public void agregarEC(String nombre, Double horas,String lugarHistorico){
        eCList.add(new ExcursionCultural(nombre,horas,lugarHistorico));
    }

    //metodos para agregar con y sin datos PaseoLacustre
    public void agregarPL(){
        pLList.add(new PaseoLacustre());
    }
    public void agregarPL(String nombre,Double horas,String tipoEmbarcacion){
        pLList.add(new PaseoLacustre(nombre,horas,tipoEmbarcacion));
    }

    //metodos para agregar con y sin datos RutaGastronomica
    public void agregarRG(){
        rGList.add(new RutaGastronomica());
    }
    public void agregarRG(String nombre,Double horas,int numeroDeParadas){
        rGList.add(new RutaGastronomica(nombre,horas,numeroDeParadas));
    }


    //metodo para mostrar datos almacenados en memoria por consola
    public void mostrar(){
        ArrayList<ServicioTuristico> todaLista = new ArrayList<>();
        todaLista.addAll(eCList);
        todaLista.addAll(pLList);
        todaLista.addAll(rGList);
        int contador = 0;

        for(ServicioTuristico stListAux : todaLista){
            contador++;
            System.out.println(contador+".-"+stListAux);
        }
    }

    //metodo de prueba, crea 2 objetos y muestra

    public void pruebaSemana_6(){

        System.out.println("Servicios Turisticos registrados: ");
        agregarEC();
        agregarEC("tour Museo Bellas Artes",3.0,"Museo Bellas Artes");

        agregarPL();
        agregarPL("Paseo la barra",4.0,"Lancha");

        agregarRG();
        agregarRG("Ruta Chilena",6.0,3);

        mostrar();
    }

    //metodo para limpiar listas
    public void limpiarListas(){
        eCList.clear();
        pLList.clear();
        rGList.clear();
    }


}

