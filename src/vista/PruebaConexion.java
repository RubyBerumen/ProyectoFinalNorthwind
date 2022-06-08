/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import conexionBD.Conexion;

/**
 *
 * @author clara
 */
public class PruebaConexion {
    
    public static void main (String[] args){
        Conexion cn = new Conexion(1);
        
        cn.getConexion();
    }
    
}
