
package Utilities;

import hilos.MiHilo;


public class Main_MiHilo {

    
    public static void main(String args[]) {
        
        // Se instancian dos nuevos objetos Thread
        Thread hiloA = new MiHilo();
        Thread hiloB = new MiHilo();
        
        // Se arrancan los dos hilos, para que comiencen su ejecución
        hiloA.start();
        hiloB.start();
        
        // Aquí se retrasa la ejecución un segundo y se captura la
        // posible excepción que genera el método, aunque no se hace
        // nada en el caso de que se produzca
        
        try {
            
            Thread.currentThread().sleep(1000);
            
        } catch (InterruptedException ex) {}
        
        // Presenta información acerca del Thread o hilo principal
        // del programa
        System.out.println(Thread.currentThread());
        
        // Se detiene la ejecución de los dos hilos con stop()
        hiloA.stop();
        hiloB.stop();
    }
    
}
