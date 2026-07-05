package model;

public class RutaGastronomica extends ServicioTuristico{
    private int numeroDeParadas;


    //constructores
    public RutaGastronomica(RutaGastronomica rutaGastronomica) {
        this(rutaGastronomica.getNombre(), rutaGastronomica.getHoras(), rutaGastronomica.numeroDeParadas);
    }

    public RutaGastronomica() {
        super();
        this.numeroDeParadas = 0;
    }

    public RutaGastronomica(String nombre, Double horas, int numeroDeParadas) {
        super(nombre, horas);
        this.numeroDeParadas = numeroDeParadas;
    }




    //sets y gets
    public int getNumeroDeParadas() {return numeroDeParadas;}
    public void setNumeroDeParadas(int numeroDeParadas) {this.numeroDeParadas = numeroDeParadas;}

    //Poliformismo
    @Override
    public void mostrarInformacion(){
        System.out.println(this);
    }

    //poliformismo para copiar
    @Override
    public RutaGastronomica copiar(){
        return new RutaGastronomica(this);
    }

    //metodo toString
    @Override
    public String toString() {
        return "Ruta gastronomica{" +super.toString()+
                "Numero de paradas=" + numeroDeParadas +
                '}';
    }
}
