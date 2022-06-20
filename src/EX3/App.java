package EX3;

/*Crea una llista amb els noms dels mesos de l’any. Imprimeix tots
els elements de la llista amb una lambda.
* */

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> monthList = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        monthList.forEach(month -> System.out.println(month));

    }
}
