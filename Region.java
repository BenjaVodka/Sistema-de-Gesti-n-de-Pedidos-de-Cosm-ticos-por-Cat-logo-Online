/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author benjamin
 */
public class Region {
    
    
    private int nroUnico;
    private String nombre;
    private String ciudadprincipal;

    public Region() {
    }

    public Region(int nroUnico, String nombre, String ciudadprincipal) {
        this.nroUnico = nroUnico;
        this.nombre = nombre;
        this.ciudadprincipal = ciudadprincipal;
    }

    public int getNroUnico() {
        return nroUnico;
    }

    public void setNroUnico(int nroUnico) {
        this.nroUnico = nroUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadprincipal() {
        return ciudadprincipal;
    }

    public void setCiudadprincipal(String ciudadprincipal) {
        this.ciudadprincipal = ciudadprincipal;
    }
    
    
    
    
    
}
