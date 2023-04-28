package _1_Conceptos._1_2_Estructuras;

public class _10_Switch {
    public static void main(String[] args) {
        
        String clima = "soleado";

        switch (clima) {
            case "soleado":
                System.out.println("Es un día soleado");
                break;
            case "lluvioso":
                System.out.println("Es un día lluvioso");
                break;
            default:
                System.out.println("Ese estado no existe");
                break;
        }
    }
}
