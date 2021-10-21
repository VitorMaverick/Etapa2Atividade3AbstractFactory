package CenarioLocalidade;

public class MoedaEUA implements IMoeda{
    double valor;

    public MoedaEUA(double valor) {
        this.valor = valor;
    }
    public void exibe() {
        System.out.println("$" + valor);
    }

}
