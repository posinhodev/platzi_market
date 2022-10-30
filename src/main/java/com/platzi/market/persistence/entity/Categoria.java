package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    /**
     * Declaracion de valores de la tabla de producto segun la base de datos
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    /**
     * Creacion de relaciones segun MER de DB
     * Producto - Categoria
     * */
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    /**
     * Creacion de metodos Geter and Seter
     * */

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
