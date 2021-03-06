package aula3;

import java.util.ArrayList;

public class matrizes {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        int c = 2;

        for (int i = 0; i < c; i++) {
            matriz.add(new ArrayList<>());
        }
        // #region abastecimento das matrizes
        matriz.get(0).add(1);
        matriz.get(0).add(1);
        matriz.get(0).add(14);
        matriz.get(1).add(3);
        matriz.get(1).add(1);
        matriz.get(1).add(24);
        // #endregion
        // #region organização das matrizes
        System.out.println(matriz.get(0));
        System.out.println(matriz.get(1));
        // #endregion
        double y = ((matriz.get(1).get(0) * matriz.get(0).get(2)) - matriz.get(1).get(2))
                / (matriz.get(1).get(0) + matriz.get(0).get(0));
        double x = (matriz.get(0).get(2) - y);

        System.out.println("Y = " + y);
        System.out.println("X = " + x);
    }
}