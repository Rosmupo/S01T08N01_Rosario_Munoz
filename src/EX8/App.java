package EX8;

/*Crea una Functional Interface que contingui un mètode anomenat
reverse(). Aquest mètode ha de rebre i ha de retornar un String.
En el main() de la classe principal, injecta a la interfície creada
mitjançant una lambda, el cos del mètode, de manera que torni la
mateixa cadena que rep com a paràmetre però al revés. Invoca la
instància de la interfície passant-li una cadena i comprova si el
resultat és correcte.
* */

public class App {

    public static void main(String[] args) {

        Reverse reverse = (String forReverse) -> {
            String textReverse = " ";
            for (String e: forReverse.split(" ")) {
                textReverse += new StringBuilder(e).reverse().toString() + " ";
            } return textReverse;
        };

        String text = "Java in love";
        System.out.println(text);
        System.out.println(reverse.reverse(text));

        }
    }
