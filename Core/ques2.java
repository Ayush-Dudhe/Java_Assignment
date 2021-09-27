public class TestEncapsulation {  
public static void main(String[] args) {  
 
    Account acc=new Account();  
     
    acc.setAcc_no(123456789);  
    acc.setName("Ayush");  
    
    
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" );  
}  
}  