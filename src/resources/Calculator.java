package resources;

import views.Calculadora_JFrame;

public class Calculator {

    private final Calculadora_JFrame vistaCalculadora;
    private boolean ejecutado = false;
    private Double num1, num2 = 0d;
    private String signo;

    public Calculator(Calculadora_JFrame vistaCalculadora) {
        this.vistaCalculadora = vistaCalculadora;
    }

    public void agregarSigno(String signo) {
        String resultado = vistaCalculadora.lbl_resultado.getText();
        String operacion = vistaCalculadora.lbl_tablero.getText();
        if (operacion.length() > 0) {
            if (contieneSigno(operacion) && !ejecutado) {
                if (ultimoCharEsDigito(operacion)) {
                    operar(this.signo);
                    vistaCalculadora.lbl_tablero.setText(operacion + signo);
                } else if (!ultimoCharEsDigito(operacion)) {
                    vistaCalculadora.lbl_tablero.setText(operacion.substring(0, operacion.length() - 1) + signo);
                }
            } else {
                if (!resultado.isEmpty()) {
                    num1 = Double.parseDouble(resultado);
                }

                vistaCalculadora.lbl_tablero.setText(operacion + signo);
                vistaCalculadora.lbl_resultado.setText("");
                ejecutado = false;
            }
            this.signo = signo;
            vistaCalculadora.btn_borrar.setEnabled(false);
        }

    }

    public void operar(String signo) {
        String resultado = vistaCalculadora.lbl_resultado.getText();
        if (!resultado.isEmpty()) {
            num2 = Double.parseDouble(resultado);
        }

        switch (signo) {
            case "+" ->
                num1 += num2;
            case "-" ->
                num1 -= num2;
            case "*" ->
                num1 *= num2;
            case "/" ->
                num1 /= num2;
        }
        vistaCalculadora.lbl_resultado.setText("");
        vistaCalculadora.lbl_mostrar.setText(num1 % 1 != 0 ? num1.toString() : num1.intValue() + "");

    }

    public void limpiar() {
        vistaCalculadora.lbl_mostrar.setText("");
        vistaCalculadora.lbl_resultado.setText("");
        vistaCalculadora.lbl_tablero.setText("");
        num1 = 0d;
        num2 = 0d;
    }

    public void igualAccionado() {
        String tablero = vistaCalculadora.lbl_tablero.getText();
        if (ultimoCharEsDigito(tablero)) {
            operar(signo);
            ejecutado = true;
        } else {
            vistaCalculadora.lbl_mostrar.setText(num1 % 1 != 0 ? num1.toString() : num1.intValue() + "");
        }
    }

    private boolean ultimoCharEsDigito(String texto) {
        return Character.isDigit(texto.charAt(texto.length() - 1));
    }

    private boolean contieneSigno(String text) {
        return text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/");
    }

}
