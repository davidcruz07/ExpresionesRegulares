import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cadena = scanner.nextLine();


        Pattern pat = Pattern.compile("^ISI\\d{4}-[1|2]\\.(txt|csv)$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }
}

// "Hola mundo"
// "(?i)Hola mundo"
// ".*(Java|Python|Go|Pascal|Perl).*"
// "[A-Za-z0-9_]+@unison.mx|uson.mx"
// "^ISI\\d{4}-[1|2]\\.(txt|csv)$"

