package Lr5.example6;
public class Main {
        public static void main(String[] args) {
            //конструктор с 2-я аргументами
            task6 task6 = new task6(2, 5);
            task6.PrintInt();
            //конструктор с 1-м аргументом
            task6 task61= new task6(1);
            task61.PrintInt();
            //метод с 2-я аргументами
            task6.SetInt(3, 15);
            task6.PrintInt();
            //метод с 1-м аргументом
            task6.SetInt(-9);
            task6.PrintInt();
        }
    }
