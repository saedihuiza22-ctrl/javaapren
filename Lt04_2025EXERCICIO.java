/*
 exercicio 04
 */
package lt04_2025exercicio;

import javax.swing.JOptionPane;
public class Lt04_2025EXERCICIO {
    public static void main(String[]args){
        double temp_celsius, escala;
        temp_celsius= Double.parseDouble(JOptionPane.showInputDialog("digite a temperatura de celsius:"));
        
        //processamento de dados 
          escala=(9*temp_celsius+160)/5;
          
          // saida de dados 
          System.out.println("a temperatura em fahrenheit e:"+escala);

    
    }
    
}
