package persistence;

import entity.Student;

import java.util.ArrayList;

public interface CRUDGeneric {
    public Object create(Object object);
    public Object readById(int id);
    public ArrayList<Object> readAll();
    public Object update(Object object, int id);
    public Boolean deleteById(int id);
}
