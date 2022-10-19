
package banco;

public class Contapoupanca extends Conta{
    public void retiradebito(double totaldebito){
        totaldebito = totaldebito - 0.25;
    }
    public void retiracredito(double totalcredito){
        totalcredito = totalcredito - 0.25;
    }
}
