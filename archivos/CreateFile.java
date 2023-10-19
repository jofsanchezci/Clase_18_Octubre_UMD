import java.io.File;  // Importar la clase archivo
import java.io.IOException;  // Importar la clase de IOException para manejar el error

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("archivo.io");
      if (myObj.createNewFile()) {
        System.out.println("El archivo creado: " + myObj.getName());
      } else {
        System.out.println("El archivo Existe.");
      }
    } catch (IOException e) {
      System.out.println("ERROR.");
      e.printStackTrace();
    }
  }
}