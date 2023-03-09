package snacks;

import java.util.Random;

public class SnackTwo {
    public static void main(String[] args) {
        /*
        Snack 2
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
         */

        String[] lastnamesArray = {"Bianchi", "Rossi", "Verdi", "Gialli"};
        String[] namesArray = {"Carlo", "Luca", "Gianni"};

        for (int i = 0; i < 10; i++) {
            Random randNumb = new Random();

            int nameIndex = randNumb.nextInt(namesArray.length);
            int lastnameIndex = randNumb.nextInt(lastnamesArray.length);

            System.out.println(namesArray[nameIndex] + " " + lastnamesArray[lastnameIndex]);
        }
    }
}
