package modelo;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import io.github.cdimascio.dotenv.Dotenv;

public class PoolConexiones {

  // POR HACER: EL CONSTRUCTOR DE URL PARA POOL DE CONEXIONES NO FUNCIONA AUN

  private static Dotenv dotenv = Dotenv.configure().filename("var.env").load();
  private static final BasicDataSource dataSource = new BasicDataSource();

  static {
    dataSource.setUrl(dotenv.get("SB_URL"));
    dataSource.setUsername(dotenv.get("SB_USER"));
    dataSource.setPassword(dotenv.get("SB_PASSWORD"));
    dataSource.setDriverClassName("org.postgresql.Driver");

    dataSource.setInitialSize(5);
    dataSource.setMaxTotal(20);
    dataSource.setMaxIdle(10);
    dataSource.setMinIdle(5);
  }

  public static DataSource getDataSource(){
    return dataSource;
  }


}
