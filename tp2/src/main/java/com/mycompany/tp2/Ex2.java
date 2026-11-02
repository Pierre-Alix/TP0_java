package com.mycompany.tp2;

import java.util.Scanner;

/**
 * Nom : BOMET Pierre-Alix
 * Groupe : BDML2
 * Rôle du programme : Addition d'entiers
 * Date : 02/11/2026
 */

public class Ex2 {

    public static void main(String[] args) {
        // Déclaration des variables
        int nb; // nombre d'entiers à additionner
        int result; // résultat
        int ind; // indice

        // Saisie du nombre d'entiers
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrer le nombre d'entiers à additionner :");
        nb = sc.nextInt();

        result = 0;

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind++;
        }

        // Affichage du résultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
