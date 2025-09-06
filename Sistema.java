/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

import java.util.Scanner;

/**
 *
 * @author benjamin
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        String lectura;
        int numero;
        int opcion;
        String producto;
        double precio;
        
        //Cliente(String rut, String nombre, int edad, String fechaNacimiento)
        
        Cliente cliente1 = new Cliente();
        
        //Pedido(String registrarCliente, String registrarProducto, String registrarVendedor, int cantidadSolicitada, String fechaPedido)
        
        Pedido pedido1 = new Pedido();
        
        //Producto(String codigoUnico, String nombre, String tipo, double precioUnitario)
        
        Producto producto1 = new Producto();
        
        //Region(int nroUnico, String nombre, String ciudadprincipal)
        
        Region region1 = new Region();
        
        //Vendedor(String rut, int nroVendedor, String nombre, String fechaIngreso, String regionTrabaja
        
        Vendedor vendedor1 = new Vendedor();
        
        
        
        
        do{
            
            System.out.println("=== SISTEMA DE PEDIDOS DE EQUIPAJE Y ACCESORIOS DE VIAJE ===");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Vendedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Generar Pedido");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            
            
            switch (opcion){
                
                case 1:
                    System.out.println("-- INGRESO DE CLIENTE --");
                    System.out.println("Ingrese RUT del cliente: ");
                    lectura = leer.next();
                    cliente1.setRut(lectura);
              
                   
                    
                    do{
                        System.out.println("Ingrese nombre del cliente: ");
                        lectura = leer.next();
                        
                        if(lectura.equals("")){
                            System.out.println("Error: el nombre no puede estar vacio");
                            
                        }
                    }while (lectura.equals(""));
                    
                    cliente1.setNombre(lectura);
                    
                    System.out.println("Ingrese edad del cliente: ");
                    numero = leer.nextInt();
                    
                    if (cliente1.comprobarEdad(numero)){
                        cliente1.setEdad(numero);
                    }else{
                        break;
                    }
                   
                    
                    
                    System.out.println("Ingrese fecha de nacimiento (AAAA-MM--DD): ");
                    lectura = leer.next();
                    cliente1.setFechaNacimiento(lectura);
                    
                    System.out.println("Cliente registrado con éxito!");
                    break;
                case 2:
                    
                    System.out.println("-- INGRESO DE VENDEDOR --");
                    System.out.println("Ingrese RUT: ");
                    lectura = leer.next();
                    vendedor1.setRut(lectura);
                    
                    
                    System.out.println("Ingrese número de vendedor: ");
                    numero = leer.nextInt();
                    vendedor1.setNroVendedor(numero);
                    
                    
                    System.out.println("Ingrese nombre de vendedor: ");
                    lectura = leer.next();
                    
                    do{
                        if(lectura.equals("")){
                            System.out.println("El nombre no debe estar vacio!");
                            
                        }
                        
                    }while (lectura.equals(""));
                    
                    vendedor1.setNombre(lectura);
                    
                    String fecha_maxima ="2025-09-05";
                    do{
                       
                        System.out.println("Ingrese fecha de ingreso(AAAA-MM-DD): ");
                        lectura = leer.next();
                        if (lectura.compareTo(fecha_maxima) > 0){
                          System.out.println("Error: la fecha de ingreso no puede ser posterior a "+fecha_maxima);
                          
                        }
                        
                    }while (lectura.compareTo(fecha_maxima) > 0);
                    
                    vendedor1.setFechaIngreso(lectura);
                    
                    
                    System.out.println("Ingrese la region en la que trabaja: ");
                    lectura = leer.next();
                    vendedor1.setRegionTrabaja(lectura);
                    
                case 3:
                    
                    System.out.println("Ingrese el codigo unico del producto: ");
                    lectura = leer.next();
                    producto1.setCodigoUnico(lectura);
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    lectura = leer.next();
                    producto1.setNombre(lectura);
                    
                    
                    do{
                        
                      System.out.println("Ingrese el tipo (Crema/Perfume): ");
                      producto = leer.next().toLowerCase().trim();
                      
                      if(producto1.productoValido(producto)){
                          break;
                          
                          
                          
                      }else{
                          
                      } System.out.println("Debes ingresar un producto crema o perfume");
                    }while(true);
                    
                    
                    System.out.println("Ingrese el precio unitario: ");
                    precio = leer.nextDouble();
                    producto1.setPrecioUnitario(precio);
                    
                    System.out.println("Ingrese la cantidad: ");
                    numero = leer.nextInt();
                    
                    //pedido1.setCantidadSolicitada(numero);
                    //producto1.totalBruto(pedido1);
                    
                case 4:
                    
                    System.out.println("");
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:   
                    System.out.println("Seleccione una opcion válida");     
                
            }
            
        }while(opcion != 5);
        
        
        
    }
    
}
