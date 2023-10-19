import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez", 50);
        Trabajador t1 = new Trabajador("Antonio", "Ramírez", 18, 1200);
        Trabajador t2 = new Trabajador("Fernanda", "Díaz", 33, 1300);
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(t1);
        personas.add(t2);
        
        for (int i = 0; i < personas.size(); i++) {
            personas.get(i).mostrarInformacion();
        }
    }
    
}