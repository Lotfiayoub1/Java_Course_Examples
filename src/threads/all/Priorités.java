package threads.all;

class Priorit�s extends Thread{  
	final String v = "lock" ;
	 public void run(){
		 synchronized(v)
		 {
			 System.out.println("�xecution du thread nomm� : "+Thread.currentThread().getName());/*	->ou bien getName()*/
			 System.out.println("sa priorit� vaut donc :     "+Thread.currentThread().getPriority());/*->getPriority()*/ 
		 }
	   
	  }  
	 
	 public static void main(String args[]){  
		 
	Priorit�s m1=new Priorit�s(); 
	Priorit�s m2=new Priorit�s();
	
	/**modification des noms */
	m1.setName("<1>");
	m2.setName("<2>");
	
	/**modification de priorit�s */
	/*m1.setPriority(Thread.MIN_PRIORITY);  
	m2.setPriority(Thread.MAX_PRIORITY);*/
	  
	  m1.start();  
	  m2.start();  
	   
	 }  
}