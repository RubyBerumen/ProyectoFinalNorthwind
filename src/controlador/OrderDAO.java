/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Orders;
import conexionBD.Conexion;
import java.util.ArrayList;

/**
 *
 * @author clara
 */
public class OrderDAO {
    
    Conexion cn = new Conexion(2);

    public boolean insertarRegistro(Orders order) {
    	cn.getConexion();
        boolean resultado = false;
        try {
			resultado = cn.agregarRegistro(order);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return resultado;
    }

    public boolean modificarRegistro (Orders order) {
    	cn.getConexion();
        boolean resultado = false;
        try {
            resultado = cn.actualizarRegistro(order);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList <Orders> buscar (String filtro) {
    	cn.getConexion();
        ArrayList <Orders> lista = new ArrayList <Orders>();
        ResultSet rs = cn.ejecutarConsulta(filtro);
        try {
           if (rs.next()) {
                do {
                    lista.add(new Orders(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getDouble(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14)));
                } while (rs.next());
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        return lista;
    }

    public boolean borrarRegistro (int id) {
    	cn.getConexion();
        boolean resultado = false;
        String sql = "DELETE FROM Orders WHERE OrderID = " + id;
        try {
            resultado = cn.eliminarRegistro(sql);
            } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
            }
        return resultado;
    }
    
    
}
