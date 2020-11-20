package com.mentoria;

import java.util.Scanner;

public class Drawer {

  public static void main(String[] args) {
    while (true) {
      drawScreen();
    }
  }

  public static void drawScreen() {
    for (int i = 0; i < 80; i++) {
      drawLine(i);
      clearScreen();
    }
  }


  public static void drawLine(int x1) {
    for (int i = 0; i < x1 - 1; i++) {
      for (int j = 0; j <= 10; j++ ) {
        System.out.print(".");
      }
      System.out.println(".");
    }
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}
