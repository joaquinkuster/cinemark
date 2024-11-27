package frames;

import frames.*;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class PantallaCargandoMain {

  
    PantallaCargando screen;
    Login ventana;
    
  public PantallaCargandoMain() {
    inicioPantalla();
	screen.velocidadDeCarga();
	pantallaBienvenida();
  }

  private void pantallaBienvenida() {
	  
	ventana = new Login();
	ventana.setVisible(true);
	  
  }
  
  private void inicioPantalla() {
    ImageIcon myImage = new ImageIcon(getClass().getResource("/images/screen.jpg"));
    screen = new PantallaCargando(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(1000);
    screen.setVisible(true);
  }

  public static void main(String[] args)
  {
    new PantallaCargandoMain();
    
  }
}