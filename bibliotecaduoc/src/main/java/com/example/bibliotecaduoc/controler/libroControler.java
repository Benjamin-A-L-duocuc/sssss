package com.example.bibliotecaduoc.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaduoc.service.libroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/libros")
public class libroControler {
    @Autowired
    private libroService liSer;
    
    @GetMapping
    public List<libro> listaLibros() {
        return liSer.show();
    }
    
}
