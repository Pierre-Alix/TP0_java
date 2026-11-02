package com.mycompany.calculator;

import java.util.Scanner;

/**
 * Nom : BOMET Pierre-Alix
 * Groupe : 2
 * Rôle du programme : Calculatrice
 * Date : 0é/11/2026 
 */
public class Calculator {

    public static void main(String[] args) {
        int operateur; // choix de l'opération
        float operande1; //valeur 1
        float operande2; //valeur 2
        Scanner sc;
        
        //empêche le crash du programme en forçant l'entrée d'une valeur entre 1 et 5
        do{
            System.out.println("Selectionner une opération :\n"+
                "1/ addition\n"+"2/ soustraction\n"+"3/ multiplication\n"+"4/ division\n"+"5/ modulo\n");
            System.out.print("Votre choix : ");
        
            sc = new Scanner(System.in);
            operateur = sc.nextInt();
        
        }while (operateur < 1 || operateur > 5);
        
        // valeur 1
        System.out.print("1ere valeur : ");
        operande1 = sc.nextFloat();
        
        // valeur 2
        System.out.print("2eme valeur : ");
        operande2 = sc.nextFloat();
        
        // affichage du résultat
        switch (operateur) {
            case 1 -> System.out.println("Resultat : "+ (operande1+operande2));
            case 2 -> System.out.println("Resultat : "+ (operande1-operande2));
            case 3 -> System.out.println("Resultat : "+ (operande1*operande2));
            case 4 -> System.out.println("Resultat : "+ (operande1/operande2));
            default -> System.out.println("Resultat : "+ (operande1%operande2));
        }  
    }
}
