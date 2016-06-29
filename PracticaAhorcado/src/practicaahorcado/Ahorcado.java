package practicaahorcado;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Jorge
 */
public class Ahorcado {
    /**
     * @param args the command line arguments
     */
    public Ahorcado(){
        // TODO code application logic here
        String op = JOptionPane.showInputDialog(null, "1.-Ingeniería\n" + "2.-Frutas\n");
        int opciones = Integer.parseInt(op);
        switch(opciones){
            case 1:
              System.out.println("Escogió la categoría de Ingenieria");
         Scanner scanner = new Scanner(System.in);         
        String [] listaPalabras = new String[10]; {
            listaPalabras[0]="Computadora".toUpperCase();
            listaPalabras[1]="Ingeniero".toUpperCase();
            listaPalabras[2]="Software".toUpperCase();
            listaPalabras[3]="Hardware".toUpperCase();
            listaPalabras[4]="Laboratorio".toUpperCase();
            listaPalabras[5]="desarrollo".toUpperCase();
            listaPalabras[6]="entornos".toUpperCase();
            listaPalabras[7]="lenguajes".toUpperCase();
            listaPalabras[8]="programacion".toUpperCase();
            listaPalabras[9]="java".toUpperCase();}
        //Elegimos un numero random, que sera el numero de palabra que legiremos de la lista de palabras
        int numeroRandom = 1 + new Random().nextInt(listaPalabras.length);
        //
        String palabraEscogida = listaPalabras[numeroRandom];//Guardamos la palabra escogida por la pc en una variable
        System.out.println("Esta palabra tiene "+palabraEscogida.length()+" letras");
        String[] palabra = new String[palabraEscogida.length()];//si se llena todos los espacios de este array es que ha ganado el juego
        imprimirPalabra(palabra);//Mostramos las rayitas
        int vidas = 11;//Contador de vidas
        //
        while(true) {
            System.out.println("*************************************************");
            System.out.println("Escoge una letra");
            String letraElegidaPorUsuario = scanner.nextLine().toUpperCase();
            String[] letras = palabraEscogida.split("");
            int contador = -1;
 
            boolean acertoAlguna = false;
            //Recorremos cada letra de la palabra para comprobar si hay una igualdad
            for (String letra : letras) {
                if(letraElegidaPorUsuario.equals(letra)) {
                    palabra[contador] = letraElegidaPorUsuario;
                    acertoAlguna = true;
                }
                contador++;
            }
            if(acertoAlguna) {
                System.out.println("Has acertado una palabra");
                System.out.println("Te quedan "+vidas+" vidas");
            }
            else{
                vidas --;
                System.out.println("No has acertado ninguna palabra");
                if(vidas == 0) {
                    System.out.println("Se te acabaron las vidas, quedas ahorcado x(");
                    break;
                }
                else{
                    System.out.println("Te quedan "+vidas+" vidas");
                }
            }
            System.out.println("Hasta el momento vas: ");
            imprimirPalabra(palabra);
            contador = 0;
            acertoAlguna = false;
            if (gano(palabra)){
                JOptionPane.showMessageDialog(null,"GANO!!!");
                System.out.println("Has completado la palabra");
                break;
            }
            }
            break;
          //caso 2
            case 2:
                System.out.println("Escogió la categoría de FRUTAS");
                Scanner scanner2 = new Scanner(System.in);         
        String [] listaPalabras2 = new String[10]; {
            listaPalabras2[0]="Manzana".toUpperCase();
            listaPalabras2[1]="Piña".toUpperCase();
            listaPalabras2[2]="Naranja".toUpperCase();
            listaPalabras2[3]="Limon".toUpperCase();
            listaPalabras2[4]="Pera".toUpperCase();
            listaPalabras2[5]="Mandarina".toUpperCase();
            listaPalabras2[6]="Melon".toUpperCase();
            listaPalabras2[7]="Sandia".toUpperCase();
            listaPalabras2[8]="Banano".toUpperCase();
            listaPalabras2[9]="Kiwi".toUpperCase();}
        //Elegimos un numero random, que sera el numero de palabra que legiremos de la lista de palabras
        int numeroRandom2 = 1 + new Random().nextInt(listaPalabras2.length);
        //
        String palabraEscogida2 = listaPalabras2[numeroRandom2];//Guardamos la palabra escogida por la pc en una variable
        System.out.println("Esta palabra tiene "+palabraEscogida2.length()+" letras");
        String[] palabra2 = new String[palabraEscogida2.length()];//si se llena todos los espacios de este array es que ha ganado el juego
        imprimirPalabra(palabra2);//Mostramos las rayitas
        int vidas2 = 11;//Contador de vidas
        //
        while(true) {
            System.out.println("*************************************************");
            System.out.println("Escoge una letra");
            String letraElegidaPorUsuario = scanner2.nextLine().toUpperCase();
            String[] letras = palabraEscogida2.split("");
            int contador = -1;
 
            boolean acertoAlguna = false;
            //Recorremos cada letra de la palabra para comprobar si hay una igualdad
            for (String letra : letras) {
                if(letraElegidaPorUsuario.equals(letra)) {
                    palabra2[contador] = letraElegidaPorUsuario;
                    acertoAlguna = true;
                }
                contador++;
            }
            if(acertoAlguna) {
                System.out.println("Has acertado una palabra");
                System.out.println("Te quedan "+vidas2+" vidas");
            }
            else{
                vidas2 --;
                System.out.println("No has acertado ninguna palabra");
                if(vidas2 == 0) {
                    System.out.println("Se te acabaron las vidas, quedas ahorcado x(");
                    break;
                }
                else{
                    System.out.println("Te quedan "+vidas2+" vidas");
                }
            }
            System.out.println("Hasta el momento vas: ");
            imprimirPalabra(palabra2);
            contador = 0;
            acertoAlguna = false;
            if (gano(palabra2)){
                JOptionPane.showMessageDialog(null,"GANO!!!");
                System.out.println("Has completado la palabra");
                break;
             }
            }
            break;
        }
    }
    //
    public void imprimirPalabra(String[] palabra) {
        //Este metodo imprime las letras que ha acertado el usuario hasta el momento.
        for (String letra : palabra) {
            if(letra != null) {
                System.out.print(letra);
            }
            else{
                System.out.print("-");
            }
        }
        System.out.println("");
    }
    //
    public boolean gano(String[] palabra) {
        boolean gano = true;
        
        for (String letra : palabra) {
            if(letra == null) {
                gano = false;
                break;
            }
        }
        return gano;
    }

    //
    public static void main(String[] args) {
        //String[] asd = new String[10];
        new Ahorcado();
    }

}