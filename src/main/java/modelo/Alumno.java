package modelo;

public class Alumno {

  private int id;
  private String nombre;
  private String curso;
  private double promedio;

  // Para leer
  public Alumno(int id, String nombre, String curso, double promedio) {
    this.id = id;
    this.nombre = nombre;
    this.curso = curso;
    this.promedio = promedio;
  }

  // Para el resto del CRUD
  public Alumno(String nombre, String curso, double promedio) {
    this.nombre = nombre;
    this.curso = curso;
    this.promedio = promedio;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public double getPromedio() {
    return this.promedio;
  }

  public void setPromedio(double promedio) {
    this.promedio = promedio;
  }


  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", nombre='" + getNombre() + "'" +
      ", curso='" + getCurso() + "'" +
      ", promedio='" + getPromedio() + "'" +
      " }";
  }


}
