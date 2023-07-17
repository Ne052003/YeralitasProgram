package recursos;

import vistas.*;

public class Execute {

    public static void main(String[] args) {
        Inicio_JFrame inicio = new Inicio_JFrame();
        inicio.setVisible(true);

        Calculadora_JFrame calculadora= Calculadora_JFrame.getCalculadora();
        calculadora.setVisible(true);

    }

}
