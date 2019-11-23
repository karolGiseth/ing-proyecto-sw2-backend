package uan.anotador.proyectosw.service;

import uan.anotador.proyectosw.entities.Imagen;
import uan.anotador.proyectosw.exception.ResourceNotFoundException;

public interface IImagenService {
    Imagen create (Imagen imagen);
    Imagen update (Imagen imagen) throws ResourceNotFoundException;
    void deleteById (int id);
    Iterable<Imagen>findAll();
}
