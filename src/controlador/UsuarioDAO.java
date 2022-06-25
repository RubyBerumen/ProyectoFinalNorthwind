/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Usuario;
import vista.Login;
import conexionBD.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author clara
 */
public class UsuarioDAO implements Runnable{
    Conexion conexion;
	
    private String filtro;

    public void setFiltro(String filtro) {
	this.filtro = filtro;
    }	

    public UsuarioDAO() {
	conexion = new Conexion(2);
    }
    
   
    
    public ArrayList<Usuario> buscarUsuario (String filtro){
	ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		
	ResultSet rs = conexion.ejecutarConsulta(filtro);
		
	try {
            if(rs.next()) {
		do {
                    listaUsuarios.add(new Usuario(rs.getString(1),rs.getString(2)));			
		}while(rs.next());
            }else {
				
            }
	} catch (SQLException e) {
            e.printStackTrace();
	}
	return listaUsuarios;
    }


    @Override
    public void run() {
	buscarUsuario(filtro);
    }   
 
    
    
    
    
    
}
