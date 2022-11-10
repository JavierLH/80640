package mx.uv;

//import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {
    private static String url="jdbc:mysql://127.0.0.1:3306/nombreBD";
    private static String DriverName ="com.mysql.jdbc.Driver";
    private static String username ="root";
    private static String password ="123456789";
    private static Connection connection = null;

    public static Connection getConnection(){
        try {
            Class.forName(DriverName);
            connection = DriverManager.getConnection(url, username, password)
            
        } catch (SQLException e) {
            System.out.println(e);

            // TODO: handle exception
        }catch(ClassNotFoundException e){
            System.out.println("no encontro el driver");

        }
        return connection;
    }

    
}
