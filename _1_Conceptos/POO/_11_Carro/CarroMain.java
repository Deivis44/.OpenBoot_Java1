package _1_Conceptos.POO._11_Carro;

public class CarroMain {

    public static void main(String[] args) {
        
        Carro objCarro = new Carro("morado", "McClaren", "Drac", 128.5, 30.5);
        objCarro.acelerar(50);

        CarroElectrico objCarroElectrico = new CarroElectrico();
        objCarroElectrico.motorElectrico = "Ferrari 01";

        CarroElectrico objCarroElectrico2 = new CarroElectrico("Morado", "Mazda", "002", 310.6, 129.8, "vc1-electrico");
        objCarroElectrico2.motorElectrico = "Ferrari 02";
    }
}
