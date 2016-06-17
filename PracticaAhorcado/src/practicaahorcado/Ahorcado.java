package practicaahorcado;
import java.io.PrintStream;
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
    public static void main(String[] args){
        // TODO code application logic here
        String [] palabras=
        //Palabras
        {"Saprissa".toUpperCase(),
        "Universidad".toUpperCase(),
        "Zapato".toUpperCase(),
        "Carro".toUpperCase(),
        "Alajuelense".toUpperCase(),
        "Heredia".toUpperCase(),
        "Ingenieria".toUpperCase(),
        "Sistemas".toUpperCase(),
        "Perro".toUpperCase(),
        "Gato".toUpperCase(),
        "Caballo".toUpperCase(),
        "Naranja".toUpperCase(),
        "Manzana".toUpperCase(),
        "Profesor".toUpperCase(),
        "Telefono".toUpperCase(),
        "Argentina".toUpperCase(),
        "Alemania".toUpperCase(),
        "Brasil".toUpperCase(),
        "Uruguay".toUpperCase(),};
        String linea, palabra=palabras[(int)(Math.random()*palabras.length)];
        int i, n=palabra.length(), turnos =0, aciertos = 0, oportunidades=6;
        char letra, caracter;
        char[] casillas=new char[n];
        boolean encontrado;
        for (i=0;i<n; i++)
        {
            casillas[i]='_';
        }
        Scanner teclado;
        PrintStream out;
        do
        {
            System.out.println("Oportunidades restantes: " + (oportunidades=turnos));
            for (i=0;i<n;i++)
            {
                System.out.println(""+casillas[1]);
            }
            System.out.println("\nEscriba una letra; ");
            do
            {
                linea=(JOptionPane.showInputDialog(null, "Escriba una letra", "Letra", JOptionPane.QUESTION_MESSAGE));
            }
            while(linea.isEmpty());
            letra=linea.charAt(0);
            encontrado= false;
            for(i=0;i<n; i++)
            {
                caracter=palabra.charAt(i);
                if(Character.toUpperCase(letra)==Character.toUpperCase(caracter))
                {
                    encontrado=true;
                    if (casillas[1]=='_')
                    {
                        casillas[1]=caracter;
                        aciertos++;
                    }
                }
            }
            if(!encontrado)
            {
                turnos++;
                System.out.println("Letra no encontrada");
            }
        }
        while(turnos<oportunidades && aciertos<n);
        if (aciertos==n)
        {
            System.out.println("Felicidades, has ganado");
        }
        else
        {
            System.out.println("Has Perdido");
        }
        System.out.println("La palabra secreta era: "+palabra+ "\n\n");
        }
    }