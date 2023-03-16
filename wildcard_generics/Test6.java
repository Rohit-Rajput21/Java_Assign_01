import java.util.ArrayList;
import java.util.List;

public class Test6 {

   public static void addCat(List<? super Cat> catList) {  // cat and it's super class that is Animal and Object
      catList.add(new RedCat());
      System.out.println("Cat Added");
   }

   public static void main(String[] args) {
      List<Animal> animalList= new ArrayList<Animal>();
      List<Cat> catList= new ArrayList<Cat>();
      List<RedCat> redCatList= new ArrayList<RedCat>();  // child class of cat
      List<Dog> dogList= new ArrayList<Dog>();           // there is no relationship between Cat and Dog 

      //add list of super class Animal of Cat class
      addCat(animalList);

      //add list of Cat class
      addCat(catList);

      //compile time error
      //can not add list of subclass RedCat of Cat class
      //addCat(redCatList);

      //compile time error
      //can not add list of subclass Dog of Superclass Animal of Cat class
      //addCat.addMethod(dogList); 
   }
}
class Animal {}

class Cat extends Animal {}

class RedCat extends Cat {}

class Dog extends Animal {}