package model;

public class ExcursionCultural extends ServicioTuristico{
    private String lugarHistorico;


    //constructores
    public ExcursionCultural() {
        super();
        this.lugarHistorico = "SINLUGARHISTORICO";
    }

    public ExcursionCultural(String nombre, Double horas, String lugarHistorico) {
        super(nombre, horas);
        this.lugarHistorico = lugarHistorico;
    }

    //sets y gets
    public String getLugarHistorico() {return lugarHistorico;}
    public void setLugarHistorico(String lugarHistorico) {this.lugarHistorico = lugarHistorico;}


    //metodo toString


    @Override
    public String toString() {
        return "ExcursionCultural{" +super.toString()+
                "lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }
}
