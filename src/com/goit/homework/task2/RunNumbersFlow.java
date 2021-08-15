package com.goit.homework.task2;

public class RunNumbersFlow {

    public static void main(String[] args) {
    /*
        Задание#2
        Напишите программу, которая выводит в консоль строку, состоящую из чисел от  1 до n, но с заменой некоторых значений:
        если число делится на 3 - вывести "fizz"
        если число делится на 5 - вывести "buzz"
        если число делится на 3 и на 5 - вывести "fizzbuzz"
        Например, для n = 15, ожидаемый результат: 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz.
        Программа должна быть многопоточной, работать с 4 потоками:
        Поток A вызывает fizz() чтобы проверить делимость на 3 и вывести fizz.
        Поток B вызывает buzz() чтобы проверить делимость на 5 и вывести buzz.
        Поток C вызывает fizzbuzz() чтобы проверить делимость на 3 и 5 и вывести fizzbuzz.
        Поток D вызывает number() чтобы вывести число.
    */

        System.out.print("Задание#2 \n--=====Start program=====--\n\n");
        Numbers numbers = new Numbers();
        numbers.numbers.run();
    }
}