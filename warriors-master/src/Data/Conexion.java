package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private String login;
    private String clave;
    private String url;
    private String driverClassName;
    public Statement stmt;
    public static Connection con;
    
    public Conexion(){
        this.login="C##HENRYA";
        this.clave="FH-1935043";
        this.url="jdbc:oracle:thin:@192.168.0.117:1521:xe";
        this.driverClassName="oracle.jdbc.driver.OracleDriver";
        Conexion.con=null;
    }
    
    public Conexion conectar(){
        try {
            if(con==null){
                Class.forName(this.driverClassName).newInstance();
                Conexion.con=DriverManager.getConnection(url, login, clave);
            }
            if(getConn()!=null){
                System.out.println("Conectado con exito a la base de datos");
            }else{
                System.out.println("Conexion fallida con la base de datos");
            }
        } catch (Exception e) {
            System.out.println("Falló al cargar el controlador ORACLE. Error: "+e.getMessage());
        }
        return this;
    }
    
    public void SetConn(Connection conn){
        Conexion.con=conn;
    }
    
    public static Connection getConn(){
        if(con==null){
            Conexion conexion=new Conexion();
        }
        return con;
    }
    
    public int Escribir(String consulta){
        int resp=0;
        try {
            this.stmt=Conexion.getConn().createStatement();
            this.stmt.executeUpdate(consulta);
            resp=1;
        } catch (SQLException e) {
            resp=0;
            System.out.println("Error: "+e.getMessage());
        }
        
        return resp;
    }
    
    public void desconexion(){
        try {
            con.close();
            System.out.println("Desconectado correctamente");
            con=null;
        } catch (Exception e) {
            System.out.println("Error al desconectar "+e.getMessage());
        }
    }
    
    public ResultSet getData(String query){
        ResultSet resp=null;
        try {
            this.stmt=Conexion.getConn().createStatement();
            resp=this.stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
    
}
