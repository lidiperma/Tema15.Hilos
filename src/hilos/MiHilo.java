
package hilos;


public class MiHilo extends Thread {
    
    public void run() {
    
        // Presenta en pantalla información sobre este hilo en particular
        System.out.println(Thread.currentThread());
    
    }  
}
