package polinomio_cuarto_grado;
/*
 * @Roberto Manuel Garcia Rodriguez
 */

public class Potencia_cuarta {
    private int x;

    public Potencia_cuarta(int x) {
        this.x = x; //Variable a evaluar
    }

    //resultado de la potencia cuarta
    public int getPotencia_cuarta() {
        return (int)Math.pow(x,4);
    }
}
