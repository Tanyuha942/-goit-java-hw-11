package com.goit.homework.task1.decision2;

public class StartTimingFixer {

  public static void main(String[] args) throws InterruptedException {

    TimerFixer timerFixer = new TimerFixer();
    TimerCounter timerCounter = new TimerCounter(timerFixer);
    SecondsFixer secondsFixer = new SecondsFixer(timerFixer);
    new Thread(timerCounter).start();
    Thread.sleep(5000);
    new Thread(secondsFixer).start();
  }
}