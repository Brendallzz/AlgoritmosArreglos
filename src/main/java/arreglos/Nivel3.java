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
public class Nivel3 {

    public void algoritmo11() {

        int[] numeros = new int[12];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite el numero " + (i + 1))
            );
        }

        int buscar = Integer.parseInt(
                JOptionPane.showInputDialog("Digite el numero que quiere buscar")
        );

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null, "El numero aparece " + contador + " veces");
    }

    public void algoritmo12() {

        char[] letras = {'a', 'b', 'e', 'r', '5', '#', 'i'};

        int vocales = 0;
        int consonantes = 0;
        int otros = 0;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'a') {
                vocales++;
            } else if (letras[i] == 'e') {
                vocales++;
            } else if (letras[i] == 'i') {
                vocales++;
            } else if (letras[i] == 'o') {
                vocales++;
            } else if (letras[i] == 'u') {
                vocales++;
            } else if (letras[i] == 'b') {
                consonantes++;
            } else if (letras[i] == 'r') {
                consonantes++;
            } else {
                otros++;
            }

        }

        JOptionPane.showMessageDialog(null,
                "Vocales: " + vocales
                + "\nConsonantes: " + consonantes
                + "\nOtros: " + otros);
    }

}
