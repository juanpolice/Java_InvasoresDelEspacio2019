/* 
@autor Juan Dieguez Kindelan
*/
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Guillermo Maroto
 */
public class Disparo {
    public Image imagen = null;
    public int x = 0;
    public int y = 2000;
    public boolean disparado = false;
    
    public Disparo (){
        try {
            imagen  = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
        } catch (IOException ex) {
            
        }
    }
    
    public void mueve(){
        if(disparado){
        y -= 5;
        }
    }
    
    public void posicionaDisparo(Nave _nave){
        x = _nave.x + _nave.imagen.getWidth(null)/2 - imagen.getWidth(null) / 2;
        y = _nave.y;
    }
}
