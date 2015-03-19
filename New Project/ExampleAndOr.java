public class ExampleAndOr{

     public static void main(String []args){
         int x, y;
         x = -7;
         y = 3;
         //&& - and
         if(x > 0 && y > 0){
             System.out.println("Oba su pozitivna");
             // || - or
         }else if(x > 0 || y > 0){
             System.out.println("Bar jedan je pozitivan");
         }else{
             System.out.println("Nijedan broj nije pozitivan");
         }
         
     }
     
}