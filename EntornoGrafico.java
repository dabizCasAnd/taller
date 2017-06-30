
/**
 * Write a description of class EntornoGrafico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EntornoGrafico implements EntornoGraficoInterface
{
    private Menu menuActual;
    private PanelInfo panelActual;
    
    //STACK PARA GUARDAR HISTORIAL DE MENUS
    
    private static final String menuLoggin[] = {
        "0. Salir del programa",
        "1. login User"
    };
    
    private static final String menuPrincipal[] = {
        "0. Salir del programa",
        "1. Gestion de clientes",
        "2. Gestion de vehiculos",
        "3. Gestion de partes de reparacion",
        "4. Gestión usuarios aplicación"
    };
    
    private static final String menuGestionClientes[] = {
        "0. Salir del programa",
        "1. Gestion de clientes",
        "2. Gestion de vehiculos",
        "3. Gestion de partes de reparacion",
        "4. Gestión usuarios aplicación"
    };
    
    private static final String menuGestionVehiculos[] = {
        "0. Salir del programa",
        "1. Gestion de clientes",
        "2. Gestion de vehiculos",
        "3. Gestion de partes de reparacion",
        "4. Gestión usuarios aplicación"
    };
    
    private static final String menuGestionPartes[] = {
        "0. Salir del programa",
        "1. Gestion de clientes",
        "2. Gestion de vehiculos",
        "3. Gestion de partes de reparacion",
        "4. Gestión usuarios aplicación"
    };
    
    private static final String menuGestionUsuarios[] = {
        "0. Salir del programa",
        "1. Gestion de clientes",
        "2. Gestion de vehiculos",
        "3. Gestion de partes de reparacion",
        "4. Gestión usuarios aplicación"
    };

    /**
     * Constructor for objects of class EntornoGrafico
     */
    public EntornoGrafico()
    {
       menuActual = new Menu(menuLoggin);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startEntorno()
    {
        menuActual.showMenu();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void stopEntorno()
    {
        menuActual.showMenu();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showMenuNuevo(int numMenu)
    {
        menuActual = new Menu(menuPrincipal);
        menuActual.showMenu();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showPanelNuevo(String info)
    {
        System.out.print(info);
    }
}
