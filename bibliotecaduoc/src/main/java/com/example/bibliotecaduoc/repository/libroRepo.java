package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.bibliotecaduoc.model.libro;

@Repository 

public class libroRepo {
    private List<libro> listaLibros = new ArrayList<>();

    public List<libro> returnAll(){
        return listaLibros;
    }

    public libro lookById(int id){
        for(libro lib : listaLibros){
            if(lib.getId() == id){
                return lib;
            }
        }
        return null;
    }

    public libro lookByisbn(String isbn){
        for(libro lib : listaLibros){
            if(lib.getIsbn().equals(isbn)){
                return lib;
            }
        }
        return null;
    }

    public libro guardar(libro libro){
        boolean isin = false;
        for(libro lib : listaLibros){
            if(lib.getId()==libro.getId());
            isin = true;
        }
        if(isin == true){
            return libro;
        }else{
            listaLibros.add(libro);
            return libro;
        }
    }

    public libro actualizar(libro libron, libro librocam){
        libro libBuscado = lookById(librocam.getId());
        if(libBuscado!=null){
            libBuscado.setIsbn(libron.getIsbn());
            libBuscado.setId(libron.getId());
            libBuscado.setEditorial(libron.getEditorial());
            libBuscado.setFechaPublicacion(libron.getFechaPublicacion());
            libBuscado.setAutor(libron.getAutor());
        }
        return libron;
    }

    public void delete(int id){
        listaLibros.removeIf(book->book.getId()==id);
    }

}
