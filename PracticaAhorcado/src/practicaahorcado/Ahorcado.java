package practicaahorcado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Jorge
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] palabra = new String[20];
        int ran;
        int err;
        String res[];
        
        palabra[0] = "Costa Rica".toUpperCase();
        palabra[1] = "Saprissa".toUpperCase();
        palabra[2] = "Universidad".toUpperCase();
        palabra[3] = "Zapato".toUpperCase();
        palabra[4] = "Carro".toUpperCase();
        palabra[5] = "Alajuelense".toUpperCase();
        palabra[6] = "Heredia".toUpperCase();
        palabra[7] = "Ingenieria".toUpperCase();
        palabra[8] = "Sistemas".toUpperCase();
        palabra[9] = "Perro".toUpperCase();
        palabra[10] = "Gato".toUpperCase();
        palabra[11] = "Caballo".toUpperCase();
        palabra[12] = "Naranja".toUpperCase();
        palabra[13] = "Manzana".toUpperCase();
        palabra[14] = "Profesor".toUpperCase();
        palabra[15] = "Telefono".toUpperCase();
        palabra[16] = "Argentina".toUpperCase();
        palabra[17] = "Alemania".toUpperCase();
        palabra[18] = "Brasil".toUpperCase();
        palabra[19] = "Uruguay".toUpperCase();
        
        ran = (int) 0 + (int) (Math.random() * ((palabra.length - 1) + 1));
        String pal[] = palabra[ran].split(" ");
        res = new String[palabra[ran].length() + 1];
        int j = 0;
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                System.out.println("_ ");
                res[j++] = "_";
            }
            System.out.println("\n");
            res[j++] = " ";
        }
    }
    }