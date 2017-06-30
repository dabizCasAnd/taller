
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    private String[] elementsMenu;
    /**
     * Constructor for objects of class Menu
     */
    public Menu(String[] elementsMenu)
    {
       this.elementsMenu = elementsMenu;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showMenu()
    {
        System.out.println(this.elementsMenu);
    }
    
    public void hideMenu()
    {
        System.out.println(this.elementsMenu);
    }
}
