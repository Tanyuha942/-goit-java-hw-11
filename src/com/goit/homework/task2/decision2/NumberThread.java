package com.goit.homework.task2.decision2;

class NumberThread {

  private int n;

  NumberThread(int n) {
    this.n = n;
  }

  Runnable fizz = () -> {
    System.out.print("fizz" + ", ");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  };

  Runnable buzz = () -> {
    System.out.print("buzz" + ", ");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  };

  Runnable fizzbuzz = () -> {
    System.out.print("fizzbuzz" + ", ");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  };

  Runnable number = () -> {
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0)
      {
        fizzbuzz.run();

      }
      else if (i % 3 == 0)
      {
        fizz.run();
      }
      else if (i % 5 == 0)
      {
        buzz.run();
      }
      else {
        System.out.print(i + ", ");
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  };

}