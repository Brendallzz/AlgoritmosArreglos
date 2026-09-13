package arreglos;

import javax.swing.JOptionPane;

public class Menu {

    public void MenuPrincipal() {

        JOptionPane.showMessageDialog(
                null,
                "Actividad de algoritmos con arreglos"
        );

        Nivel1 nivel1 = new Nivel1();
        Nivel2 nivel2 = new Nivel2();
        Nivel3 nivel3 = new Nivel3();
        Nivel4 nivel4 = new Nivel4();
        Nivel5 nivel5 = new Nivel5();

        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog("""
                        Actividad de algoritmos con arreglos

                        1. Nivel 1
                        2. Nivel 2
                        3. Nivel 3
                        4. Nivel 4
                        5. Nivel 5
                        """)
        );

        switch (opcion) {

             case 1:
        JOptionPane.showMessageDialog(null, "Nivel 1");
        nivel1.algoritmo1();
        nivel1.algoritmo2();
        nivel1.algoritmo3();
        nivel1.algoritmo4();
        break;

    case 2:
        JOptionPane.showMessageDialog(null, "Nivel 2");
        nivel2.algoritmo5();
        nivel2.algoritmo6();
        nivel2.algoritmo7();
        nivel2.algoritmo8();
        break;

    case 3:
        JOptionPane.showMessageDialog(null, "Nivel 3");
        nivel3.algoritmo9();
        nivel3.algoritmo10();
        nivel3.algoritmo11();
        nivel3.algoritmo12();
        break;

    case 4:
        JOptionPane.showMessageDialog(null, "Nivel 4");
        nivel4.algoritmo13();
        nivel4.algoritmo14();
        nivel4.algoritmo15();
        nivel4.algoritmo16();
        break;

    case 5:
        JOptionPane.showMessageDialog(null, "Nivel 5");
        nivel5.algoritmo17();
        nivel5.algoritmo18();
        nivel5.algoritmo19();
        nivel5.algoritmo20();
        break;

    default:
        JOptionPane.showMessageDialog(null, "Opción incorrecta");
        break;
}


    }
}
