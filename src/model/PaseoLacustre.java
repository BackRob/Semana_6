package model;

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;


    //constructores

    public PaseoLacustre(PaseoLacustre paseoLacustre) {
        this(paseoLacustre.getNombre(),paseoLacustre.getHoras(),paseoLacustre.getTipoEmbarcacion());
    }

    public PaseoLacustre() {
        super();
        this.tipoEmbarcacion = "SINTIPOEMBARCACION";
    }

    public PaseoLacustre(String nombre, Double horas, String tipoEmbarcacion) {
        super(nombre, horas);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }




    //sets y gets
    public String getTipoEmbarcacion() {return tipoEmbarcacion;}
    public void setTipoEmbarcacion(String tipoEmbarcacion) {this.tipoEmbarcacion = tipoEmbarcacion;}

    //Poliformismo para mostrarIformacion
    @Override
    public void mostrarInformacion(){
        System.out.println(this);
    }

    //Poliformismo para copiar
    @Override
    public PaseoLacustre copiar(){
        return new PaseoLacustre(this);
    }

    @Override
    public String toString() {
        return "Paseo Lacustre{" +super.toString()+
                "Tipo de embarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }
}
