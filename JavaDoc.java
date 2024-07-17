DOCUMENTATION OF JAVA


        //This is a single line comment

        /*This is 
         * a multiline
         * comment.
         * 
         */
        You can jump to printlnf using sysout and then using the ctrl space key binding
        

         for user input use scanner
         Scanner scanner= new Scanner(System.in);
         int age = scanner.nextInt();
         String name = scanner.nextLine();
**-----------------------------------------------------------------------------
Simple GUI 
        import javax.swing.JOptionPane;
        public class Baka{

        public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        //Integer.parseInt is used to convert string input to integer since the JOption.showInputDialog()
        //accepts string as an input
        JOptionPane.showMessageDialog(null, "You are "+age+ " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are "+height+ " cm tall.");
    }
}

**-----------------------------------------------------------------------------
 GENERATING A PSUEDO RANDOM NUMBER
    import java.util.Random;
public class Baka{

    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(6)+1; HERE THE VALUE 6 WAS USED TO LIMIT THE RANDOM NUMBER FROM 0 TO 5 AND PLUS ONE FOR 6 
        System.out.println(x);
        double y = rand.nextDouble();
        boolean z = rand.nextBoolean();
    }
}

**-----------------------------------------------------------------------------
IF A STRING IS EQUAL TO SOMETHING

import java.util.Scanner;
public class Baka{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Press q to quit");
        String res = scn.next();

        if(res.equals("q")||res.equals("Q"))
        {
            System.out.println("Game quit");
        }else{
            System.out.println("Pew pew");
        }

    }
}


**-----------------------------------------------------------------------------
STRING METHODS

String name = "Shishir";

CHECKING IF STRING IS EQUAL TO SOMETHING
boolean result = name.equalsIgnoreCase("shishir");
NAME.EQUALS IF NO CASE SENSITIVITY BEING IGNORED

FINDING LENGTH
int length = name.length();

PRINTING THE CHARACTER IN A CERTAIN POSITION IN THE STRING
char blah = name.charAt(2);

FINDING AT WHICH INDEX A CERTAIN CHARACTER IS WITHIN THE STRING
int idn = name.indexOf("h");

CHECKING IF A STRING IS EMPTY
boolean eorn = name.isEmpty();
    
CONVERTING STRING TO UPPERCASE AND LOWERCASE
String result = name.toUpperCase();
String result = name.toLowerCase();

YOU CAN REMOVE EMPTY SPACES IN A STRING
String result = name.trim();

YOU CAN REPLACE A CERTAIN CHARACTER IN THE STRING WITH ANOTHER CHARACTER
String result = name.replace('oldChar', 'newChar');



**-----------------------------------------------------------------------------
WRAPPER CLASSES

BASICALLY PRIMITIVE DATA TYPES BUT CONVERTED TO REFERENCE DATA TYPES
PRIMITIVE: int, char, double 
WRAPPER: Integer, Character, Double, Boolean

USING WRAPPER CLASS HAS ADVANTAGE OF USAGE OF METHODS
DISADVANTAGE IS HOW HARD IT IS TO ACCESS THESE DATA 

**-----------------------------------------------------------------------------
ARRAY LISTS
IT IS A RESIZABLE ARRAY WHERE YOU CAN ADD OR REMOVE REFERENCE DATA TYPES ONLY AFTER COMPILATION PHASE

import java.util.ArrayList;
WANT TO STORE NAMES OF FOOD
ArrayList<String> food = new ArrayList<String>();
TO ADD ELEMENTS TO THE ARRAY LIST USE ADD METHOD 
food.add("Pizza");
food.add("Pineapple");

TO PRINT ALL THE ELEMENTS OF THE ARRAY LIST
for(int i=0; i < food.size(); i++) {
	
	ACCESSING THE ELEMENT USING GET METHOD TO FOOD LIST
	System.out.println(food.get(i));
NORMALLY FOR SIZE OF ARRAY OR STRING WE USE arrname.length()
BUT FOR ARRAY LISTS WE WILL USE al.size()
}

METHOD FOR REPLACING A MEMBER IN THE LIST
food.set(index,element);
ITEM TO BE REPLACED AT WHICH INDEX USING ELEMENT

ITEM REMOVAL
food.remove(index);
CLEARING ARRAY LIST
food.clear();

**-----------------------------------------------------------------------------
2D ARRAY LIST

import java.util.ArrayList;

inside main --

ArrayList<ArrayList<String>> groceryList = new ArrayList<String>();

ArrayList<String> drinkList = new ArrayList<String>();
drinkList.add("BLU");
drinkList.add("Tea");

ArrayList<String> produceList = new ArrayList<String>();
produceList.add("Tomatoes");
produceList.add("Potatoes");

