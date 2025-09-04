
/*
funcao recursiva
 */
import javax.swing.JOptionPane;
public class Funcorecursiva {
    public static void main(String args[]){
        int num=0;
        num=Integer.parseInt(JOptionPane.showInputDialog("digite o numero:"));
      
        JOptionPane.showMessageDialog(null,"a serie e "+FFAT(num));
    
    }
    static int FFAT(int n){
        int FAT;
        if (n>1){
            FAT=n*FFAT(n-1);
            
            return FAT;
        }
        else return n;
        }
    }
  
   
    
        
    
    








    
