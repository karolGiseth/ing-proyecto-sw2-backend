package uan.anotador.proyectosw.service;

import uan.anotador.proyectosw.entities.Sesion;

public interface ISesionService {
    Sesion getSesion(String username, String password);
}
