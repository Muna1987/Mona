package Del2;

import java.util.Scanner;

public class TextRader {
    public static void main(String[] args) {
        //Läser in text ifrån användaren
        Scanner scan = new Scanner(System.in);
        TextCounter counter = new TextCounter();
        String text = scan.nextLine();

        //upprepar ovan tills text= stop vi har skrivt stop

        while (true){

            if(text.equals("stop")){
                break;
            }
            //vi sparar antal tecken och radar
            counter.addText(text);
            text = scan.nextLine();
        }
            // Hämta antal tecken och rader
           int Characters = counter.getCharactersnumbers();
            int rows = counter.getRows();

        //skriv ut antal tecken och rader
        System.out.println("Antal rader: " + rows);
        System.out.println("Antal tecken: " + Characters);

    }
}
