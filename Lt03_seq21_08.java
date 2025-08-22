/*
 3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */

import javax.swing.JOptionPane;
public class Lt03_seq21_08 {
    public static void main (String[]args){
        int base, altura, area;
        base= Integer.parseInt(JOptionPane.showInputDialog("digite o valor da base:"));
           altura= Integer.parseInt(JOptionPane.showInputDialog("digite o valor da altura:"));
           
           //processamento de dados 
           area= (base*altura)/2;
           
           //saida de dados 
           System.out.println("a area de um triangulo e"+area);


    }
    
}
