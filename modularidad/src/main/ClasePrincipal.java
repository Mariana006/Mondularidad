package main;
//se pone import enseguida el nombre del paquete despues la clase hija 
import operaciones.ClaseHija_resta;
import operaciones.ClaseHija_suma;
import operaciones.ClaseHija_mul;
import operaciones.ClaseHija_di;
//clase 
public class ClasePrincipal {
    public static void main(String[] args) {
        
        //Creaccipon del objeto , creamos un objeto de la clase  ClaseHija_suma
        ClaseHija_suma mensajeroSuma = new ClaseHija_suma();// esta linea es declaracion de instancia a la clase
       //mandamos imprimir PedirDatos
        System.out.println("------ SUMA-----");
        //mandamos a llamar al objeto masajeroSuma.mas el metodo , mostra el contenido del metodo 
        mensajeroSuma.PedirDatos();
         //mandamos a llamar al objeto masajeroSuma.mas el metodo , mostra el contenido del metodo 
        mensajeroSuma.Sumar();
        //se imprime el mensaje en pantalla 
        System.out.print("El resultado de la suma es: " );
        //te inprime el resultado de la operacion del metodo suma
        mensajeroSuma.MostrarResultado();
        //Imprime un salto de linea
          System.out.println();
        
        System.out.println("------ RESTA-----");
        //creamos un objeto mensajeroResta
        ClaseHija_resta mensajeroResta= new ClaseHija_resta();
        //declaramos el objeto seguido del metodo
        mensajeroResta.PedirDatos();
         //declaramos el objeto seguido del metodo
        mensajeroResta.Restar();
         //se imprime el mensaje en pantalla 
        System.out.print("El resusltado de la resta es: ");
        //te inprime el resultado de la operacion del metodo restar
        mensajeroResta.MostrarResultado();
      //Imprime un salto de linea
          System.out.println();
        
        System.out.println("------ MULTIPLICACION-----");
        //creamos un objeto llamado "m"
        ClaseHija_mul m=new ClaseHija_mul();
        m.PedirDatos();
        m.Multiplicacion();
         //se imprime el mensaje en pantalla 
        System.out.print("El resusltado de la multiplicacion es: ");
        //te inprime el resultado de la operacion del metodo multiplicacion
        m.MostrarResultado();
        //Imprime un salto de linea
          System.out.println();
        
        System.out.println("------ DIVISION-----");
        ClaseHija_di op =new ClaseHija_di();
        op.PedirDatos();
        op.Division();
         //se imprime el mensaje en pantalla 
        System.out.print("El resusltado de la division es: ");
        //te inprime el resultado de la operacion del metodo division
        op.MostrarResultado();
    }
}
