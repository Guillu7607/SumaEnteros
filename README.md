# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para procesar secuencias numéricas interactivas. El objetivo principal de este ejercicio es implementar un bucle condicional de tipo "bucle con centinela", donde la aplicación acumula valores aritméticos de manera indeterminada y detiene su ejecución inmediatamente cuando el usuario introduce un valor de ruptura específico (el número cero).

## Características
Estrategia del Valor Centinela: Utiliza el número 0 como una señal de parada o bandera para romper la condición lógica del bucle (continuar = false) de manera controlada.

Patrón Acumulador y Contador: Implementa dos de los patrones algorítmicos más clásicos en programación: un acumulador matemático (suma += num) y un contador incremental iterativo (contador++).

Control de Flujo Indeterminado: Emplea un bucle while(continuar) ideal para escenarios donde no se conoce de antemano cuántos datos decidirá introducir el usuario por teclado.

Separación de la Señal de Salida: Utiliza una estructura condicional if-else para garantizar que el número centinela (0) no altere las estadísticas finales, evitando que se contabilice como un número procesado.
