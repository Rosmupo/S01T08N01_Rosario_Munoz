package EX4;

/*Fer la mateixa impressió del punt anterior, però mitjançant method
 reference.
 * */

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> monthList = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        monthList.forEach(System.out::println);
    }
}
