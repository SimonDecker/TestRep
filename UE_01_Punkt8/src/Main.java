import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Project: UE2_URL
 * Created by: Simon Decker
 * User: simon
 * 04.10.18
 * Discripton: Dieses Programm prüft ob eine URL richtig eingegeben wurde
 */
public class Main {

    // Diese Kommentar wurde mit einem Branch hinzugefügt
    public static void main(String[] args) {
        Scanner eing = new Scanner(System.in);

        String url = eing.next(); //Eingabe der URL

        String pattern="[a-z]*[:][/]{2}[w]{3}[.][a-z0-9]*[.][a-z]*"; //Festlegung des Patterns

        if(Pattern.matches(pattern, url)){ //überprüfung
            System.out.println("\n" + "URL wurde richtig eingegeben");
            System.out.println("Ihre Eingabe: " + url);
        }else if(!Pattern.matches(pattern, url)){
            System.out.println("URL wurde NICHT richtig eingegeben");
            System.out.println("Ihre Eingabe: " + url);
        }
    }
}
