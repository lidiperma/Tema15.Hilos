
package hilos;

//EJEMPLO RARO
public class NewThread implements Runnable {
    
    public String name; // nombre del hilo
    public Thread t;
    
    // Constructor de un nuevo objeto runnable de la clase NewThread:
    public NewThread (String threadname) {
        name = threadname;
        t = new Thread(this, name); // Constructor de un nuevo thread
        System.out.println("Nuevo hilo: " +t);
        t.start(); // Aquí comienza el hilo
    }

    public void run() {
        
        try {
            
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                System.out.println("Esperando "+t);
                Thread.sleep(5000);}
                 System.out.println("Ya no espero "+t);
            
        } catch (InterruptedException ex) {
            
            System.out.println("Interrupción del hilo: " + name);}
        
        System.out.println("Sale del hilo " + name);
    }
        
}
    
    
    
/*
@Override public void run() {
        
        try {
            
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
                
        } catch (InterruptedException e) {
            
            System.out.println("Interrupción del hilo: " + name);}
        
        System.out.println("Sale del hilo " + name);} catch (InterruptedException ex) {
            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
*/
