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
public class Nivel5 {

    public void algoritmo19() {

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite un numero")
            );
        }

        int desordenados = 0;

        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] > numeros[i + 1]) {

                desordenados++;
            }
        }

        if (desordenados == 0) {

            JOptionPane.showMessageDialog(null, "El arreglo esta ordenado");

        } else {

            JOptionPane.showMessageDialog(null, "El arreglo no esta ordenado");
        }
    }

    public void algoritmo20() {

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite un numero"));
        }

        int diferentes = 0;

        for (int i = 0; i < numeros.length / 2; i++) {

            if (numeros[i] != numeros[numeros.length - 1 - i]) {

                diferentes++;
            }
        }

        if (diferentes == 0) {

            JOptionPane.showMessageDialog(null, "El arreglo es capicua");

        } else {

            JOptionPane.showMessageDialog(null, "El arreglo no es capicua");
        }
    }
public void algoritmo17(){

int[] arreglo1 = {2, 4, 6, 8, 10};

int[] arreglo2 = {1, 3, 5, 7, 9};

int[] arreglo3 = new int[arreglo1.length];

String resultado = "";

for(int i = 0; i < arreglo1.length; i++){

arreglo3[i] = arreglo1[i] + arreglo2[i];

resultado = resultado + arreglo3[i] + " ";
}

JOptionPane.showMessageDialog(null,

                 "Resultado de las sumas: " + resultado

                             );
}


public void algoritmo18(){

double[] precios1 = {1200.50, 2500.00, 875.25, 3100.75, 1500.00};

double[] precios2 = {1000.00, 2750.50, 900.25, 3000.00, 1800.00};

double[] diferencias = new double[precios1.length];

double suma = 0;

String resultado = "";

for(int i = 0; i < precios1.length; i++){

diferencias[i] = Math.abs(precios1[i] - precios2[i]);

suma = suma + diferencias[i];

resultado = resultado
          + String.format("%.2f", diferencias[i]) + " ";
}

double promedio = suma / diferencias.length;

JOptionPane.showMessageDialog(null,

               "Diferencias: " + resultado
               + "\nPromedio de diferencias: "
               + String.format("%.2f", promedio)

                             );
}
}
