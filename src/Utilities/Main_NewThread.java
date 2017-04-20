
package Utilities;

import hilos.NewThread;


public class Main_NewThread {


    public static void main(String args[]) {
        
        NewThread ob1 = new NewThread("Uno");
        NewThread ob2 = new NewThread("Dos");
        NewThread ob3 = new NewThread("Tres");
        
        System.out.println("El hilo Uno está vivo: " + ob1.t.isAlive());
        System.out.println("El hilo Dos está vivo: " + ob2.t.isAlive());
        System.out.println("El hilo Tres está vivo: " + ob3.t.isAlive());
        
        try {
        
            System.out.println("Espera finalización de los otros hilos.");
            ob1.t.join(); ob2.t.join(); ob3.t.join();
        
        } catch (InterruptedException ex) {

            System.out.println("Interrupcion del hilo principal"); 
        }
        
        System.out.println("El hilo Uno está vivo: " + ob1.t.isAlive());
        System.out.println("El hilo Uno está vivo: " + ob2.t.isAlive());
        System.out.println("El hilo Uno está vivo: " + ob3.t.isAlive());
        System.out.println("Sale del hilo principal.");
    }
    
}
