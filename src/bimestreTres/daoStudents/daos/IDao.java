package bimestreTres.daoStudents.daos;

import java.util.List;

public interface IDao<T> {

    public T guardar(T t);

    public void eliminar(Long id);

    public T buscarPorId(Long id);

    public List<T> buscarTodos();
}
