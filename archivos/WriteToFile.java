import java.io.FileWriter;   // Importar la clase archivo
import java.io.IOException;  // Importar la clase de IOException para manejar el error

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("archivo_2.txt");
      myWriter.write("Hola, hoy es miercoles 18 de Octubre \n");
      myWriter.write("El año es 2023, Octubre es el mes 10");
      myWriter.close();
      System.out.println("Exito....");
    } catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}