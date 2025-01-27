import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {

    public static void main(String[] args) {
        //Criar lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Usar o Consumer com a expressão Lambda para imprimir..
        //..números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.print(numero);
            }
        };

        //Usar o Consumer para imprimir..
        //..numeros pares na Stream
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}


