
package s7ejercicio01;

public class S7Ejercicio01 {

    public static void main(String[] args){
        Menu menuHoy = new Menu();
        
        System.out.println("MENU 1");
        menuHoy.agregarComida("Ensalada");
        menuHoy.agregarComida("Lomo Saltado");
        menuHoy.agregarComida("Arroz con Pollo");
        menuHoy.agregarComida("Pollo a la Brasa");
      
        menuHoy.imprimirComidas();

        menuHoy.limpiarMenu();
        
        System.out.println("");
        System.out.println("MENU 2");
        menuHoy.agregarComida("Seco de Pollo");
        menuHoy.agregarComida("Arroz Chaufa");
        menuHoy.agregarComida("Tallarin Saltado");
        menuHoy.agregarComida("Ceviche");
        menuHoy.imprimirComidas();        
    }   
    
}
class Menu {
    String menu[]=new String[4];
public void agregarComida(String comida)
{
    for(int i=0;i<4;i++)
    {
        menu[i]=comida;
    }
 
        
 
}
public void imprimirComidas()
{for(int i=0;i<4;i++)
    {
        System.out.println(""+menu[i]);
    }
    
}
public void limpiarMenu()
{
}
    
}
