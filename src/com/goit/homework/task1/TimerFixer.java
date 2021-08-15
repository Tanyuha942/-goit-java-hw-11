package com.goit.homework.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerFixer {

  final Runnable timerStart = () -> {
    try {
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          Date date = new Date(System.currentTimeMillis());
          System.out.println(formatter.format(date));
          Thread.sleep(1000);
    } catch (InterruptedException ignored) {
    }
  };

  final Runnable fiveSecondFixer = () -> {
    try {
          Thread.sleep(0);
          System.out.println("Прошло 5 секунд...");
    } catch (InterruptedException ignored) {
    }
  };

}
