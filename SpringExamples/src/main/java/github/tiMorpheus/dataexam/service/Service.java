package github.tiMorpheus.dataexam.service;


import java.util.List;

public interface Service<T> {

    T add(T entity);
    void delete(long id);
    T getByName(String name);
    T edit(T entity);
    List<T> getAll();
}
