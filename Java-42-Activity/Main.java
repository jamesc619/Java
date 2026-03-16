
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
    // Use the students database. To minimize errors, first use a SELECT statement to make sure you are starting out with the correct records.
    String sql = "";
    String queryResult = "";
    // setup appropriate DB object to students.db
    Database db = new Database("jdbc:sqlite:students.db");
    
    // Challenge 1:
    // For student with ID of STUDENT1001, change room to 122 for period 3 class.
    sql = "UPDATE cr101 SET Room = 122 WHERE StudentID = 'STUDENT1001' AND Period = 3;";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE StudentID = 'STUDENT1001' AND Period = 3;";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("***************");

    // Challenge 2:
    // Remove course “ZQCTEDA” for student with id STUDENT1200 
    sql = "DELETE FROM cr101 WHERE Course = 'ZQCTEDA' AND StudentID = 'STUDENT1200';";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE StudentID = 'STUDENT1200' AND Course = 'ZQCTEDA';";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("*************************");

    // Challenge 3:
    // Change the room number of teacher1 DOYLE for periods 4 and 5 to room 213.
    sql = "UPDATE cr101 SET Room = 213 WHERE Teacher1 = 'DOYLE' AND Period IN(4,5);";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE Teacher1 = 'DOYLE' AND Period IN(4,5);";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("*************************");

    // Challenge 4:
    // Mr. ROFFLER will be replacing Mr. ARCHETTI for course “MQF44QGF” section 1. Update all records to reflect this change.
    sql = "UPDATE cr101 SET Teacher1 = 'ROFFLER' WHERE Course = 'MQF44QGF' AND Teacher1 = 'ARCHETTI' AND Section = 1;";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE Course = 'MQF44QGF' AND Section = 1;";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("*************************");

    // Challenge 5:
    // Change the grade for STUDENT999 to 11 and the students offclass to a 'junior' status.
    sql = "UPDATE cr101 SET Grade = 11 WHERE StudentID = 'STUDENT999';";
    db.runSQL(sql);
    sql = "SELECT DISTINCT * FROM cr101 WHERE StudentID = 'STUDENT999';";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("*************************");

    // Challenge 6:
    // Add a course MKUFTC6 with a section 1. CASTRO R will be teaching this course period 9 in room 322 for student1231.
    sql = "INSERT INTO cr101 (StudentID, Course, Section, Teacher1, Period, Room) VALUES('STUDENT1231', 'MKUFTC6', 1, 'CASTRO R', 9, 332);";
    db.runSQL(sql);
    sql = "SELECT * FROM cr101 WHERE StudentID = 'STUDENT1231' AND Period = 9;";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
    print("*************************");
    
     
  }    
}