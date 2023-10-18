import java.io.*;
import java.sql.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Details {
    String first_name ;
    String last_name;
    String Email;
    String Profession;
    String Phone;
    String Skill1;
    String Skill2;
    String Skill3;
    String HighSchool;
    String SeniorSchool;
    String College1;
    String College2;
    String Degree1;
    String Degree2;
    String Summary;
    String Language1;
    String Language2;  
    public void getDetails( String firstName, String lastName, String email, String profession,String phone, String skill1,String skill2,  String skill3,String highSchool,String seniorSchool,String college1,String college2, String degree1, String degree2, String summary,String language1 ,String language2){
   first_name = firstName ;
   last_name = lastName;
    Email = email;
    Profession = profession;
    Phone = phone;
    Skill1 = skill1;
    Skill2 = skill2;
    Skill3 = skill3;
    HighSchool = highSchool;
    SeniorSchool = seniorSchool;
    College1 = college1;
    College2 = college2;
    Degree1 = degree1;
    Degree2 = degree2;
    Summary = summary;
    Language1 = language1;
    Language2 = language2;
  
    }
   
    public void createConnection(){
    try{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resume_maker?characterEncoding=UTF-8","root","");
     
    if (con != null) {
                System.out.println("Connection to the database has been established.");
                
                // You can now perform database operations here.
                // create.Statement() creates statement object which is responsible for executing queries on table 
            Statement stmt = con.createStatement(); 
            //inserting in user_details
            String insertSQL = "INSERT INTO user_details (first_name, last_name, email_id, Phone_no, Profession) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = con.prepareStatement(insertSQL);
            insertStatement.setString(1, first_name);
            insertStatement.setString(2, last_name);
            insertStatement.setString(3, Email);
            insertStatement.setString(4, Phone);
            insertStatement.setString(5, Profession);
            int rowsInserted = insertStatement.executeUpdate(); // executeUpdate() is used for INSERT, UPDATE,DELETE statements.It returns number of rows affected by the execution of the statement 
             // if result is greater than 0, it means values has been added 
            String insertSQL2 = "INSERT INTO summary(summary, first_name, last_name) VALUES (?,?,?)";
            PreparedStatement insertStatement2 = con.prepareStatement(insertSQL2);
            insertStatement2.setString(1,Summary);
            insertStatement2.setString(2,first_name);
            insertStatement2.setString(3,last_name);
            int rowsInserted2 = insertStatement2.executeUpdate();
            //insert in skills table
            String insertSQL3 = "INSERT INTO skills(skill1, skill2,skill3, first_name, last_name) VALUES (?,?,?,?,?)";
            PreparedStatement insertStatement3 = con.prepareStatement(insertSQL3);
            insertStatement3.setString(1,Skill1);
            insertStatement3.setString(2,Skill2);
            insertStatement3.setString(3,Skill3);
            insertStatement3.setString(4,first_name);
            insertStatement3.setString(5,last_name);
            int rowsInserted3 = insertStatement3.executeUpdate();
            //insert in education table
            String insertSQL4 = "INSERT INTO `education`(`first_name`, `last_name`, `high_school_name`, `senior_secondary_school_name`, `degree1_name`, `college1_name`, `degree2_name`, `college2_name`) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement insertStatement4 = con.prepareStatement(insertSQL4);
            insertStatement4.setString(1,first_name);
            insertStatement4.setString(2,last_name);
            insertStatement4.setString(3,HighSchool);
            insertStatement4.setString(4,SeniorSchool);
            insertStatement4.setString(5,Degree1);
            insertStatement4.setString(6,College1);
            insertStatement4.setString(7,Degree2);
            insertStatement4.setString(8,College2);
            int rowsInserted4 = insertStatement4.executeUpdate();
            
            if ((rowsInserted > 0)&&(rowsInserted2 > 0)&& (rowsInserted3 > 0)&& (rowsInserted4 > 0)) {
                System.out.println("successfully inserted");
            //close the connection
            con.close();
            }else{
                System.out.println( "unsucessful insertion "); 
                // close the connection when you're done.
                con.close();}
    } else {
                System.out.println("Failed to establish a connection to the database.");
            }
    }catch(Exception e){
    System.out.println(e);
    }
    
    }
    
   
    }


