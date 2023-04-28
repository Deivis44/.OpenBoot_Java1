package _1_Conceptos._1_4_Listas;

import java.util.*;

public class _15_ArrayList {
    
    public static void main(String[] args) {
        
        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for (String items : nombres) {
            System.out.println(items);
        }


        List<_15_CarroLista> carros = new ArrayList<>();

        carros.add(new _15_CarroLista("ford"));
        carros.add(new _15_CarroLista("mazda"));
        carros.add(new _15_CarroLista("ferrari"));

        for (_15_CarroLista carro : carros) {
            System.out.println(carro.getNombre());
        }
        
        // ? o también
        // for (int i = 0; i < carros.size(); i++) {
        //     CarroLista carro = carros.get(i);
        //     System.out.println(carro.getNombre());
        // }
    }
}
