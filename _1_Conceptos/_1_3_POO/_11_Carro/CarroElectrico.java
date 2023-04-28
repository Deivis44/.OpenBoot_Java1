package _1_Conceptos._1_3_POO._11_Carro;

public class CarroElectrico extends Carro {

    // atributos
    String motorElectrico;

    // constructores
    public CarroElectrico() {

    }

    public CarroElectrico (String motor) {
        this.motorElectrico = motor;
    }

    public CarroElectrico (String color, String fabricante, String modelo, Double peso, Double largo, String motor) {
        super(color, fabricante, modelo, peso, largo); // ! adquiero el metodo constructor de la clase padre
        this.motorElectrico = motor;
    }

    // metodos
    @Override
    public void acelerar(int cantidad) {
        int cantidadElectrico = cantidad * 2;
        super.acelerar(cantidadElectrico);
    }
}
