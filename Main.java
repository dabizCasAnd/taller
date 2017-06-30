import java.util.Scanner; 
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private EntornoGrafico interfazUsuario;
    private Scanner userEvents;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        this.interfazUsuario = new EntornoGrafico();
        interfazUsuario.startEntorno();
        
        userEvents = new Scanner(System.in);
        interfazUsuario.showMenuNuevo(1);
        
        Vehiculo coche1 = new Vehiculo();
        String modeloVevhiculo = coche1.getModelo();
        
        interfazUsuario.showPanelNuevo(modeloVevhiculo);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /*public static void main()
    {
        interfazUsuario.startEntorno();
    }*/
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void cambiaMenu()
    {
        
    }
}
