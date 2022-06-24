package conexionBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Shippers;
import modelo.Customers;
import modelo.Orders;


public class Conexion {

    private static PreparedStatement pstm = null;
    private static CallableStatement cs;
    private static Savepoint sp = null;

    private static Connection conexionBD = null;
    private static Logger logger = Logger.getLogger("Log de conexion");

    public Conexion(int valor) {
    }

    private Conexion() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;"
                    + "user=Ruby;"
                    + "password=aguacate;"
                    + "encrypt=true;trustServerCertificate=true;";

            conexionBD = DriverManager.getConnection(url);
            System.out.println("conexion exitosa");
            //conexionBD.setAutoCommit(false);
            //sp = conexionBD.setSavepoint("Inicio");

        } catch (SQLException e) {
            System.out.println("Error de Conexion");
            e.printStackTrace();
        }
    }

    public static Connection getConexion() {

        if (conexionBD == null) {
            new Conexion();
        }

        return conexionBD;
    }

    public static void cerrarConexion() {
        try {
            cs.close();
            pstm.close();
            conexionBD.close();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error al cerrar la conexion", e);
        }

    }

    public static boolean eliminarRegistro(String sql) throws SQLException {
        try {
            pstm = conexionBD.prepareStatement(sql);
            pstm.executeUpdate();
            conexionBD.commit();
            return true;
        } catch (Exception ex) {
            conexionBD.rollback(sp);
            ex.printStackTrace();
        }
        return false;
    }

    public static ResultSet ejecutarConsulta(String sql) {
        try {
            String consulta = sql;
            pstm = conexionBD.prepareStatement(consulta);
            return pstm.executeQuery();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al ejecutar la consulta", e);
        }
        return null;
    }
    

    //Metodos para Shippers
    public static boolean actualizarRegistro(Shippers shipper) throws SQLException {
        try {
            pstm = conexionBD
                    .prepareStatement("UPDATE Shippers SET CompanyName = ?, Phone = ? WHERE ShipperID = ? ");
            pstm.setString(1, shipper.getCompanyName());
            pstm.setString(2, shipper.getPhone());
            pstm.setInt(3, shipper.getShipperID());
            pstm.executeUpdate();
            //conexionBD.commit();
            return true;
        } catch (Exception ex) {
            //conexionBD.rollback(sp);
            logger.log(Level.SEVERE, "Error al actualizar el proveedor", ex);
        }
        return false;

    }
    
    public static boolean agregarRegistro(Shippers shipper) throws SQLException {
        try {
            pstm = conexionBD
                    .prepareStatement("INSERT \"Shippers\"(\"CompanyName\",\"Phone\") VALUES (?, ?)");
            pstm.setString(1, shipper.getCompanyName());
            pstm.setString(2, shipper.getPhone());
            pstm.executeUpdate();
            //conexionBD.commit();
            return true;
        } catch (Exception ex) {
            //conexionBD.rollback(sp);
            logger.log(Level.SEVERE, "Error al insertar el proveedor", ex);
        }
        return false;

    }

    
    //Metodos para customers
    public static boolean actualizarRegistro(Customers customer) throws SQLException {
        try {
            pstm = conexionBD.prepareStatement("UPDATE Customers SET companyName = ?, contactName = ?, contactTitle = ?, "
                    + "address = ?, city = ?, region = ?, postalCode = ?, country = ?, phone = ?, fax = ? WHERE supplierID = ?");
            pstm.setString(1, customer.getCompanyName());
            pstm.setString(2, customer.getContactName());
            pstm.setString(3, customer.getContactTitle());
            pstm.setString(4, customer.getAddress());
            pstm.setString(5, customer.getCity());
            pstm.setString(6, customer.getRegion());
            pstm.setString(7, customer.getPostalCode());
            pstm.setString(8, customer.getCountry());
            pstm.setString(9, customer.getPhone());
            pstm.setString(10, customer.getFax());
            pstm.setString(11, customer.getCustomerID());
            pstm.executeUpdate();
            //conexionBD.commit();
            return true;
        } catch (Exception ex) {
        	//conexionBD.rollback(sp);
        	logger.log(Level.SEVERE,"Error al modificar el cliente",ex);
        }
        return false;
    }
    

    public static boolean agregarRegistro(Customers customer) throws SQLException {
        try {
            pstm = conexionBD.prepareStatement("INSERT \"Customers\"(\"companyName\",\"contactName\",\"contactTitle\","
                    + "\"address\",\"city\",\"region\",\"postalCode\",\"country\",\"phone\",\"fax\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstm.setString(1, customer.getCompanyName());
            pstm.setString(2, customer.getContactName());
            pstm.setString(3, customer.getContactTitle());
            pstm.setString(4, customer.getAddress());
            pstm.setString(5, customer.getCity());
            pstm.setString(6, customer.getRegion());
            pstm.setString(7, customer.getPostalCode());
            pstm.setString(8, customer.getCountry());
            pstm.setString(9, customer.getPhone());
            pstm.setString(10, customer.getFax());
            pstm.executeUpdate();
            //conexionBD.commit();
            return true;
        } catch (Exception ex) {
        	//conexionBD.rollback(sp);
        	logger.log(Level.SEVERE,"Error al insertar el cliente",ex);
        }
        return false;
    }
    

}
