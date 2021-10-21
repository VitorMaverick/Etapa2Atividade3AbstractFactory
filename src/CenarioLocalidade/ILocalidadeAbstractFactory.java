package CenarioLocalidade;

public interface ILocalidadeAbstractFactory {
    IMoeda getMoeda(double valor);
    IData getData(String mes, int dia, int ano);

}
