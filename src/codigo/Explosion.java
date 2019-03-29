/* 
@autor Juan Dieguez Kindelan
*/
package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;

/**
 *
 * @author guill
 */
public class Explosion {
    Clip sonidoExplosion;
    Image imagenExplosion = null;
    Image imagenExplosion2 = null;
    
        //posición x-y de la explosion
    private int x = 0;
    private int y = 0;
    private int tiempoDeVida = 50;

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    
    public Explosion (){
        try {
//            sonidoExplosion = AudioSystem.getClip();
//            sonidoExplosion.open(AudioSystem.getAudioInputStream(
//                     getClass().getResource("/sonidos/explosion.wav")));
            imagenExplosion = ImageIO.read((getClass().getResource("/imagenes/explosion8.png")));
            imagenExplosion2 = ImageIO.read((getClass().getResource("/imagenes/explosion11.png")));
            
        } catch (Exception ex) {
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
