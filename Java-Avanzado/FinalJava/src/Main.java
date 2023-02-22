import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Main {
    //private Function<String, String> toMayus = x -> x.toUpperCase();
    //private Function<Integer, Integer> sumador = x -> x.sum(x, x);
    //public void pruebas() {
      //  Saluda(toMayus, "Javier");
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList();
        nombres.add("JAvi");
        nombres.add("Leia");
        nombres.add("Juan");

        Stream<String> valores = nombres.stream()
                .map(x -> "Hola, " + x.toUpperCase());
                 //.filter(x -> x.startsWith("J"));
        valores.forEach(x -> System.out.println(x));
    }
    }




