
package Ecuaciones_lineales.JACOBI;

// Implementacion del metodo iterativo de Jacobi
public class MetodoJacobi {

    // Calcula el error maximo entre dos iteraciones
    public static double calcularError(double[] anterior, double[] actual) {
        double error = 0;

        for (int i = 0; i < actual.length; i++) {
            double diferencia = Math.abs(actual[i] - anterior[i]);

            if (diferencia > error) {
                error = diferencia;
            }
        }

        return error;
    }

    // Resuelve el sistema utilizando Jacobi
    public static double[] jacobi(double[][] A, double[] b,
            double[] xInicial, double tol, int maxIter) {

        int n = xInicial.length;
        double[] x = xInicial.clone();
        double[] xNuevo = new double[n];

        for (int iter = 0; iter < maxIter; iter++) {

            for (int i = 0; i < n; i++) {
                double suma = b[i];

                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j];
                    }
                }

                xNuevo[i] = suma / A[i][i];
            }

            double error = calcularError(x, xNuevo);

            System.out.printf(
                "Jacobi - Iteracion %d: x=%.6f, y=%.6f, z=%.6f, Error=%.8f%n",
                iter + 1, xNuevo[0], xNuevo[1], xNuevo[2], error
            );

            if (error < tol) {
                return xNuevo.clone();
            }

            x = xNuevo.clone();
        }

        return x;
    }
}
