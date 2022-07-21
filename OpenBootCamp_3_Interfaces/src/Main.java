import Interfaces.CocheCRUD;
import Interfaces.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {
        // Llamado de CocheCRUD con la impremetación de la clase CocheCRUDImpl designado con el nombre cocheCRUD
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        // Llamado a los métodos de cocheCRUD
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}