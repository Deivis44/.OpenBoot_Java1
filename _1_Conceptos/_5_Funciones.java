package _1_Conceptos;

public class _5_Funciones {

    public static void main(String[] args) {
        
        holaMundo();
        holaMundo("Alan");

        String hola = devolverHola();
        System.out.println(hola);
    }
    
    private static void holaMundo() {
        System.out.println("Hola mundo!");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola mundo, mi nombre es: " + name);
    }

    private static String devolverHola() {
        return "Adios mundo feo";
    }

}


