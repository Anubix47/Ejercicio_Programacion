package polinomio_cuarto_grado;
/*
 * @Raidel Delgado Rodriguez
 */

public class Potencia_cuadrada {
    private int x;//Variable a evaluar

    public Potencia_cuadrada(int x) {
        this.x = x;
    }

    //Resultado potencia cuadrada
    public int getPotencia_cuadrada() {
        return 2 * (int)Math.pow(x,2);
    }
}
