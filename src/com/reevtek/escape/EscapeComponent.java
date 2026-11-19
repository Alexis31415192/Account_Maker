package com.reevtek.escape;//Package

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; // Imports

public class EscapeComponent {//IDK why I named It like that...

    static LocalTime time = LocalTime.now();

    static Random random = new Random();

    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {

        try {

            for (int i = 0; i < 5; i++) {//Cool loading screen
                int numDots = i % 4;

                String sb = "\rLoading \"Account maker 0.1.0\"" + ".".repeat(numDots) +
                        " ".repeat(3 - numDots);

                IO.print(sb);
                Thread.sleep(400);
            }

            IO.print("\rLoading complete!   \n");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            IO.println("\nLoading interrupted.");
        }

        IO.println("WELCOME COMRADE!\n");

        IO.println("""
                 -------------------------------------------------
                |*Select                                          |
                |1. Continue with CLI (fast, but unfamiliar)      |
                |2. switch to GUI (Not as fast, but more familiar)|
                 -------------------------------------------------
                """);
        IO.print("Choose (1/2): ");
        int interFace = scanner.nextInt();

        if (interFace == 1) {

            IO.println("\n");
            cli();

            scanner.close();
        } else if (interFace == 2) {

            IO.println("\n");
            //GUI
            ProgramFrame frame = new ProgramFrame();

            IO.println(frame + "\n");
            IO.println("Converted Terminal to ProgramLog.\n");
            IO.println(time + " Opened new GUI window\n");
        }
    }

    static void ShowBalance(double balance) {
        System.out.printf("§%.2f\n", balance);
    }

    static double deposit() {
        IO.print("Enter a amount to deposit: ");
        double amount1 = scanner.nextDouble();

        if (amount1 < 0) {
            IO.println("The fuck is wrong with you?");
            return 0;
        } else {
            return amount1;
        }
    }

    static double Withdraw() {

        IO.print("Enter amount to withdraw: ");
        double withdraw = scanner.nextDouble();

        if (withdraw < 0) {
            IO.println("Are you trying to withdraw your collage savings??");
            return 0;
        } else {
            return withdraw;
        }
    }

    static double Interest(double balance) {

        //Compound interest

        IO.print("Enter Administrator password: ");
        scanner.nextLine();
        String adminPassword = scanner.nextLine();

        if ("JavaIsTheBestILOVEJAVA".equals(adminPassword)) {
            IO.print("Enter interest rate (in %): ");
            double rate = scanner.nextDouble() / 100;

            IO.print("Enter # of times compounded per year: ");
            int timesCompounded = scanner.nextInt();

            IO.print("Enter the # of years: ");
            int years = scanner.nextInt();

            double amount = balance * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

            IO.println("The amount after " + years + " is: § " + amount);

            return amount;
        } else {
            IO.println("INVALID PASSWORD");
            IO.println("SELF DESTRUCTING");

            return 0;
        }


    }

    static void printDie(int roll) {

        String dice1 = """
                 -------
                |       |
                |   .   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | .     |
                |       |
                |     . |
                 -------
                """;

        String dice3 = """
                 -------
                | .     |
                |   .   |
                |     . |
                 -------
                """;

        String dice4 = """
                 -------
                | .   . |
                |       |
                | .   . |
                 -------
                """;

        String dice5 = """
                 -------
                | .   . |
                |   .   |
                | .   . |
                 -------
                """;

        String dice6 = """
                 -------
                | .   . |
                | .   . |
                | .   . |
                 -------
                """;

        switch (roll) {
            case 1 -> IO.print(dice1);
            case 2 -> IO.print(dice2);
            case 3 -> IO.print(dice3);
            case 4 -> IO.print(dice4);
            case 5 -> IO.print(dice5);
            case 6 -> IO.print(dice6);
            default -> IO.print("Invalid roll");
        }
    }

    static String[] Spinrow() {
        String[] slots = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = slots[random.nextInt(slots.length)];
        }

