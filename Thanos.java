import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

         ArrayList<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list

        Hero blackwidow = new Hero("Black Widow",34);
        Hero captainamerica = new Hero ("Captain America",100);
        Hero vision = new Hero ("Vision",3);
        Hero ironman = new Hero ("Iron Man",48);
        Hero scarletwitch = new Hero ("Scarlet Witch",29);
        Hero thor = new Hero ("Thor",1500);
        Hero hulk = new Hero ("Hulk",49);
        Hero doctorstrange = new Hero ("Doctor Strange",42);


        heroes.add(blackwidow);
        heroes.add(captainamerica);
        heroes.add(vision);
        heroes.add(ironman);
        heroes.add(scarletwitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorstrange);
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
System.out.println ("Thor's age before aging: "+thor.getAge()+"\n");
        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

// Test
      System.out.println ("First test: \n");
      for (Hero i : heroes){
          System.out.println (i.getName()+" is "+i.getAge()+" years old.");

          }
                  System.out.println ("\n\n");

        // TODO 4 : Shuffle the heroes list
         Collections.shuffle(heroes);
  // Test 2
              System.out.println ("Second test: \n");
               for (Hero i : heroes){
                   System.out.println (i.getName()+" is "+i.getAge()+" years old.");
                   }
                   System.out.println ("\n\n");

        // TODO 5 : Keep only the half of the list
        int x = heroes.size();

        heroes.subList(x/2, x).clear();
        // heroes.removeRange(x/2,x);    // removeRange(int,int) has protected access in ArrayList !!!!!??????????????????!!!!!!!!!!!


        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println ("Result: \n");
        for (Hero i : heroes){
          System.out.println (i.getName()+" is "+i.getAge()+" years old.");
        }

    }
}
