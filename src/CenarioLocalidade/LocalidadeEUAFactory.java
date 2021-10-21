package CenarioLocalidade;

public class LocalidadeEUAFactory implements ILocalidadeAbstractFactory{
    @Override
    public IMoeda getMoeda(double valor) {
        return new MoedaEUA(valor);
    }

    @Override
    public IData getData(String mes, int dia, int ano) {
        return new DataEUA(dia,ano,mes);
    }
}
