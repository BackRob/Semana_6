package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

public class GestorServicios {

    private List<ServicioTuristico> servicios;


    private final ArrayList<ServicioTuristico> eCList = new ArrayList<>();
    private final ArrayList<PaseoLacustre> pLList = new ArrayList<>();
    private final ArrayList<RutaGastronomica> rGList = new ArrayList<>();

    public GestorServicios() {
        servicios = new ArrayList<>();
    }

    //Metodo aque agrega a la lista
    public void agregarST(ServicioTuristico sT){
        servicios.add(sT);
    }

    //metodo para mostrar datos almacenados en memoria por consola
    public void mostrar(){
        int contador = 0;

        for(ServicioTuristico listAux : servicios){
            contador++;
            System.out.println(contador+".-"+listAux);
        }
    }

    //metodo de prueba, crea 2 objetos y muestra

    public void pruebaSemana_7(){

        System.out.println("Servicios Turisticos cargados: ");
        agregarST(new ExcursionCultural("tour Museo Bellas Artes",3.0,"Museo Bellas Artes"));
        agregarST(new PaseoLacustre("Paseo la barra",4.0,"Lancha"));
        agregarST(new RutaGastronomica("Ruta Chilena",6.0,3));
        agregarST(new PaseoLacustre("Pesca Valparaiso",2.0,"Bote"));
        agregarST(new ExcursionCultural("Termas de Puyehue",5.0,"Volcan Puyehue"));
        mostrar();
    }

    //metodo para limpiar lista
    public void limpiarLista(){
        servicios.clear();
    }


    //metodo que retorna copia exacta de la lista en memoria
    public List<ServicioTuristico> obtenerLista() {
        List<ServicioTuristico> listaCopia = new ArrayList<>();
        for (ServicioTuristico aux:servicios){
            listaCopia.add(aux.copiar());
        }

        return listaCopia;
    }
}

