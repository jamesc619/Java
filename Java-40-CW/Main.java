import java.io.IOException;
import java.sql.*;
// To Compile on the Replit shell use: (same as for mac)
// javac -cp sqlite-jdbc-3.23.1.jar: Main.java

// To compile in Windows use:
// javac -cp sqlite-jdbc-3.23.1.jar

// To execute(run) use:
// java -cp sqlite-jdbc-3.23.1.jar: Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {     

    String sql = "";
    String queryResult="";
     
    // Task 1: Create a database object connecting to the cr101.db database
      Database db = new Database("jdbc:sqlite:cr101.db");

    // Task 2: Write the sql code for all the records for students who are in room 108 during period 3. Store it into a string variable (Hint: use the sql variable). 
    sql="SELECT * FROM cr101 WHERE Room = 108 AND Period = 3; ";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("****************************");

    // Task 3: Query the database and display the results
    sql = "SELECT * FROM cr101;";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);

	   
      
  }    
}