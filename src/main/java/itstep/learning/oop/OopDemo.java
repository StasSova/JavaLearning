package itstep.learning.oop;

public class OopDemo {
    public static void main(String[] args) {
        new OopDemo().run();
    }

    public void run() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Result:");
        printMatrix(result);
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirst = firstMatrix.length;
        int colsFirst = firstMatrix[0].length;
        int colsSecond = secondMatrix[0].length;

        int[][] result = new int[rowsFirst][colsSecond];

        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsSecond; j++) {
                for (int k = 0; k < colsFirst; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return result;
    }
}

/*
 * ----------------- OOP -------------------
 * Объектно-ориентированное программирование (ООП) — это парадигма программирования, основанная на концепции объектов.
 * - Классы: шаблоны для создания объектов (экземпляров).
 * - Объекты: экземпляры классов, содержащие данные и методы.
 * - Инкапсуляция: скрытие внутренней реализации и предоставление интерфейса для взаимодействия.
 * - Наследование: создание новых классов на основе существующих.
 * - Полиморфизм: возможность объектов разных классов обрабатывать данные через один и тот же интерфейс.
 *
 * ----------------- PARADIGMA -------------------
 * Парадигма — это совокупность понятий, методов и принципов, которые определяют подход к решению задач
 * в определенной области.
 * В программировании парадигма определяет стиль и методологию написания кода.
 * Примеры парадигм:
 * - Объектно-ориентированное программирование (ООП)
 *   |- Прототипная: объекты создаются на основе других объектов (прототипов).
 *   |- Классовая: объекты создаются на основе классов.
 * - Функциональное программирование: акцент на вычислении функций и неизменяемости данных.
 * - Декларативное программирование: акцент на описание того, что должно быть сделано, а не как.
 *   |- логическая
 * - Императивное программирование: акцент на описание шагов, которые должны быть выполнены для достижения результата.
 *   |- процедурое: акцент на последовательности инструкций и процедур.
 */
