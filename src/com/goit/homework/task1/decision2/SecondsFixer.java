package com.goit.homework.task1.decision2;

public class SecondsFixer implements Runnable {

  TimerFixer timerFixer;

  SecondsFixer(TimerFixer timerFixer) {
    this.timerFixer = timerFixer;
  }

  @Override
  public void run() {
    for (int i = 1; ; i++) {
      System.out.println("Прошло 5 секунд...");
      timerFixer.print();
      try {
        Thread.sleep(5000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}