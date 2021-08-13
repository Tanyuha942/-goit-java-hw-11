package com.goit.homework.Task1;

public class RunTimerFixer {

  public static void main(String[] args) {
    /*
        Задание#1
        Напишите программу, которая каждую секунду отображает на экране данные о времени, прошедшем от начала сессии (запуска программы).
        Другой ее поток выводит каждые 5 секунд сообщение  "Прошло 5 секунд".
        Предусмотрите возможность ежесекундного оповещения потока, воспроизводящего сообщение, потоком, отсчитывающим время.
    */

    System.out.print("Задание#1 \n--=====Start program=====--\n\n");
    TimerFixer timerFixer = new TimerFixer();

    for (int i = 1; ; i++) {
      timerFixer.timerStart.run();
      if (i % 5 == 0) {
        timerFixer.fiveSecondFixer.run();
      }
    }
  }
}