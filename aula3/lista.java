package aula3;

import java.util.ArrayList;
import java.util.List;

public class lista {

    public static void main(String[] args) {

        ArrayList<Integer> lista0 = new ArrayList<>();

        List lista1 = new ArrayList<Integer>();

        var lista2 = new ArrayList<Integer>();

        // System.out.println(lista0.getClass());
        // System.out.println(lista1.getClass());
        // System.out.println(lista2.getClass());

        lista1.add("arroz");
        lista1.add("biscoito");
        lista1.add("feijao");
        lista1.add("massas");
        lista1.add("leite");
    
        System.out.println("-----------lista sem alterações------------");
        System.out.println(lista1);
        System.out.println("-----------lista com alterações------------");
        lista1.set(2, "pedra");
        System.out.println(lista1);
        System.out.println("-----------lista com remoções------------");
        lista1.remove(2);
        System.out.println(lista1);
    }
}
