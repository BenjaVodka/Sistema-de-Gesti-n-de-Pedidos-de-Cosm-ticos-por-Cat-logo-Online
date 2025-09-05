/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author benjamin
 */
public class Producto {
    
    private String codigoUnico;
    private String nombre;
    private String tipo;
    private double precioUnitario;

    public Producto() {
    }

    public Producto(String codigoUnico, String nombre, String tipo, double precioUnitario) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioUnitario = precioUnitario;
    }
    
    
    public boolean productoValido(String producto){
        
        return producto.equals("crema") && producto.equals("perfume");
    }
    
    
    public double totalBruto(){
        
        int cantidad = 0;
        double total = 0;
        
        
        total = cantidad * precioUnitario;
        return total;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
    
    
    
}
