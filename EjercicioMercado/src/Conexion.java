import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection conexion;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String usuario="root";
    private static final String contraseña="tatengues";
    private static final String url="jdbc:mysql://localhost:3306/codeicus?useTimezone=true&serverTimezone=UTC";

    public Conexion() {
        conexion=null;
        try {
            Class.forName(driver);
            conexion=DriverManager.getConnection(url, usuario, contraseña);
            if (conexion!=null){
                JOptionPane.showMessageDialog(null, "Lograste la conexión!!!");
            }
        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR. No se conecto...\n"+e);
        }
    }
 
    public Connection getConexion(){
        return conexion;
    }
    
    public void desconectar(){
        conexion=null;
        JOptionPane.showMessageDialog(null, "Te desconectaste!");   
    }
}
