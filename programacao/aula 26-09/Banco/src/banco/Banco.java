
package banco;

public class Banco {

    public static void main(String[] args) {
    ContaCorrente cliente = new ContaCorrente();
    cliente.setTotalcredito(200);
    cliente.setTotaldebito(120);
    cliente.depositocorrente(10);
    System.out.println(cliente.getSaldo());
    
    Contapoupanca cliente1 = new Contapoupanca();
    }
    
}
