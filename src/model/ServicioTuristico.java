package model;

public class ServicioTuristico {
    private String nombre;
    private Double horas;



    public ServicioTuristico(){
        this("SINNOMBRE",0.0);
    }


    public ServicioTuristico(String nombre, Double horas) {
        this.nombre = nombre;
        this.horas = horas;
    }



}
