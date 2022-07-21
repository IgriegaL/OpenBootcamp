package Interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Usando Método save");
    }

    @Override
    public void findAll() {
        System.out.println("Usando Método findAll");
    }

    @Override
    public void delete() {
        System.out.println("Usando Método delete");
    }
}
