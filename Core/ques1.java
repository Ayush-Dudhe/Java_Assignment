abstract class Car{  
  abstract void run();  
}  
class Ford extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Car obj = new Ford();  
 obj.run();  
}  
} 