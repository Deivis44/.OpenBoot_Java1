package _1_Conceptos._1_3_POO._11_Carro;

public class PolimorfismoMain {
    public static void main(String[] args) {
        
        // Carro carro1 = new Carro();
        // carro1.fabricante = "Toyota";

        CarroElectrico carro2 = new CarroElectrico();
        carro2.color = "amarillo";

        // polimorfismo
        Carro carro3 = new CarroElectrico();
        carro3.modelo = "sabra dios";

        if (carro3 instanceof Carro) { // si carro3 pertenece a la clase carro, de la que hereda
            System.out.println("Es un carro en general");
        }
    }
}
