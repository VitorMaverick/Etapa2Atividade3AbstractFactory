package CenarioLocalidade;

public class LocalidadeBrasilFactory implements ILocalidadeAbstractFactory{
    @Override
    public IMoeda getMoeda(double valor) {
        return new MoedaBrasil(valor);
    }

    @Override
    public IData getData(String mes, int dia, int ano) {
        return new DataBrasil(dia,ano,mes);
    }
}
