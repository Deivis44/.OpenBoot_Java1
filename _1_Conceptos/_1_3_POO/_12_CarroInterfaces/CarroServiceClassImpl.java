package _1_Conceptos._1_3_POO._12_CarroInterfaces;
import _1_Conceptos._1_3_POO._11_Carro.Carro;
import _1_Conceptos._1_3_POO._11_Carro.CarroElectrico;

public class CarroServiceClassImpl implements CarroService {

    @Override
    public Carro crearCarro() {
        System.out.println("Se crea un carro clasico");
        return new CarroElectrico();
    }    
}
