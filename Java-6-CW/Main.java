class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }


  void init(){
    
    /* 
    Lesson 6: Use the Input Class provided to you, to get input from a user via the keyboard. In the examples below, the function calls for each datatype: int, double, string, char, boolean. 
   */
 

    // Always prompt the user for what information you are requesting
    // Declare the variables you will need to store the information
    // Print the information
    
    // Problem 1:   Ask a student for their age.  
    System.out.println("Enter Your Age:");
    int age = Input.readInt();
    System.out.println("Age is "+ age);
    
    
    // Problem 2:   Ask a student for their GPA.
    System.out.println("Enter Your GPA:");
    double GPA = Input.readDouble();
    System.out.println("GPA is "+ GPA);
    
    
    // Problem 3:   Ask a student for their first name.
    System.out.println("Enter Your First name:");
    String name = Input.readString();
    System.out.println("First Name: "+ name);
    

    // Problem 4:   Ask a player if they want to continue to play  
    // There are a few ways to do this (maybe Y/N for Yes or No)
    System.out.println("DO YOU WANT TO PLAY:");
    String play = Input.readString();
    System.out.println(play);
    
      
    
    System.out.println("======== ++++++ =======\n*** End of exercise ***");

  }
}