package com.example.bibliotecaduoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.bibliotecaduoc.model.libro;
import com.example.bibliotecaduoc.repository.libroRepo;
import com.example.bibliotecaduoc.model.libro;

public class libroService {
    @Autowired
    private libroRepo libroRepo;

    public libro save(libro libro){
        return libroRepo.guardar(libro);
    }

    public List<libro> show(libro libro){
        return libroRepo.returnAll();
    }

    public void delete(int id){
        libroRepo.delete(id);
    }

    public libro update(libro libin, libro libout){
        return libroRepo.actualizar(libin, libout);
    }

    public libro readById(int id){
        return libroRepo.lookById(id);
    }

    public libro readByIsbn(String isbn){
        return libroRepo.lookByisbn(isbn);
    }
}
