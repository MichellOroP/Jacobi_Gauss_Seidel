
package Ecuaciones_lineales;

import java.util.Arrays;
import Ecuaciones_lineales.JACOBI.MetodoJacobi;
import Ecuaciones_lineales.Gauss_Seidel.GaussSeidelMetodo;

public class Main {

    public static void main(String[] args) {

        // Definicion del sistema
        double[][] A = DefSistema.obtenerMatriz();
        double[] b = DefSistema.obtenerVectorB();
        double[] xInicial = DefSistema.obtenerVectorInicial();
        double tol = DefSistema.obtenerTolerancia();
        int maxIter = DefSistema.obtenerMaxIteraciones();

        // Metodo de Jacobi
        System.out.println("===== METODO DE JACOBI =====");

        double[] resultadoJacobi = MetodoJacobi.jacobi(
            A, b, xInicial, tol, maxIter
        );

        System.out.println("Resultado Jacobi: "
            + Arrays.toString(resultadoJacobi));

        // Metodo de Gauss-Seidel
        System.out.println("\n===== METODO DE GAUSS-SEIDEL =====");

        double[] resultadoGauss = GaussSeidelMetodo.gaussSeidel(
            A, b, xInicial, tol, maxIter
        );

        System.out.println("Resultado Gauss-Seidel: "
            + Arrays.toString(resultadoGauss));
    }
}
