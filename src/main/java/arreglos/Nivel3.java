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

public void algoritmo9(){

int[] numeros = new int[10];

   for (int i = 0; i < numeros.length; i++){
     numeros[i] = Integer.parseInt( 
                 JOptionPane.showInputDialog(null,
                  "Ingrese numero " + (i + 1)  
                                              )
                        );


}
int mayor = numeros[0];
int menor = numeros[0];

for(int i = 1; i < numeros.length; i++){

 if(numeros[i] > mayor){

mayor = numeros[i];
}
if(numeros[i] < menor ){

menor = numeros[i];
}
}

JOptionPane.showMessageDialog(null,

                "Numero mayor " + mayor  
                + "\nNumero menor " + menor

                );
}


public void algoritmo10(){

int[] numeros = new int[10];

for(int i = 0; i < numeros.length; i++){

numeros[i] = Integer.parseInt(
            JOptionPane.showInputDialog(null,
                  "Ingrese numero " + (i + 1)
                                       )
                              );
}

int numeroBuscar = Integer.parseInt(
                  JOptionPane.showInputDialog(null,
                         "Ingrese el numero que desea buscar"
                                              )
                                    );

int posicion = -1;

for(int i = 0; i < numeros.length; i++){

if(numeros[i] == numeroBuscar){

posicion = i;

break;
}
}

JOptionPane.showMessageDialog(null,

                  "Primera posicion encontrada: " + posicion

                             );
}
}