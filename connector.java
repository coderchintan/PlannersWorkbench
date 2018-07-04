/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package planners.workbench;
import java.sql.*;
/**
 *
 * @author Ankush
 */
public class connector {
    public Connection con;
     public connector() throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3307/plannerworkbench","root","root");
     }
}
