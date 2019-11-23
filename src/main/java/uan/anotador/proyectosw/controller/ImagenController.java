package uan.anotador.proyectosw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uan.anotador.proyectosw.entities.Imagen;
import uan.anotador.proyectosw.exception.ResourceNotFoundException;
import uan.anotador.proyectosw.service.IImagenService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping( "/imagen-api" )
public class ImagenController {

    @Autowired
    IImagenService imagenService;

    @PostMapping ("/create")
    public ResponseEntity<Imagen> create(@RequestBody Imagen imagen){
        return new ResponseEntity<>(imagenService.create(imagen), HttpStatus.OK);
    }

    @PutMapping ("/update")
    public ResponseEntity<Imagen> update(@RequestBody Imagen imagen){
        try {
            return new ResponseEntity<>(imagenService.update(imagen), HttpStatus.OK);
        } catch (ResourceNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@RequestParam int id){
        imagenService.deleteById(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @GetMapping("/find-all")
    public ResponseEntity<Iterable<Imagen>> findAll (){
        return new ResponseEntity<>(imagenService.findAll(), HttpStatus.OK);
    }

}
