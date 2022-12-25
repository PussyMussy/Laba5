package Lr5.example3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число 1");
        int int1 = id.nextInt();
        System.out.println("Введите число 2");
        int int2 = id.nextInt();
        task3 task31 = new task3();
        task3 task32 = new task3(int1);
        task3 task33 = new task3(int1,int2);
    }}