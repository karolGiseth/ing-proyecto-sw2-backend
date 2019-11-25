package uan.anotador.proyectosw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.anotador.proyectosw.entities.Sesion;
import uan.anotador.proyectosw.repository.SesionRepository;
import uan.anotador.proyectosw.service.ISesionService;

@Service
public class SesionServiceImpl implements ISesionService {
    @Autowired
    SesionRepository sesionRepository;

    @Override
    public Sesion
    getSesion(String username, String password) {
        return sesionRepository.getSesion(username,password);
    }
}
