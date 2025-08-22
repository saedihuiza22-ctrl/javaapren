 /*
exercicio 1 
*/

import javax.swing.JOptionPane;
public class Prj14_08_25 {
     public static void main(String[] args) {
         
     int lado, area;
     lado= Integer.parseInt(JOptionPane.showInputDialog("digite o valor do lado:"));
     
     //processamento de dados 
     area= lado*lado;
     
     //saida de resultado 
     System.out.println("lado da area e:"+area);
         
    }
    
}
