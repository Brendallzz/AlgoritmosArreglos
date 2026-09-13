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
}
