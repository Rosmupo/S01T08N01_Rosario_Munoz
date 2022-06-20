package EX6;

/*Crea una llista amb nombres i cadenes de text i ordena la llista
amb les cadenes de més curta a més llarga.
 * */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Pepe", "Mateo", "Pedro", "Rosario", "Mariona", "María", "Hola mundo", "Java in love");

        List<String> streamList = stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        streamList.forEach(System.out::println);

    }
}
