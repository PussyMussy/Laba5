package Lr5.example6;
public class task6 {
        private static int min;
        private static int max;
        static void SetInt(int num1, int num2) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(num1, min),num2);
            max = Math.max(Math.max(num1, max),num2);
        }
        static void SetInt(int num) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

    task6(int num1, int num2) {
            System.out.println("Конструктор task6() c 2-я аргументами");
            min = Math.min(num1,num2);
            max = Math.max(num1,num2);
        }

    task6(int num) {
            System.out.println("Конструктор task6() c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
