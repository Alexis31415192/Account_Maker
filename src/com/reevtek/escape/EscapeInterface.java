package com.reevtek.escape;//Package

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; // Imports

public interface EscapeInterface {//IDK why I named It like that...

    static LocalTime time = LocalTime.now();

    static Random random = new Random();

    static Scanner scanner = new Scanner(System.in);

    void ShowBalance(double balance);

    double deposit();

    double Withdraw();

    double Interest(double balance);

    void printDie(int roll);

    String[] Spinrow();

    void printRow(String[] row);

    int getPayout(String[] row, double bet);

    void credits();

    void cli();
}

