package livedes6quest8;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveDes6Quest8 {

    /**
     * Escrever um algoritmo que leia um valor X e calcule e mostre os 20 
     * primeiros termos da série: 
     *  1 1 1 1 .....
     *  X X 2 X 3 X 4
     */
    public static void main(String[] args) {
       int cont;
       double acSerie,x;
       acSerie = 0;
        DecimalFormat f= new DecimalFormat("0.0");
       x = Double.parseDouble(JOptionPane.
               showInputDialog("Informe o valor de X"));
       
       for (cont=1; cont<=20; cont++){
           acSerie = acSerie + 1.0/Math.pow(x,cont);
           
       }//fim do loop
       JOptionPane.showMessageDialog(null, "Resultado da Série: "
               +f.format(acSerie));
    }
    
}
