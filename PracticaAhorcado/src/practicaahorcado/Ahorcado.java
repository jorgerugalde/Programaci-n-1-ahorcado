package practicaahorcado;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        String[] palabras = new String[20];
        
        palabras[0] = "Costa Rica".toUpperCase();
        palabras[1] = "Saprissa".toUpperCase();
        palabras[2] = "Universidad".toUpperCase();
        palabras[3] = "Zapato".toUpperCase();
        palabras[4] = "Carro".toUpperCase();
        palabras[5] = "Alajuelense".toUpperCase();
        palabras[6] = "Heredia".toUpperCase();
        palabras[7] = "Ingenieria".toUpperCase();
        palabras[8] = "Sistemas".toUpperCase();
        palabras[9] = "Perro".toUpperCase();
        palabras[10] = "Gato".toUpperCase();
        palabras[11] = "Caballo".toUpperCase();
        palabras[12] = "Naranja".toUpperCase();
        palabras[13] = "Manzana".toUpperCase();
        palabras[14] = "Profesor".toUpperCase();
        palabras[15] = "Telefono".toUpperCase();
        palabras[16] = "Argentina".toUpperCase();
        palabras[17] = "Alemania".toUpperCase();
        palabras[18] = "Brasil".toUpperCase();
        palabras[19] = "Uruguay".toUpperCase();
        
        String linea, palabra=palabras[(int)(Math.random()*palabras.length)];
        int i, n=palabra.length(), turnos =0, aciertos = 0, oportunidades=6;
        char letra, caracter, cabeza=' ', cuerpo = ' ',manoIzquierda = ' ', manoDerecha=' ', pieIzquiero=' ', pieDerecho=' ';
        char[] casillas=new char[n];
        boolean encontrado;
        for (i=0;i<n; i++);
        {
            casillas[i]='_';
        }
        Scanner teclado;
        PrintStream out;
        if (System.getProperties().get("os.name").equals("Linux")||System.console()==null)
        {
            teclado=new Scanner(System.in);
            out=new PrintStream(System.out);
        }
        else
        {
            teclado=new Scanner(System.in);
            out=new PrintStream(System.out, true);
        }
        do
        {
            out.println("Oportunidades restantes: " + (oportunidades=turnos));
            for (i=0;i<n;i++)
            {
                out.println(""+casillas[1]);
            }
            out.println("\nEscriba una letra; ");
            do
            {
                linea=teclado.nextLine();
            }
            while(linea.isEmpty());
            letra=linea.charAt(0);
            encontrado= false;
            for(i=0;i<n; i++);
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
                out.println("Letra no encontrada");
            }
        }
        while(turnos<oportunidades && aciertos<n);
        if (aciertos==n)
        {
            out.println("Felicidades, has ganado");
        }
        else
        {
            out.println("Has Perdido");
        }
        out.println("La palabra secreta era: "+palabra+ "\n\n");
        }
    }