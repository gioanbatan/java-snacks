package snacks;

import java.util.Random;

public class SnackFour {
    public static void main(String[] args) {
        /*
        Snack 4 (Bonus)
        Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi elementi random finchè il numero di elementi presenti nell’array che ne ha di meno + quelli mostrati a video non è uguale al numero di elementi presenti nell’array che ne ha di più
        */

        String[] longArray = {"cane", "gatto", "topo", "iguana", "canguro", "elefante", "bradipo", "tardigrada" };
        int[] shortArray = {20, 40, 11, 10};

        System.out.println("L'array corto è lungo " + shortArray.length + " elementi.");
        System.out.println("L'array lungo è lungo " + longArray.length + " elementi.");
        for (int i = shortArray.length; i < longArray.length; i++) {
            Random randNumb = new Random();
            System.out.println(randNumb.nextInt(100));
        }
    }
}