        return row;

    }

    static void printRow(String[] row) {
        IO.println("**************");
        IO.println(" " + String.join(" | ", row));
        IO.println("**************");
    }

    static int getPayout(String[] row, double bet) {

        if (row[0].equals(row[1])) {

            return (int) switch (row[0]) {

                case "🍒" -> bet * 3;

                case "🍉" -> bet * 4;

                case "🍋" -> bet * 5;

                case "🔔" -> bet * 10;

                case "⭐" -> bet * 20;

                default -> bet * 0;
            };

        } else if (row[1].equals(row[2])) {

            return (int) switch (row[1]) {

                case "🍒" -> bet * 2;

                case "🍉" -> bet * 3;

                case "🍋" -> bet * 4;

                case "🔔" -> bet * 5;

                case "⭐" -> bet * 10;

                default -> bet * 0;
            };

        }

        return 0;
    }

    static void credits() {


        boolean credits = true;

        while (credits) {

            IO.println("""
                    ---------------------------------------------------------
                    |********************************************************|
                    |                CREDITS AND CONTRIBUTION                |
                    |********************************************************|
                    ---------------------------------------------------------
                          This was created by The Socialist Dragon
                    THIS PROGRAM WAS CREATED TO APPLY ALL MY JAVA KNOWLEDGE
                    
                       Developers
                       ~~~~~~~~~~
                       The Socialist Dragon:
                           - Created this
                           - Optimises this program
                           - Tryhard
                           - Possible femboy
                           - Adds cool features :3
                    
                    
                       Code used within Account maker
                       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                    %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                    Name: Account_maker
                    Author: The Socialist Dragon
                    GitHub URL: https://github.com/Alexis31415192/Account_maker
                    Language: Java
                    SDK: Java Oracle OpenJDK v26.0.2
                    Language level: 17
                    IDE: IntelliJ IDEA
                    Currently running in: Terminal
                    
                    /**
                    *No licence 2026 ReevTek (cool name isn't it?)
                    *Most programs are intellectual property of @BroCodez !
                    */
                    %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                    """);
            IO.print("View attribution? (true/false): ");
            boolean attribution = scanner.nextBoolean();

            if (attribution) {

                IO.println("""
                         ------------------------------------------------------------------------------
                        |******************************************************************************|
                        |                                 ATTRIBUTIONS                                 |
                        |******************************************************************************|
                        |                                                                              |
                        | - [@BroCodez] Developed most programs in his awesome Java tutorial on YouTube|
                        |   (Seriously, sub to his channel he's a chad).                               |
                         ------------------------------------------------------------------------------""");
            } else {

                credits = false;
            }
        }
    }

    static void cli() {

        //Actual program
        IO.println(" _______________________________");
        IO.println("|*******************************|");
        IO.println("|        ACCOUNT CREATOR        |");
        IO.println("|*******************************|");
        IO.println("|*What would you like to do?    |");
        IO.println("|1. Sign on                     |");
        IO.println("|2. Sign up                     |");
        IO.println("|-To exit, press any other key  |");
        IO.println("|*******************************|");
        IO.println(" -------------------------------");
        IO.print("Enter choice (1-2): ");
        int signIn = scanner.nextInt();

        switch (signIn) {
            case 1 -> {
                scanner.nextLine();

                IO.print("Place file directory here, at the end of the directory, put \\[FILE].ser: ");
                String dir = scanner.nextLine();

                User user = null;

                try {
                    FileInputStream fileIn = new FileInputStream(dir);
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    user = (User) in.readObject();
                    in.close();
                    fileIn.close();
                } catch (IOException e) {

                    IO.println("File doesn't exist!");
                    ;
                } catch (ClassNotFoundException e) {

                    IO.println("SCRAP DOODLE! or smth like that...");
                }

                scanner.nextLine();

                assert user != null;
                String password = user.password;

                IO.print("Please verify yourself with your password: ");
                String verify = scanner.nextLine();

                if (verify.equals(user.password)) {


                    boolean programRunning = true;

                    while (programRunning) {

                        String username = user.username;
                        int age = user.age;
                        ArrayList<String> passwordList = user.passwordList;
                        double balance = user.balance;

                        IO.println("*******************************************************");
                        IO.println("1. Enter Virtual Bank*********************************");
                        IO.println("2. Enter DICE ROLLER**********************************");
                        IO.println("3. Enter MATRIX GENERATOR*****************************");
                        IO.println("4. Enter FAKE NUMPAD**********************************");
                        IO.println("5. Edit profile***************************************");
                        IO.println("6. View/Edit password list****************************");
                        IO.println("7. View credits and attribution***********************");
                        IO.println("8. Save account***************************************");
                        IO.println("9. Log out********************************************");
                        IO.println("*******************************************************");
                        IO.print("Enter a choice (1-9): ");
                        int Choice = scanner.nextInt();
                        boolean isRunning = true;

                        switch (Choice) {

                            case 1 -> {

                                IO.println("Entering virtual bank...\n");

                                while (isRunning) {

                                    //Bank program
                                    IO.println(" ___________________________________________");
                                    IO.println("|*******************************************|");
                                    IO.println("|              VIRTUAL BANK                 |");
                                    IO.println("|*******************************************|");
                                    IO.println("|1. View balance                            |");
                                    IO.println("|2. Deposit                                 |");
                                    IO.println("|3. Withdraw                                |");
                                    IO.println("|4. Slot machine                            |");
                                    IO.println("|5. Compound interest (ADMINS ONLY!)        |");
                                    IO.println("|-To exit the program, enter any other key  |");
                                    IO.println("|*******************************************|");
                                    IO.println(" -------------------------------------------");
                                    IO.print("Enter choice (1-5): ");
                                    int Choice1 = scanner.nextInt();

                                    switch (Choice1) {
                                        case 1 -> ShowBalance(balance);

                                        case 2 -> balance += deposit();

                                        case 3 -> balance -= Withdraw();

                                        case 4 -> {
                                            String[] row;

                                            IO.println("  ******************************");
                                            IO.println("   WELCOME TO THE SLOT MACHINE!");
                                            IO.println("  ******************************");
                                            IO.println("%%%%%%%%%🍒 🍉 🍋 🔔 ⭐ %%%%%%%%%");
                                            while (balance > 0) {
                                                IO.println("Current balance: §" + balance);
                                                IO.print("Place your desired bet: ");
                                                int bet = scanner.nextInt();
                                                scanner.nextLine();

                                                if (bet > balance) {
                                                    IO.println("INSUFFICIENT FUNDS!");
                                                } else if (bet <= 0) {
                                                    IO.println("NEGATIVE BETTING IS ILLEGAL!");
                                                } else {
                                                    balance -= bet;
                                                }
                                                IO.println("Spinning...");
                                                row = Spinrow();
                                                printRow(row);
                                                getPayout(row, bet);
                                                int payOut = getPayout(row, bet);

                                                if (payOut > 0) {

                                                    IO.println("You won: §" + payOut);

                                                } else {
                                                    IO.println("Touché");
                                                }
                                                IO.println("Would you like to play again? (true/false)");
                                                String gamble = scanner.nextLine();

                                                if (gamble.equals("false")) {
                                                    break;
                                                } else if (gamble.equals("true")) {

                                                    IO.println("\n");
                                                }
                                            }
                                        }

                                        case 5 -> balance += Interest(balance);


                                        default -> isRunning = false;
                                    }

                                }

                            }

                            case 2 -> {

                                //Dice roller by: @BroCodez
                                while (true) {

                                    int numOfDice;
                                    int total = 0;

                                    IO.print("Enter the # of dice to roll: ");
                                    numOfDice = scanner.nextInt();

                                    if (numOfDice > 0) {

                                        for (int i = 0; i < numOfDice; i++) {
                                            int roll = random.nextInt(1, 7);
                                            printDie(roll);
                                            IO.println("You rolled: " + roll);
                                            total += roll;

                                        }
                                        IO.println("Total: " + total);
                                    } else {
                                        IO.println("# of dice must be greater than 0");
                                    }

                                    IO.print("Continue? (true/false): ");
                                    boolean choice = scanner.nextBoolean();

                                    if (choice) {
                                        IO.println("\n");
                                    } else {

                                        break;
                                    }
                                }

                            }
                            case 3 -> {

                                IO.print("Enter # of columns: ");
                                int columns = scanner.nextInt();

                                IO.print("Enter the # of rows: ");
                                int rows = scanner.nextInt();

                                IO.print("Enter symbol: ");
                                char symbol = scanner.next().charAt(0);

                                for (int i = 0; i < rows; i++) {
                                    for (int j = 0; j < columns; j++) {
                                        IO.print(symbol + " ");
                                    }
                                    IO.println();
                                }
                            }

                            case 4 -> {
                                char[][] numPad = {{'1', '2', '3'},
                                        {'4', '5', '6'},
                                        {'7', '8', '9'},
                                        {'*', '0', '#'}};

                                for (char[] pin : numPad) {
                                    for (char number : pin) {
                                        IO.print(number + " ");
                                    }
                                    IO.println();
                                }
                                IO.println("What did you expect???");
                            }

                            case 5 -> {

                                String[] account = {username, password};

                                boolean isFound = false;

                                scanner.nextLine();
                                IO.print("Enter property to search (add String at the end of age and passkey and add a space at the beginning and end of the input): ");
                                String target = scanner.nextLine();

                                for (int i = 0; i < account.length; i++) {

                                    if (account[i].equals(target)) {
                                        IO.print("Property found at index: " + i + "\n");
                                        IO.print("Edit? (true/false): ");
                                        boolean edit = scanner.nextBoolean();
                                        scanner.nextLine();

                                        if (edit) {

                                            if (account[0].equals(target)) {

                                                IO.print("EDIT: ");
                                                username = scanner.nextLine();
                                            }
                                            if (account[1].equals(target)) {

                                                IO.print("EDIT: ");
                                                password = scanner.nextLine();
                                            }
                                        }

                                        isFound = true;
                                        break;
                                    }
                                }
                                if (!isFound) {

                                    IO.println("Couldn't find property :(");
                                }
                            }

                            case 6 -> {

                                scanner.nextLine();
                                IO.print("Please enter your password: ");
                                String security = scanner.nextLine();

                                if (security.equals(password)) {

                                    IO.println(passwordList);
                                    IO.print("Edit? (true/false): ");
                                    boolean edit = scanner.nextBoolean();
                                    scanner.nextLine();

                                    if (edit) {

                                        IO.print("EDIT: ");

                                        passwordList = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));//TODO fix this bug
                                    }
                                } else {

                                    IO.println("Entry denied");
                                }
                            }

                            case 7 -> credits();

                            case 8 -> {

                                scanner.nextLine();
                                IO.print("Enter your password: ");
                                verify = scanner.nextLine();

                                if (verify.equals(password)) {


                                    IO.print("Enter a custom directory to save your account");
                                    String newDir = scanner.nextLine();

                                    try {

                                        FileOutputStream fileOut = new FileOutputStream(newDir);
                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);

                                        out.writeObject(user);
                                        out.close();
                                        fileOut.close();

                                        IO.println("File successfully written (DO NOT OPEN FILE ON ANY APP BUT THIS ONE");
                                    } catch (IOException e) {

                                        IO.println("ERROR ENCOUNTERED WHILST TRYING TO WRITE FILE. this is either an incorrect path or this is a bug");
                                    }
                                } else {
                                    IO.println("PASSWORD MISMATCH");
                                }
                            }

                            case 9 -> programRunning = false;
                        }
                    }
                } else {

                    IO.println("Fuck off");
                }
            }

            case 2 -> {

                String newLine = "\n";

                ArrayList<String> passwordList = new ArrayList<>();

                scanner.nextLine();

                IO.print("Create a unique username: ");
                String username = scanner.nextLine() + newLine;


                while (username.isEmpty()) {
                    IO.print("Create a username: ");
                    username = scanner.nextLine() + newLine;
                }
                while (username.length() < 4 || username.length() > 12 && username.contains(" ")) {
                    IO.print("Username must be between 4 and 12 chars and not contain spaces\n");
                    username = scanner.nextLine() + newLine;
                }
                IO.print("Create a strong password: ");
                String password = scanner.nextLine();

                while (password.length() < 8) {
                    IO.println("Your password is too weak!(Like your self esteem)");
                    IO.println("Try another one");
                    password = scanner.nextLine();

                }
                //Passkey prompt
                IO.print("Do you want to make a passkey lock? (true/false): ");
                boolean passkeyYes = scanner.nextBoolean();

                //Welcome
                IO.println("Welcome " + username);
                IO.println("Password set: " + password);

                if (passkeyYes) {
                    IO.println("Passkey made");
                    IO.print("Enter # of passwords you want to save in lock: ");
                    int numPass = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < numPass; i++) {

                        IO.print("Enter password " + i + " : ");
                        String passwords = scanner.nextLine();

                        passwordList.add(passwords);
                    }
                    IO.println(passwordList);
                } else {
                    IO.println("Passkey canceled");
                }

                //Age verification
                IO.print("Enter your real age: ");
                int age = scanner.nextInt();

                if (age >= 18) {

                    IO.println("Alright you can come in :)");
                    IO.println("Account fully created!");

                    double balance = 0.0;

                    while (true) {

                        IO.println("*********************************************");
                        IO.println("1. Enter Virtual Bank***********************");
                        IO.println("2. Enter DICE ROLLER************************");
                        IO.println("3. Enter MATRIX GENERATOR*******************");
                        IO.println("4. Enter FAKE NUMPAD************************");
                        IO.println("5. View credits*****************************");
                        IO.println("6. Fully register your account (RECOMMENDED)");
                        IO.println("*********************************************");
                        IO.print("Enter a choice (1-6): ");
                        int Choice = scanner.nextInt();
                        scanner.nextLine();

                        boolean isRunning = true;

                        switch (Choice) {

                            case 1 -> {

                                IO.println("Entering virtual bank...\n");

                                while (isRunning) {

                                    //Bank program
                                    IO.println(" ___________________________________________");
                                    IO.println("|*******************************************|");
                                    IO.println("|              VIRTUAL BANK                 |");
                                    IO.println("|*******************************************|");
                                    IO.println("|1. View balance                            |");
                                    IO.println("|2. Deposit                                 |");
                                    IO.println("|3. Withdraw                                |");
                                    IO.println("|4. Slot machine                            |");
                                    IO.println("|5. Compound interest (ADMINS ONLY!)        |");
                                    IO.println("|-To exit the program, enter any other key  |");
                                    IO.println("|*******************************************|");
                                    IO.println(" -------------------------------------------");
                                    IO.print("Enter choice (1-5): ");
                                    int Choice1 = scanner.nextInt();

                                    switch (Choice1) {
                                        case 1 -> ShowBalance(balance);

                                        case 2 -> balance += deposit();


                                        case 3 -> balance -= Withdraw();

                                        case 4 -> {
                                            String[] row;

                                            IO.println("  ******************************");
                                            IO.println("   WELCOME TO THE SLOT MACHINE!");
                                            IO.println("  ******************************");
                                            IO.println("%%%%%%%%%🍒 🍉 🍋 🔔 ⭐ %%%%%%%%%");
                                            while (balance > 0) {
                                                IO.println("Current balance: §" + balance);
                                                IO.print("Place your desired bet: ");
                                                int bet = scanner.nextInt();
                                                scanner.nextLine();

                                                if (bet > balance) {
                                                    IO.println("INSUFFICIENT FUNDS!");
                                                } else if (bet <= 0) {
                                                    IO.println("NEGATIVE BETTING IS ILLEGAL!");
                                                } else {
                                                    balance -= bet;
                                                }
                                                IO.println("Spinning...");
                                                row = Spinrow();
                                                printRow(row);
                                                getPayout(row, bet);
                                                int payOut = getPayout(row, bet);

                                                if (payOut > 0) {

                                                    IO.println("You won: §" + payOut);

                                                } else {
                                                    IO.println("Touché");
                                                }
                                                IO.println("Would you like to play again? (true/false)");
                                                String gamble = scanner.nextLine();

                                                if (gamble.equals("false")) {
                                                    break;
                                                } else if (gamble.equals("true")) {

                                                    IO.println("\n");
                                                }
                                            }
                                        }

                                        case 5 -> {

                                            Interest(balance);
                                            balance = Interest(balance);
                                        }

                                        default -> isRunning = false;
                                    }

                                }

                            }

                            case 2 -> {

                                //Dice roller by: @BroCodez
                                while (true) {

                                    int numOfDice;
                                    int total = 0;

                                    IO.print("Enter the # of dice to roll: ");
                                    numOfDice = scanner.nextInt();

                                    if (numOfDice > 0) {

                                        for (int i = 0; i < numOfDice; i++) {
                                            int roll = random.nextInt(1, 7);
                                            printDie(roll);
                                            IO.println("You rolled: " + roll);
                                            total += roll;
                                        }
                                        IO.println("Total: " + total);
                                    } else {
                                        IO.println("# of dice must be greater than 0");
                                    }

                                    IO.print("Continue? (true/false): ");
                                    boolean choice = scanner.nextBoolean();

                                    if (choice) {

                                        IO.println("\n");
                                    } else {

                                        break;
                                    }
                                }

                            }
                            case 3 -> {

                                IO.print("Enter # of columns: ");
                                int columns = scanner.nextInt();

                                IO.print("Enter the # of rows: ");
                                int rows = scanner.nextInt();

                                IO.print("Enter symbol: ");
                                char symbol = scanner.next().charAt(0);

                                for (int i = 0; i < rows; i++) {
                                    for (int j = 0; j < columns; j++) {
                                        IO.print(symbol + " ");
                                    }
                                    IO.println();
                                }
                            }

                            case 4 -> {
                                char[][] numPad = {{'1', '2', '3'},
                                        {'4', '5', '6'},
                                        {'7', '8', '9'},
                                        {'*', '0', '#'}};

                                for (char[] pin : numPad) {
                                    for (char number : pin) {
                                        IO.print(number + " ");
                                    }
                                    IO.println();
                                }
                                IO.println("What did you expect???");
                            }

                            case 5 -> credits();

                            case 6 -> {

                                scanner.nextLine();


                                User user = new User(username, password, age, balance, passwordList);

                                IO.print("Enter your password: ");
                                String verify = scanner.nextLine();

                                if (verify.equals(password)) {

                                    try {

                                        FileOutputStream fileOut = new FileOutputStream("LocalUsers\\Session.ser");
                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);

                                        out.writeObject(user);
                                        out.close();
                                        fileOut.close();

                                        IO.println("File successfully written (DO NOT OPEN FILE ON ANY APP BUT THIS ONE");
                                    } catch (IOException e) {

                                        IO.println("Unable to reach file!");
                                    }

                                } else {
                                    IO.println("PASSWORD MISMATCH");
                                }
                            }

                            default -> IO.println("INVALID ENTRY!");
                        }

                    }

                } else if (age == 0) {
                    IO.println("How are you typing this shit??");
                } else if (age < 0) {
                    IO.println("What the fuck?!");
                } else {
                    IO.println("Get the fuck out of here before I smash you're little dick-face!!!");
                }

            }

            default -> IO.println("Exiting program...");

        }//Finally
    }
}
