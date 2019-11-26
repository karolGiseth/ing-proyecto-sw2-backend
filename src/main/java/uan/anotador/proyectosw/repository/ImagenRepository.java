package uan.anotador.proyectosw.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.anotador.proyectosw.entities.Imagen;

public interface ImagenRepository extends CrudRepository<Imagen, Integer> {

    @Query("SELECT i from Imagen i where i.usuario.id = ?1")
    Iterable<Imagen> findByUsuarioId(int id);

}
