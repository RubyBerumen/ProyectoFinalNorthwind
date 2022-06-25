/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author clara
 */
public class Orders {
    
    private int orderID;
    private String customerID;
    private int employeeID;
    private String orderDate;
    private String requiredDate;
    private String shippedDate;
    private int shipVia;
    private double freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    public Orders(int orderID, String customerID, int employeeID, String orderDate, String requiredDate, String shippedDate, int shipVia, double freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public int getShipVia() {
        return shipVia;
    }

    public double getFreight() {
        return freight;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public void setShipVia(int shipVia) {
        this.shipVia = shipVia;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }    
    

}
