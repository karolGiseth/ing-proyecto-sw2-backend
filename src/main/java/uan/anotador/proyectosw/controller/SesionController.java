package uan.anotador.proyectosw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.anotador.proyectosw.entities.Sesion;
import uan.anotador.proyectosw.service.ISesionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/sesion-api" )
public class SesionController {

    @Autowired
    ISesionService sesionService;

    @GetMapping("/login")
    public ResponseEntity<Sesion> getSesion(@RequestParam String username, @RequestParam String password) {
        Sesion sesion = sesionService.getSesion(username, password);
        if (sesion == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(sesion, HttpStatus.OK);
        }
    }
}
