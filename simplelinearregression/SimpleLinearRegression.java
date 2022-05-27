/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelinearregression;
import javax.swing.*;


/**
 *
 * @author Fran33
 */
class SimpleLinearRegression{
    
    double a, b;

    double Sum = 0, x, y;
    double Sum2 = 0, promedioX = 0, promedioY = 0, Sum3 = 0, Sum4 = 0;
    double publicidad=0;
    
    private Double redondeo(Double n) {
        return Math.rint(n * 10000) / 10000;
    }
    
    public void formula(int[] datosX, int[] datosY){
        

        
        for (int i = 0; i < datosX.length; i++) {
            Sum = Sum + datosX[i];
            Sum2 = Sum2 + datosY[i];
        }
        promedioX = Sum / datosX.length;
        promedioY = Sum2 / datosX.length;
        for (int i = 0; i < datosX.length; i++) {
            x = datosX[i];
            y = datosY[i];

            Sum3 = Sum3 + (x - promedioX) * (y - promedioY);
            Sum4 = Sum4 + (x - promedioX) * (x - promedioX);
        }
        b = Sum3 / Sum4;
        a = promedioY - b * promedioX;
        a = redondeo(a);
        b = redondeo(b);

        System.out.println("");
        System.out.println("ŷ = b0 + b1X...\n");
        System.out.println("b0 = " + a + "\n");
        System.out.println("b1 = " + b + "\n"); 
        System.out.println("ŷ = " + b + "x + " + a);  
        int fieldX = Integer.parseInt(JOptionPane.showInputDialog("Ventas: "));
        
        publicidad = (b * fieldX) + (a);
        System.out.println("\n");
        System.out.println("Publicidad = " + b + "x + " + a);
        System.out.println("Publicidad= " + publicidad);
        

    }

    
}
