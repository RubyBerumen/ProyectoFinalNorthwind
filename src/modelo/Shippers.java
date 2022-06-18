/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author clara
 */
public class Shippers {

    private int shipperID;
    private String companyName;
    private String phone;
    
    public Shippers(int shipperID, String companyName, String phone) {
        this.shipperID = shipperID;
        this.companyName = companyName;
        this.phone = phone;
    }

    
    public int getShipperID() {
        return shipperID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return phone;
    }
    

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
