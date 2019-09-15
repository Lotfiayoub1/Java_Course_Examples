package threads.producer_consumer;

public class Consommateur extends Thread {
    private Buffer buf;
    private int identit�;
     public Consommateur(Buffer c, int n) {
        buf = c;
        this.identit� = n;
    }
     
    public void run() {
        int val = 0;
        for (int i = 0; i < 10; i++) {
            val = buf.prendre();
            System.out.println("Consommateur #" + 
                  this.identit� + " prend: " + val);
        }
    }
}