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
