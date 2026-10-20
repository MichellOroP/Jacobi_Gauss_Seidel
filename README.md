# Métodos de Jacobi y Gauss-Seidel

## 1. Descripción del proyecto

Este proyecto fue desarrollado en Java para la materia de Métodos Numéricos, Unidad 3.

Su objetivo es implementar los métodos iterativos de Jacobi y Gauss-Seidel para resolver sistemas de ecuaciones lineales mediante una arquitectura modular.

## 2. Lenguaje utilizado

- Java (JDK 21)
- Visual Studio Code
- GitHub para almacenar el código fuente

## 3. Estructura del proyecto

```text
src/
└── Ecuaciones_lineales/
    ├── DefSistema.java
    ├── Main.java
    ├── JACOBI/
    │   └── MetodoJacobi.java
    └── Gauss_Seidel/
        └── GaussSeidelMetodo.java
README.md
```

**Descripción de las clases:**

- **DefSistema.java:** Define la matriz de coeficientes, el vector de términos independientes, el vector inicial y los parámetros de ejecución.
- **MetodoJacobi.java:** Implementa el método iterativo de Jacobi y calcula el error entre iteraciones.
- **GaussSeidelMetodo.java:** Implementa el método de Gauss-Seidel y reutiliza la función de cálculo de error de Jacobi.
- **Main.java:** Ejecuta ambos métodos y muestra los resultados en consola.

## 4. Sistema de ecuaciones utilizado

Se resolvió el siguiente sistema:

```text
5x +  y +  z = 7
 x + 4y +  z = 6
 x + 2y + 5z = 8
```

Condiciones iniciales:

- Vector inicial: [0, 0, 0]
- Tolerancia: 0.0001

## 5. Compilación y ejecución

Para compilar el proyecto, abrir una terminal en la carpeta principal del repositorio y ejecutar:

```powershell
javac -d . src\Ecuaciones_lineales\DefSistema.java src\Ecuaciones_lineales\JACOBI\MetodoJacobi.java src\Ecuaciones_lineales\Gauss_Seidel\GaussSeidelMetodo.java src\Ecuaciones_lineales\Main.java
```

Para ejecutar:

```powershell
java Ecuaciones_lineales.Main
```

## 6. Resultados obtenidos

**Método de Jacobi**

```text
Iteracion 16:
x = 0.999987
y = 0.999985
z = 0.999983
Error = 0.00005232

Resultado Jacobi:
[0.9999869210370103, 0.9999847412109375, 0.9999825613848647]
```

**Método de Gauss-Seidel**

```text
Iteracion 6:
x = 0.999994
y = 1.000000
z = 1.000001
Error = 0.00007244

Resultado Gauss-Seidel:
[0.9999938115800001, 1.000000151955, 1.0000011769019999]
```

## 7. Comparación de los métodos

| Método | Iteraciones | Resultado aproximado |
|---|---|---|
| Jacobi | 16 | [1, 1, 1] |
| Gauss-Seidel | 6 | [1, 1, 1] |

Ambos métodos lograron aproximarse correctamente a la solución del sistema.

Gauss-Seidel necesitó menos iteraciones porque utiliza inmediatamente los valores actualizados durante cada iteración, mientras que Jacobi utiliza los valores de la iteración anterior.

## 8. Conclusión

Con esta práctica pude implementar y ejecutar los métodos de Jacobi y Gauss-Seidel utilizando programación modular en Java.

Al comparar los resultados, observé que ambos métodos convergieron a la solución aproximada [1, 1, 1]. Sin embargo, Gauss-Seidel fue más rápido para este sistema, ya que necesitó 6 iteraciones, mientras que Jacobi requirió 16.

También comprobé la importancia de organizar el código en diferentes clases y reutilizar funciones para facilitar su mantenimiento.
