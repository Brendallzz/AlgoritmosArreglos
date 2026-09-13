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
}
