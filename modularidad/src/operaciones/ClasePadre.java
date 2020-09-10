package operaciones;
//libreria 
import java.util.Scanner;

public class ClasePadre {
 //variables glovales
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    //se crea un metodo este se encargara de pedir los datos al usuario 
    public void PedirDatos(){
        
        //Imprime el mensaje en pantalla
        System.out.print("Dame el primer valor:");
        //estamos indicando en donde se va almacenar el dato ingresado
        valor1= entrada.nextInt();
        //Imprime el mensaje en pantalla
        System.out.print("Dame el segundo valor:");
        //estamos indicando en donde se va almacenar el dato ingresado
        valor2= entrada.nextInt();
    }
    //Este metodo muestra el resultado
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
