package snacks;

public class SnackThree {
    public static void main(String[] args) {
        /*
        Snack 3
        Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
         */

        int[] numberArray = {42, 53, 22, 66, 11, 35, 32, 60, 3, 29};
        int numbersSum = 0;

        //Intro

        System.out.print("Dato l'array: [ ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]);
            if (i < numberArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        //Svolgimento
        System.out.println("La somma dei numeri dispari dell'array è: ");

        for (int i = 0; i < numberArray.length; i++) {
            if (i % 2 == 0) {
                numbersSum += numberArray[i];
            }
        }

        System.out.println(numbersSum);
    }
}
