/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author brendallnuevo
 */
public class Nivel1 {

    public void algoritmo3() {

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el número " + (i + 1))
            );
        }

        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public void algoritmo4() {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra");

        char[] letras = palabra.toCharArray();

        String resultado = "";

        for (int i = 0; i < letras.length; i++) {
            resultado += letras[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
public void algoritmo1(){

double[] numeros = {3.45, 5.55, 6.76, 2.34};

JOptionPane.showMessageDialog(null,
"longitud del arreglo: " + numeros.length 
+ "\nÚltimo elemento: " + numeros[numeros.length - 1]


);

}

public void algoritmo2(){

    boolean[] estados = {true, false, true, false, false, true};

    for (int i = 0; i < estados.length; i++){
        JOptionPane.showMessageDialog(
                            null, 
                            "posicion " + i + ": " + estados[i] 
);
}
}
}
