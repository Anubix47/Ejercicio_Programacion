package polinomio_cuarto_grado;
/*
 *@Otto Cristobo López
 */

public class Potencia_cubica {
    private int x;

    public Potencia_cubica(int x) {
        this.x = x;//Variable a evaluar
    }

    //resultado potencia cubica
    public int getPotencia_cubica() {
        return -3 *(int)Math.pow(x,3);
    }
}
