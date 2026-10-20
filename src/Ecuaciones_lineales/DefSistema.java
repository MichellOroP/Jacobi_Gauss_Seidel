
package Ecuaciones_lineales;

// Clase que define el sistema de ecuaciones lineales
public class DefSistema {

    // Matriz de coeficientes
    public static double[][] obtenerMatriz() {
        return new double[][] {
            {5, 1, 1},
            {1, 4, 1},
            {1, 2, 5}
        };
    }

    // Vector de terminos independientes
    public static double[] obtenerVectorB() {
        return new double[] {7, 6, 8};
    }

    // Vector inicial X(0)
    public static double[] obtenerVectorInicial() {
        return new double[] {0, 0, 0};
    }

    // Tolerancia de error
    public static double obtenerTolerancia() {
        return 0.0001;
    }

    // Numero maximo de iteraciones
    public static int obtenerMaxIteraciones() {
        return 100;
    }
}
