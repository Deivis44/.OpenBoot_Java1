package _1_Conceptos;
public class _13_Strings {
    
    public static void main(String[] args) {
        
        String mensaje = "   Hola mundo   ";
        System.out.println(mensaje.length()); // = 10
        
        String msjMAYUS = mensaje.toUpperCase();
        System.out.println(msjMAYUS);
        System.out.println(msjMAYUS.trim()); // quita espacios en blanco

        msjMAYUS =  msjMAYUS.trim();

        String otro = "HOLA MUNDO";
        String otro2 = "hola mundo";

        if (msjMAYUS.equals(otro)) { // compara si son iguales
            System.out.println("Son iguales");
        }
        
        if (msjMAYUS.equalsIgnoreCase(otro2)) {
            System.out.println("Son iguales"); // a pesar de las minusculas de otro2
        }
    }
}
