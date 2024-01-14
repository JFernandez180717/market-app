package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
  // @Query(name = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) De manera nativa
  List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

  Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
