/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Customers;
import conexionBD.Conexion;
import java.util.ArrayList;

/**
 *
 * @author clara
 */
public class CustomerDAO {

    Conexion cn = new Conexion(2);

    public boolean insertarRegistro(Customers customer){
        cn.getConexion();
        boolean resultado = false;
        try {
            resultado = cn.agregarRegistro(customer);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return resultado;
    }

    public boolean modificarRegistro(Customers customer){
        cn.getConexion();
        boolean resultado = false;
        try {
            resultado = cn.actualizarRegistro(customer);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<Customers> buscar(String filtro){
        cn.getConexion();
        ArrayList<Customers> lista = new ArrayList<Customers>();
        ResultSet rs = cn.ejecutarConsulta(filtro);
        try {
            if (rs.next()) {
                do {
                    lista.add(new Customers(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11)));
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println("error al buscar");
        }
        return lista;
    }

    
    public boolean borrarRegistro(Customers customer) {
        cn.getConexion();
        boolean resultado = false;
        String sql = "DELETE FROM Customers WHERE CustomerID = " + customer.getCustomerID();
        try {
            resultado = cn.eliminarRegistro(sql);
	} catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
        return resultado;
    }

    
}
