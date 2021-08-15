package com.goit.homework.task1.decision2;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerCounter implements Runnable {

  TimerFixer timerFixer;

  TimerCounter(TimerFixer timerFixer) {
    this.timerFixer = timerFixer;
  }

  @Override
  public void run() {
    for (int i = 1; ; i++) {

      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date date = new Date(System.currentTimeMillis());
      System.out.println(formatter.format(date));
      timerFixer.count();
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}