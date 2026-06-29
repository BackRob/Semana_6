package model;

public class PaseoLacustre extends ServicioTuristico{
    private String tipoEmbarcacion;


    //constructores
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


    @Override
    public String toString() {
        return "PaseoLacustre{" +super.toString()+
                "tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }
}
