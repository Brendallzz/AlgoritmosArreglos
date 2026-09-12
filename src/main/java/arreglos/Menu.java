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
    }
}