package modelo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
			super();
			// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Se paso por aqui...");
		
		System.out.println("Se paso por aqui...");

		/* INICIO METODO GETALUMNOS */
		
		// Vamos a generar una lista de alumnos aqui nomas
		List<Alumno> alumnos = new ArrayList<>();
		String sql = "SELECT * FROM alumnos";
		
		try {
			// Connection cnx = PoolConexiones.getDataSource().getConnection();
			Connection cnx = ConexionDB.getConnect();
			Statement stmt = cnx.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				alumnos.add(new Alumno(rs.getInt("id"), rs.getString("nombre"), rs.getString("curso"), rs.getDouble("promedio")));
			}
			rs.close();
			stmt.close();

			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		/* FIN METODO GETALUMNOS */

		request.setAttribute("alumnos", alumnos);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
