package CenarioLocalidade;

public class DataEUA implements IData{
    int dia, ano;
    String mes;

    public DataEUA(int dia, int ano, String mes) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
    }
    public void exibe() {
        System.out.println(mes + " " + dia + ", " + ano);
    }
}
