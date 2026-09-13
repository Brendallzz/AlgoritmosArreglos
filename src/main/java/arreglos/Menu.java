package arreglos;

import javax.swing.JOptionPane;

public class Menu {

    public void MenuPrincipal() {

        JOptionPane.showMessageDialog(
                null,
                "Actividad de algoritmos con arreglos"
        );
Nivel1 nivel1 = new Nivel1();

nivel1.algoritmo1();
nivel1.algoritmo2();

Nivel2 nivel2 = new Nivel2();

nivel2.algoritmo5();
nivel2.algoritmo6();

Nivel3 nivel3 = new Nivel3();

nivel3.algoritmo9();
nivel3.algoritmo10();

Nivel4 nivel4 = new Nivel4();

nivel4.algoritmo13();
nivel4.algoritmo14();

Nivel5 nivel5 = new Nivel5();

nivel5.algoritmo17();
nivel5.algoritmo18();

    }
}