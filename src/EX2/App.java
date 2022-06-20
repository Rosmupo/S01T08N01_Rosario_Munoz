package EX2;

/*
Has de fer el mateix que en el punt anterior, però ara, el mètode
ha de retornar una llista amb els Strings que a més de contenir la
 lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
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
                    .filter(name -> name.length()>5)
                    .collect(Collectors.toList());

            streamList.forEach(System.out::println);

        }
    }
}
