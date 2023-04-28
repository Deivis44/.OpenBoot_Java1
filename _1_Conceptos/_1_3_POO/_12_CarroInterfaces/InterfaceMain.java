package _1_Conceptos._1_3_POO._12_CarroInterfaces;
import _1_Conceptos._1_3_POO._11_Carro.Carro;

public class InterfaceMain {
    
    public static void main(String[] args) {
        
        CarroService service = new CarroServiceClassImpl();
        Carro carro1 = service.crearCarro();
        carro1.acelerar(50);
    }
}
