package CenarioLocalidade;

public class MoedaBrasil implements IMoeda{
    double valor;

    public MoedaBrasil(double valor) {
        this.valor = valor;
    }

    public void exibe() {
        System.out.println("R$" + valor);
    }
}
