package EX1;

/*- Exercici 1
A partir d’una llista de Strings, escriu un mètode que retorna
una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix
el resultat.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static class Main {

        public static void main(String[] args) {

            List<String> stringList = Arrays.asList("Pepe", "Mateo", "Pedro", "Rosario", "Mariona", "María");

            List<String> streamList = stringList.stream()
                            .filter(name -> name.contains("o"))
                            .collect(Collectors.toList());

            streamList.forEach(System.out::println);

        }
    }
}
