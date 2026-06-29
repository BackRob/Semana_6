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

    public String getNombre() {return nombre;}
    public Double getHoras() {return horas;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setHoras(Double horas) {this.horas = horas;}





    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", horas=" + horas+", ";
    }
}
