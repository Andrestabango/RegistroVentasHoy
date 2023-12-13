package com.registro.ventas.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
    int codigoVenta;
    String fechaCompra;
    ArrayList<Producto>  productos = new ArrayList<>();
    Cliente cliente;

    float precioTotal=0;



    public Venta(int codigoVenta, String fechaCompra, ArrayList<Producto> productos, Cliente cliente) {
        this.codigoVenta = codigoVenta;
        this.fechaCompra = fechaCompra;
        this.productos = productos;
        this.cliente = cliente;
    }

    public List<String> getNombresProductos() {
        return productos.stream()
                .map(Producto::getNombre)
                .collect(Collectors.toList());
    }



    public Venta() {
    }

    public float getPrecioTotal()
    {
        for(Producto producto:productos){
            precioTotal+=producto.getPrecio();
        }
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getNombreCliente(){
        return cliente.nombre;
    }


    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
