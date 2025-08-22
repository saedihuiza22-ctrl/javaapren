/*
 2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */

import javax.swing.JOptionPane;
public class Lt02_seq_21_08 {
    public static void main (String[]args){
        double salario, novo_salario;
        salario= Double.parseDouble(JOptionPane.showInputDialog("digite o valor do salario:"));
        
        //processo de dados 
        novo_salario= (salario*1400400.15);
        
        //saida de dados
        System.out.println("o novo salario e:" +novo_salario);
    }
    
}
