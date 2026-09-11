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
public class Nivel2 {

    public void algoritmo7() {

        char[] letras = {'a', 'b', 'e', 'r', 'i', 's', 'o', 'p', 'u'};

        int vocales = 0;

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] == 'a') {
                vocales++;
            }

            if (letras[i] == 'e') {
                vocales++;
            }

            if (letras[i] == 'i') {
                vocales++;
            }

            if (letras[i] == 'o') {
                vocales++;
            }

            if (letras[i] == 'u') {
                vocales++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Cantidad de vocales: " + vocales);
    }

    public void algoritmo8() {

        int[] numeros = new int[15];

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Ingrese el número " + (i + 1))
            );
        }

        for (int i = 0; i < numeros.length; i++) {

            if (i % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Suma de índices pares: " + sumaPares
                + "\nSuma de índices impares: " + sumaImpares
        );
    }

}
