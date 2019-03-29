/*
 * Programacion de la Nave
 */
/* 
@autor Juan Dieguez Kindelan
*/
package codigo;

import java.awt.Image;

/**
 *
 * @author Guillermo Maroto
 */
public class Nave {
    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    
    public Nave (){
        
    }
    
    public void mueve(){
        if(pulsadoIzquierda && x > 0){
            x-=3;
        }
        if(pulsadoDerecha && x < VentanaJuego.ANCHOPANTALLA - imagen.getWidth(null)){
            x+=3;
        }
    }

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
        this.pulsadoDerecha = false;
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
        this.pulsadoIzquierda = false;
    }
}
