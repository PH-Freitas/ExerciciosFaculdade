
package banco;

public class Conta {
    private double saldo;
    private double totaldebito;
    private double totalcredito;
    private double deposito;

    public double getDeposito() {
        return this.deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaldo() {
        this.saldo = (totalcredito - totaldebito);
        return this.saldo;
    }

    public double getTotaldebito() {
        return this.totaldebito;
    }

    public void setTotaldebito(double totaldebito) {
        this.totaldebito = totaldebito;
    }

    public double getTotalcredito() {
        return this.totalcredito;
    }

    public void setTotalcredito(double totalcredito) {
        this.totalcredito = totalcredito;
    }
    
}
