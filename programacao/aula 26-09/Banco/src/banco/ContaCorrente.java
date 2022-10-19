
package banco;

public class ContaCorrente extends Conta {
    public void depositocorrente(double deposito){
        deposito = deposito + 1;
        setTotalcredito(deposito + this.getTotalcredito());
}
}
