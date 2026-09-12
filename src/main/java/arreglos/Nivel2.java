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