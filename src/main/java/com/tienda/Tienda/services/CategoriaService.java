package com.tienda.Tienda.services;

import com.tienda.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
   //se obtiene los registros de la tabala categoria en un arrayList
    //de objetos Categoria, todos o solo los activos
    
    public List<Categoria> getCtegorias(boolean activos);
}
