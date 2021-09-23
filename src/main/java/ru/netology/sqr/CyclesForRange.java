package ru.netology.sqr;

public class CyclesForRange {
    public static void main(String[] args) {
        int count = 0;
        int a = 10;
        int b = 99;
        int c = 200;
        int d = 300;
        for (int i = a; i <= b; i++) {
            if (i * i>= c & i * i<=d){
              count++;
            }

            }
        System.out.println(count);
        }

}