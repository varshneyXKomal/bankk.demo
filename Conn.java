
package bank.management.system;
import java .sql.*;
public class Conn {
    Connection c;
    Statement s;
    //public static void main(String args[]){
        public Conn(){
            try{
               //  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Komal@123");
               c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Komal@123");
                s=c.createStatement();
            }
                catch(Exception e){
                        System.out.println(e);
                        }
            }
        }
    

//String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";