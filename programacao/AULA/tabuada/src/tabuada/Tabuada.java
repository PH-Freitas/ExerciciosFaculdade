/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

/**
 *
 * @author 822161391
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        while(contador <= 10) {
            System.out.println("9x" + contador + " = " + (contador * 9));
            contador++;
        }
    }
    
}
