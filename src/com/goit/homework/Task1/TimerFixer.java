package com.goit.homework.Task1;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerFixer {

  Runnable timerStart = new Runnable() {
    @Override
    public void run() {
      try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
            Thread.sleep(1000);
      } catch (InterruptedException ignored) {
      }
    }
  };

  Runnable fiveSecondFixer = new Runnable() {
    @Override
    public void run() {
      try {
            Thread.sleep(1000);
            System.out.println("Прошло 5 секунд...");
      } catch (InterruptedException ignored) {
      }
    }
  };

}
