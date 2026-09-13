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

        JOptionPane.showMessageDialog(null, "Suma de indices pares: " + sumaPares
                + "\nSuma de indices impares: " + sumaImpares
        );
    }

public void algoritmo5(){

double[] numeros = new double[8]; 
double suma = 0;

for (int i = 0; i < numeros.length; i++){
    
        numeros[i] = Double.parseDouble(
        JOptionPane.showInputDialog(
                    "ingrese el numero" + (i + 1)
            )
        );
       
       suma = suma + numeros[i];
       }
    double promedio = suma / numeros.length;
   JOptionPane.showMessageDialog(
            null,
            "Promedio " + String.format("%.2f", promedio));
}


public void algoritmo6(){ 

boolean[] asistencia = new boolean[20];

int presentes = 0; //Ahora agregaremos solamente los contadores. Colócalos después del arreglo y antes del for
int ausentes = 0;

for (int i = 0; i < asistencia.length; i++){

    asistencia[i] = Boolean.parseBoolean(
            JOptionPane.showInputDialog(null,
                                    "¿asistio la persona? " + (i + 1) + "? Escriba true o false")
                                    );
        if(asistencia[i]){
          presentes++;
        }else{  
             ausentes++;
}
}
   double porcentaje = (presentes * 100.0) / asistencia.length;

        JOptionPane.showMessageDialog(
                null,
                "Presentes: " + presentes
                + "\nAusentes: " + ausentes
                + "\nPorcentaje de asistencia: "
                + String.format("%.2f", porcentaje) + "%"
);
}
}//finalgortimo
