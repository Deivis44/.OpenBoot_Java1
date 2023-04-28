package _1_Conceptos._1_2_Estructuras;

public class _9_Continue_Break {
    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            count++; 

            if (count == 5) {
                continue;
            }
            System.out.println("Soy el numero: " + count);
        }
        
        System.out.println("\nAsí es, me salte al numero 5");
    }
}
