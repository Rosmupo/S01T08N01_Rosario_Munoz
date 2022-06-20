package EX7;

/*Amb la llista de l’exercici anterior, ara ordena-la al revés,
de cadena més llarga a més curta.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Pepe", "Mateo", "Pedro", "Rosario", "Mariona", "María", "Hola mundo", "Java in love");

        List<String> streamList = stringList.stream()
                .sorted((x,y)-> y.length()-x.length())
                .collect(Collectors.toList());
        streamList.forEach(System.out::println);

    }
}
