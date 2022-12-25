package Lr5.example5;

public class Main {

        public static void main(String[] args) {
            task5 task5 = new task5(21);
            System.out.println("Число = " + task5.PrintInt());
            task5.Set(15);
            System.out.println("Число = " + task5.PrintInt());
            task5.Set(125);
            System.out.println("Число = " + task5.PrintInt());
            task5.Set(-15);
            System.out.println("Число = " + task5.PrintInt());
            task5.Set();
            System.out.println("Число = " + task5.PrintInt());
        }
}
