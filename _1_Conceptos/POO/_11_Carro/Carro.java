package _1_Conceptos.POO._11_Carro;

public class Carro {
    
    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    int velocidad = 0 ;

    // constructores
    public Carro () {
        
    }

    public Carro (String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamientos (metodos/funciones)
    public void acelerar(int cantidad) {
        this.velocidad += cantidad;
    }
}