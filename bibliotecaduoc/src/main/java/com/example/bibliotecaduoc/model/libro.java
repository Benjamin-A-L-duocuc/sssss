package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String fechaPublicacion;
    private String autor;
}
