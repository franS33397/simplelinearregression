/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelinearregression;


/**
 *
 * @author Fran33
 */


class Datos{

    /*int[] datosX = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518}; 
    int[] datosY = {23, 26, 30, 34, 43, 48, 52, 57, 58}; */
    int[] datosX = {1,2,3,4,5,6,7,8,9};
    int[] datosY = {3,6,9,12,15,18,21,24,27};


    public void imprime(){
        /*System.out.println(" _____________________________\n" +
                            "| A\u00f1os | Ventas | Publicidad |\n" +
                            "|      |        |            |\n" +
                            "| 1    | 651    | 23         |\n" +
                            "|      |        |            |\n" +
                            "| 2    | 856    | 26         |\n" +
                            "|      |        |            |\n" +
                            "| 4    | 1063   | 34         |\n" +
                            "|      |        |            |\n" +
                            "| 5    | 1190   | 43         |\n" +
                            "|      |        |            |\n" +
                            "| 6    | 1298   | 48         |\n" +
                            "|      |        |            |\n" +
                            "| 7    | 1421   | 52         |\n" +
                            "|      |        |            |\n" +
                            "| 8    | 1440   | 57         |\n" +
                            "|      |        |            |\n" +
                            "| 9    | 1518   | 58         |\n" +
                            "------------------------------");*/
            System.out.println(" _____________________________\n" +
            "| A\u00f1os | Ventas | Publicidad |\n" +
            "|      |        |            |\n" );
    for(int i=0;i<datosX.length;i++)    //length is the property of the array  
        System.out.println("|"+i+"      |"+datosX[i]+"      |"+datosY[i]+"      |");    
    } 
}


