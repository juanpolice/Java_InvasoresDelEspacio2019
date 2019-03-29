/* 
@autor Juan Dieguez Kindelan
*/
package codigo;

import java.awt.Image;

/**
 *
 * @author Guillermo Maroto
 */
public class Marciano {
    public Image imagen1, imagen2 = null;
    public int x = 1;
    public int y = 0;
    private int vX = 1;
    public boolean vivo = true; 
              
    public Marciano(){
       
        
    }
    
    public void mueve(){
        x += vX;
    }

    public void setvX(int vX) {
        this.vX = vX;
    }

    public int getvX() {
        return vX;
    }
}
