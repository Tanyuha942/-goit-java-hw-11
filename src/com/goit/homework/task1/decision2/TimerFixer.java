package com.goit.homework.task1.decision2;

public class TimerFixer {

  private int timer = 1;

  public synchronized void count() {
    while (timer<=5){
      timer++;
    }
    notify();
  }

  public synchronized void print() {
    while (timer % 5 == 0) {
      timer++;
      System.out.println(timer);
      try {
        wait();
      }
      catch (InterruptedException ignored) {
      }
    }
    notify();
  }
}