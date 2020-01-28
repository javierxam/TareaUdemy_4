
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.ejercioudemy_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author xavi
 */
public class Tarea_4 {
    public static void main(String[] args)throws IOException {
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Proporciona el alto:");
    String altoString = reader.readLine();
    int alto = Integer.parseInt(altoString);
    
    System.out.println("Proporciona el ancho:");
    String anchoString = reader.readLine();
    int ancho = Integer.parseInt(anchoString);
    
    System.out.println("Area: "+(alto*ancho));
    System.out.println("Perimetro: "+((alto+ancho)*2));
  
     
}
}

