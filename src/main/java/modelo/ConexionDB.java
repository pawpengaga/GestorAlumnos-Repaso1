package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConexionDB {

  private static Connection conn = null;
  private static Dotenv dotenv = Dotenv.configure().filename("var.env").load();

  private ConexionDB(){

    try {
      Class.forName("org.postgresql.Driver");

      conn = DriverManager.getConnection("jdbc:postgresql://aws-0-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.watoxpalkpauclrnbqnx&password="+ dotenv.get("SB_PASSWORD"));
      if (conn != null) {
        System.out.println("Conexion establecida eeeeeeeeeeee");
      } else {
        System.out.println("No se logro conectar en el primer paso...");
      }
      
    } catch (SQLException e){
      e.printStackTrace();
    } catch (ClassNotFoundException e){
      e.printStackTrace();
    }

  }

  public static Connection getConnect(){
    if (conn == null) {
      new ConexionDB();
    }
    return conn;
  }
}
