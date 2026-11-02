package com.mycompany.tp1;
import java.util.Scanner;
/**
 * Nom : BOMET Pierre-Alix
 * Groupe : 2
 * Rôle du programme : Affichage d'un message
 * Date : 02/11/2026 
 */
public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Bonjour");
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        
        System.out.println("Au revoir "+ prenom);
    }
}
