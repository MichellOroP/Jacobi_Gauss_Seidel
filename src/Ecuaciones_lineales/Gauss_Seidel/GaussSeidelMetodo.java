
package Ecuaciones_lineales.Gauss_Seidel;

// Importa la funcion calcularError del metodo Jacobi
import static Ecuaciones_lineales.JACOBI.MetodoJacobi.calcularError;

public class GaussSeidelMetodo {

    public static double[] gaussSeidel(double[][] A, double[] b,
            double[] xInicial, double tol, int maxIter) {

        int n = xInicial.length;
        double[] x = xInicial.clone();
        // Un solo vector que evoluciona al instante

        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone();
            // Respaldamos el estado anterior para el error

            for (int i = 0; i < n; i++) {
                double suma = b[i];
                // Arranca con el termino independiente b_i

                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j];
                    }
                }

                // Actualiza inmediatamente el valor
                x[i] = suma / A[i][i];
            }

            double error = calcularError(xAnt, x);

            System.out.printf(
                "Gauss-Seidel - Iteracion %d: x=%.6f, y=%.6f, z=%.6f, Error=%.8f%n",
                iter + 1, x[0], x[1], x[2], error
            );

            // Comprueba si se alcanza la tolerancia
            if (error < tol) {
                return x;
            }
        }

        return x;
    }
}
