package uan.anotador.proyectosw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.anotador.proyectosw.entities.Imagen;
import uan.anotador.proyectosw.exception.ResourceNotFoundException;
import uan.anotador.proyectosw.repository.ImagenRepository;
import uan.anotador.proyectosw.service.IImagenService;

@Service
public class ImagenServiceImpl implements IImagenService {

    @Autowired
    ImagenRepository imagenRepository;

    @Override
    public Imagen create(Imagen imagen) {
        return imagenRepository.save(imagen);
    }

    @Override
    public Imagen update(Imagen imagen) throws ResourceNotFoundException {
        if(imagenRepository.findById(imagen.getId()).isPresent()){
            return imagenRepository.save(imagen);
        }else{
            throw new ResourceNotFoundException("Imagen", "id", Integer.toString(imagen.getId()));
        }
    }

    @Override
    public void deleteById(int id) {
        imagenRepository.findById(id);
    }

    @Override
    public Iterable<Imagen> findAll() {
        return imagenRepository.findAll();
    }
}
