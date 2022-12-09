import java.util.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {

        // Total de dígitos:
        int count = 0;

        // Lista de dígitos:
        List<Integer> digits = new ArrayList<Integer>();

        Pattern p = Pattern.compile("\\d");

        // numeros a ser analisados:
        Matcher m = p.matcher("1");

        while (m.find()) {

            count++;

            digits.add(new Integer(m.group()));
        }

        // Exibe o total:
        System.out.println(count);

        System.out.println(digits);

    }

}