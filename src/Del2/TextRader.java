package Del2;

import java.util.Scanner;

public class TextRader {
    public static void main(String[] args) {
        //Läser in text ifrån användaren
        Scanner scan = new Scanner(System.in);
        TextCounter counter = new TextCounter();

        //upprepar ovan tills text= stop vi har skrivt stop

        while (true){
            String text = scan.nextLine();
            if(text.equals("stop")){
                break;
            }
            counter.addText(text);

            // Hämta antal tecken och rader
            int Characters = counter.getCharactersnumbers();
            int rows = counter.getRows();

        }
        //skriv ut antal tecken och rader
        System.out.println("Antal rader: " + counter.getRows());
        System.out.println("Antal tecken: " + counter.getCharactersnumbers());

    }
}
