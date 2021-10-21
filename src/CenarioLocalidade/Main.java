package CenarioLocalidade;

public class Main {
    public static void main(String[] args) {
        LocalidadeBrasilFactory localidadeBrasil = new LocalidadeBrasilFactory();
        IData dataBrasil = localidadeBrasil.getData("setembro",1, 2000);
        IMoeda moedaBrasil = localidadeBrasil.getMoeda(100);
        dataBrasil.exibe();
        moedaBrasil.exibe();

        LocalidadeEUAFactory localidadeEUA = new LocalidadeEUAFactory();
        IData dataEUA = localidadeEUA.getData("september",1, 2000);
        IMoeda moedaEUA = localidadeEUA.getMoeda(100);
        dataEUA.exibe();
        moedaEUA.exibe();
    }
}
