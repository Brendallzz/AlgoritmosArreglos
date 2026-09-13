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
public class Nivel4 {

    public void algoritmo15() {

        int[] numeros = {1, 2, 3, 4, 5};

        int ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0; i--) {

            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimo;

        String resultado = "";

        for (int i = 0; i < numeros.length; i++) {

            resultado += numeros[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public void algoritmo16() {

        int[] numeros = {10, 20, 30, 40, 50};

        int indice1 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite el primer indice"));

        int indice2 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite el segundo indice"));

        if (indice1 >= 0 && indice1 < numeros.length
                && indice2 >= 0 && indice2 < numeros.length) {

            int auxiliar = numeros[indice1];

            numeros[indice1] = numeros[indice2];

            numeros[indice2] = auxiliar;

            String resultado = "";

            for (int i = 0; i < numeros.length; i++) {

                resultado += numeros[i] + " ";
            }

            JOptionPane.showMessageDialog(null, resultado);

        } else {

            JOptionPane.showMessageDialog(null, "Indice incorrecto");
        }
    }
public void algoritmo13(){

int[] numeros = {10, 20, 30, 40, 50, 60};

String original = "";

for(int i = 0; i < numeros.length; i++){

original = original + numeros[i] + " ";
}

for(int i = 0; i < numeros.length / 2; i++){

int temporal = numeros[i];

numeros[i] = numeros[numeros.length - 1 - i];

numeros[numeros.length - 1 - i] = temporal;
}

String invertido = "";

for(int i = 0; i < numeros.length; i++){

invertido = invertido + numeros[i] + " ";
}

JOptionPane.showMessageDialog(null,

                "Arreglo original: " + original
                + "\nArreglo invertido: " + invertido

                             );
}


public void algoritmo14(){

int[] original = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

int[] copia = new int[original.length];

for(int i = 0; i < original.length; i++){

copia[i] = original[i];
}

copia[0] = 1000;

String arregloOriginal = "";
String arregloCopia = "";

for(int i = 0; i < original.length; i++){

arregloOriginal = arregloOriginal + original[i] + " ";

arregloCopia = arregloCopia + copia[i] + " ";
}

JOptionPane.showMessageDialog(null,

                "Arreglo original: " + arregloOriginal
                + "\nArreglo copia modificada: " + arregloCopia

                             );
}
}
