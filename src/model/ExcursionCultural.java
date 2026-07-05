package model;

public class ExcursionCultural extends ServicioTuristico{
    private String lugarHistorico;


    //constructores

    public ExcursionCultural(ExcursionCultural excursionCultural) {
        this(excursionCultural.getNombre(), excursionCultural.getHoras(), excursionCultural.lugarHistorico);
    }
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


    //Poliformismo
    @Override
    public void mostrarInformacion(){
    System.out.println(this);
    }

    //poliformismo copia
    @Override
    public ExcursionCultural copiar(){
        return new ExcursionCultural(this);
    }

    //metodo toString
    @Override
    public String toString() {
        return "Excursion Cultural{" +super.toString()+
                "lugar Historico='" + lugarHistorico + '\'' +
                '}';
    }
}
