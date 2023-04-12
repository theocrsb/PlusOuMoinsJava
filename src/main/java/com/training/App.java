package com.training;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    // Main = point entre programme (1 dans l'application)
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Entrez votre nom: ");
    // String nom = scanner.nextLine();
    // System.out.println("Bonjour " + nom + " !");

    // System.out.print("Entrez votre âge: ");
    // int age = scanner.nextInt();
    // System.out.println("Vous avez " + age + " ans.");

    // }

    public static void main(String[] args) {
        RandomNumber numberGenerate = new RandomNumber();
        Scanner scanner = new Scanner(System.in);

        // random
        int result = numberGenerate.randomNumber();
        System.out.println(result + " random number generated");

        // user
        System.out.print("Entrez un nombre: ");
        int consoleNumber = scanner.nextInt();
        System.out.println(consoleNumber + " number enter by user");

        while (result != consoleNumber) {
            System.out.println("Dommage .. essaye encore !");

            if (result < consoleNumber) {
                System.out.print("Entrez un plus petit : ");
                consoleNumber = scanner.nextInt();
            }
            if (result > consoleNumber) {
                System.out.print("Entrez un plus grand : ");
                consoleNumber = scanner.nextInt();
            }
        }

        if (result == consoleNumber) {
            System.out.println("GG ! tu as trouvé le resultat : " + result);
        }

    }
}
