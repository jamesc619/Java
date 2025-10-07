class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

 void init(){
// Define a variable for each situation in the challenges below. Assign a value to each variable.
// Display the value of each variable to the console.

/*  Challenge 1:    
    1) student's age 
    2) number of people that live with you
    3) number of items in a cart 
*/
    int age = 16;
    int live = 3;
    int items = 2147483647;
    System.out.println("Age is "+ age);
    System.out.println(live);
    System.out.println(items+ " items");
/*  Challenge 2:
    1) temperature 
    2) student's GPA
    3) growth rate of your investment
*/
    String temp = "15";
    double GPA = 4.0;
    double rate = 0.05;
    System.out.println("Temperature is "+ temp+ "°C");
    System.out.println("GPA is "+ GPA);
    System.out.println("Growth Rate is "+ rate);
/*  Challenge 3:
    1) Student's last name 
    2) student's first initial
    3) description of an item 
*/
    String lastname = "Chen";
    char fn = 'N';
    String description = "This is the description of this item";
    System.out.println("Last Name is "+ lastname);
    System.out.println("First Initial is "+ fn);
    System.out.println(description);
/*  Challenge 4:
    1) the status whether lights are on
    2) the status whether the game is over
    3) the status whether the battery is charging
*/
    boolean lightson = true;
    boolean gameover = false;
    boolean charging = true;
    System.out.println(lightson);
    System.out.println(gameover);
    System.out.println(charging);

    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}
