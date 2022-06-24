/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Shippers;
import conexionBD.Conexion;
import java.util.ArrayList;

/**
 *
 * @author clara
 */
public class ShipperDAO {

    Conexion cn = new Conexion(2);

    public boolean insertarRegistro(Shippers shipper) {
    	cn.getConexion();
        boolean resultado = false;
        try {
		resultado = cn.agregarRegistro(shipper);
            } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
            }
        return resultado;
    }


    public boolean modificarRegistro(Shippers shipper) {
    	cn.getConexion();
        boolean resultado = false;
        try {
            resultado = cn.actualizarRegistro(shipper);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    
    public ArrayList<Shippers> buscar(String filtro) {
    	cn.getConexion();
        ArrayList<Shippers> lista = new ArrayList<Shippers>();
        ResultSet rs = cn.ejecutarConsulta(filtro);
        try {
            if (rs.next()) {
                do {
                    lista.add(new Shippers(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3)));
                } while (rs.next());
            }
        } catch (SQLException ex) {
            System.out.printf("Error al buscar");
        }
        return lista;
    }


    public boolean borrarRegistro(int id) {
        cn.getConexion();
        boolean resultado = false;
        String sql = "DELETE FROM Shippers WHERE ShipperID = " + id;
        try {
			resultado = cn.eliminarRegistro(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return resultado;
    }

    
}
