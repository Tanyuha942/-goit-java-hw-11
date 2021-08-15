package com.goit.homework.Task2;

class Numbers {

  Runnable numbers = new Runnable() {

    final Fizz fizz = new Fizz();
    final Buzz buzz = new Buzz();
    final Fizzbuzz fizzbuzz = new Fizzbuzz();
    final int n = 25;
    final StringBuilder s = new StringBuilder();

    @Override
    public void run() {

      System.out.println("Start => numbers");
      for (int i = 1; i <= n ; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          fizzbuzz.fizzBuzz.run();
          s.append("fizzbuzz").append(", ");
        }
        else if (i % 3 == 0) {
          fizz.fizz.run();
          s.append("fizz").append(", ");
        }
        else if (i % 5 == 0) {
          buzz.buzz.run();
          s.append("buzz").append(", ");
        }
        else {
//                    System.out.println(i);
          s.append(i).append(", ");
        }
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      s.append("]");
      System.out.println(s.toString().replace(", ]", ""));
    }
  };
}