package com.goit.homework.Task2;

class Buzz {

  Runnable buzz = new Runnable() {
    @Override
    public void run() {
      System.out.println("Start => buzz");
    }
  };
}