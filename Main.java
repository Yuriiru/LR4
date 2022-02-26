package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов в массиве ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        while (a<=0) {
            System.out.print("Вы ввели отрицательное или 0 кол-во элементов, введите заново ");
            a = in.nextInt();
        }

        int [] num = new int [a];
        System.out.println();
        for (int i = 0; i<a;i++){
            int c = i+1;
            System.out.println("Введите значение " + c + "-ого элемента");
            num[i] = in.nextInt();
        }

        float min = num[0];
        for(int i = 1; i < num.length; i++){
            if(min>num[i])
                min = num[i];
        }
        System.out.println("Минимальное значение массива: " + min);

        float sum = 0;
        for (int i =0; i < num.length; i++){
            sum += num[i];
    }
        System.out.println(("Среднее значение элементов массива: " + sum / num.length));
}
}

