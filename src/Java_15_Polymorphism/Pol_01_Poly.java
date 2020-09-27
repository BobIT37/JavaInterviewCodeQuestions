package Java_15_Polymorphism;

public class Pol_01_Poly {

		//Polymorphism is one of the OOPs feature that allows us to perform a single action in different ways.
		
		 public void sound(){
		      System.out.println("Animal is making a sound");   
		   }
}

class Horse extends Pol_01_Poly{

    @Override
    public void sound(){
        System.out.println("Neigh");
    }
}

class Cat extends Pol_01_Poly{

    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

     /*
      * NOTES
      * Compile time polymorphism is overloading (static poly) (static binding)
      * Runtime polymorphism is overriding (dynamic poly) (dynamic binding)
      * 
      */ 
