package model;

public class ServicioTuristico {
    private String nombre;
    private Double horas;


    //Constructores

    public ServicioTuristico(ServicioTuristico servicioTuristico) {
        this(servicioTuristico.getNombre(), servicioTuristico.getHoras());
    }

    public ServicioTuristico(){
        this("SINNOMBRE",0.0);
    }

    public ServicioTuristico(String nombre, Double horas) {
        this.nombre = nombre;
        this.horas = horas;
    }



    public String getNombre() {return nombre;}
    public Double getHoras() {return horas;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setHoras(Double horas) {this.horas = horas;}

    //POLIFORMISMO
    public void mostrarInformacion(){}

    //copia con poliformismo
    public ServicioTuristico copiar(){
        return new ServicioTuristico(this);
    }


    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", horas=" + horas+", ";
    }
}
