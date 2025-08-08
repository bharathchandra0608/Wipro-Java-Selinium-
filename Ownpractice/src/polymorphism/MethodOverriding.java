package polymorphism;

public class MethodOverriding {
	
   public String game(String gameName , int gameId) {
	   System.out.println(gameName);
	   return gameName;
   }
   
   
   class Example extends MethodOverriding{
	  
	   @Override
	  public String game(String gameName , int gameId){
		   
		  System.out.println("this is override method");
		  return gameName;
	   }
	   
	   public static void main(String [] args) {
		   MethodOverriding me = new MethodOverriding();
		   Example ex = me. new Example();
		  String ggnn = ex.game("football", 1);
		  System.out.println(ggnn);
	   }
   }
}
