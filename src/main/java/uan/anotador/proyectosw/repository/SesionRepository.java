package uan.anotador.proyectosw.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import uan.anotador.proyectosw.entities.Sesion;

public interface SesionRepository extends CrudRepository<Sesion, Integer> {
    @Query("SELECT s FROM Sesion s where s.nombreUsuario = ?1 and s.contraseña = ?2")
    Sesion getSesion(String username, String password);
}