ArrayList<String> solidList = new ArrayList<String>();
solidList.add("Bread");
solidList.add("Cookies");

groceryList.add(drinkList);
groceryList.add(produceList);
groceryList.add(solidList);

System.out.println(groceryList.get(index).get(index));
FIRST .GET(INDEX) IS FOR THE FIRST ELEMENT IN THE GLOBAL ARRAY AND THE SECOND ONE
IS FOR THE FIRST ELELMENT IN THE FIRST ONE OF THE GOLBAL ARRAY

**-----------------------------------------------------------------------------
FOR-EACH LOOP
TRAVERSING TECHNIQUE TO ITERATE THROUGH THE ELEMENTS IN AN ARRAY/COLLECTION
LESS STEPS, MORE READABLE
LESS FLEXIBLE

USING NORMAL STRING ARRAY
String[] animals = {"baka", "negro", "white"};

for(String i : animals) {
	System.out.println(i);
}

USING AN ARRAY LIST

ArrayList<String> animals = new ArrayList<String>();
//make sure to add the import for using arraylist
for(String i : animals) {
	System.out.println(i);
}


**---------------------------------------------------------------------------------
METHODS
Basically a custom function just like in C

YOU HAVE TO DECLARE IT OUTSIDE THE MAIN METHOD
static void hello(String x) {
	System.out.println("Hello"+x);
}
COMMON NAMING CONVENTION - LOWERCASE LETTERS

**---------------------------------------------------------------------------------
OVERLOADED METHODS
Methods that share the same name but have different parameters 
METHOD NAME + PARAMETERS = METHOD SIGNATURE

**---------------------------------------------------------------------------------
OBJECT ORIENTED PROGRAMMING
object = instance of a class that may contain attributes and methods

IN THE SAME WORKSPACE EITHER OPEN ANOTHER CLASS FILE WITH THE CLASS NAME 
OR DECLARE public class classname{} OUTSIDE THE MAIN CLASS

ENTER ATTRIBUTES-
String color = "Orange";
boolean empty = true;
ENTER METHODS-
System.out.println("Drink coffee");

NOW YOU CAN MAKE AN INSTANCE OF THIS CLASS IN YOUR MAIN CLASS 
E.G = 
If your class was Coffee
Coffee myCoffee = new Coffee();
THIS IS YOUR INSTANCE OF THE CLASS

**---------------------------------------------------------------------------------
CONSTRUCTOR = Special method which is called when an object is instantiated (created)
CREATING DIFFERENT OBJECTS THAT HAVE DIFFERENT ATTRIBUTES
your class--
public class Human{
	ATTRIBUTES
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
		THE THIS HERE IS WHERE THE NAME OF THE INSTANCE OF THE CLASS CAN BE THOUGHT OF BEING REPLACED
	}
	
	void eat() {
		System.out.println(this.name + "is eating");
		USING THE INPUT IN METHODS OF THE CLASS
	}
}
THIS IS YOUR CONSTRUCTOR AND THE VALUES INSIDE ARE THE ARGUMENTS
MAKE AN INSTANCE OF THIS CLASS IN THE MAIN CLASS AND INPUT

Human human1 = new Human("Rick",65,70);
Human human2 = new Human("Morty",16,50);

System.out.println(human2.name);
human2.eat();
PRINTS NAME OF HUMAN 2 USING NAME ATTRIBUTE

**---------------------------------------------------------------------------------
GLOBAL AND LOCAL VARIABLES

local = declared inside a method
		visible only to that method
global = declared outside a method, but within a class
		 visible to all parts of the class
		 
For example: In the main class you open an instance of a custom class called Dicerolll
DiceRoller diceRoller = new DiceRoller();

Inside the DiceRoller class that has been opened separately:
	import java.util.Random;
	public class DiceRoller{
		//Global 
		Random random;
		int number;
		
		DiceRoller{
			THIS IS THE CONSTRUCTOR
			random = new Random();
			roll();
		}
		
		void roll() {
			number = random.nextInt(6)+1;
			System.out.println(number);
		}	
	}	
	} YOU COULD ALSO INSTEAD PUT THE VARIABLES IN THE CONSTRUCTOR AND PASS THE VARIABLES AS 
	  FUNCTION INPUTS
	  
**---------------------------------------------------------------------------------
Java program to find the penultimate (next to the last) word in a sentence

refer to:https://www.w3resource.com/java-exercises/basic/java-basic-exercise-60.php
**---------------------------------------------------------------------------------	
Java program to capitalize the first letter of each word in a sentence.

refer to: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-58.php
**---------------------------------------------------------------------------------	
