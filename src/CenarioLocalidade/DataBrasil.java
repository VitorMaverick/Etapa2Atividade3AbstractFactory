package CenarioLocalidade;

public class DataBrasil implements IData{
    int dia, ano;
    String mes;

    public DataBrasil(int dia, int ano, String mes) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
    }
    public void exibe() {
        System.out.println(dia + " de " + mes + " de " + ano);
    }
}


