package com.goit.homework.task2.decision2;

public class StartThreads {

  public static void main(String[] args) {
    NumberThread numberThread = new NumberThread(25);

    numberThread.number.run();

  }
}