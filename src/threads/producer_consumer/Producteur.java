package threads.producer_consumer;

// Producteur.java
public class Producteur extends Thread 
{
    private Buffer buf;
    private int identit�;
    public Producteur(Buffer c, int n) 
    {
        buf = c; this.identit� = n;
    }		
    
public void run() {
   for (int i = 0; i < 100; i++) {
       buf.mettre(i);
       System.out.println("Producteur #" + this.identit� 
                        + " met : " + i);
       try { sleep((int)(Math.random() * 100));}
       catch (InterruptedException e) { }
       }
    }
}