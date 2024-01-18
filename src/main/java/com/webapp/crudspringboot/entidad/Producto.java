package com.webapp.crudspringboot.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author JEAN
 */

/*
Creacion de la entidad o modelo para crear la tabla productos en la base de datos
con sus respectivas columnas que son las propiedades de la clase prodcuto jusnto con el constructos y sus metodos getters y setters
*/

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long prId;

    @Column(nullable = false)
    private String prNombre;
    
    @Column(nullable = false, columnDefinition = "VARCHAR(15) DEFAULT 'No definida'")
    private String prCategoria;
    
    @Column(nullable = false, columnDefinition = "VARCHAR(500) DEFAULT 'Ninguna descripción'")
    private String prDesc;

    @Column(nullable = false)
    private int prPrecio;

    public Producto() {
    }

    public Producto(long prId, String prCategoria, String prNombre, String prDesc, int prPrecio) {
        this.prId = prId;
        this.prCategoria = prCategoria;
        this.prNombre = prNombre;
        this.prDesc = prDesc;
        this.prPrecio = prPrecio;
    }

    public Producto(String prCategoria, String prNombre, String prDesc, int prPrecio) {
        this.prCategoria = prCategoria;
        this.prNombre = prNombre;
        this.prDesc = prDesc;
        this.prPrecio = prPrecio;
    }

    public long getPrId() {
        return prId;
    }

    public void setPrId(long prId) {
        this.prId = prId;
    }

    public String getPrCategoria() {
        return prCategoria;
    }

    public void setPrCategoria(String prCategoria) {
        this.prCategoria = prCategoria;
    }

    public String getPrNombre() {
        return prNombre;
    }

    public void setPrNombre(String prNombre) {
        this.prNombre = prNombre;
    }

    public String getPrDesc() {
        return prDesc;
    }

    public void setPrDesc(String prDesc) {
        this.prDesc = prDesc;
    }

    public int getPrPrecio() {
        return prPrecio;
    }

    public void setPrPrecio(int prPrecio) {
        this.prPrecio = prPrecio;
    }
}
