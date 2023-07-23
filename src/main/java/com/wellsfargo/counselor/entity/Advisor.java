package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

@Entity
public class Client{


        @Id
        @GeneratedValue()
        private long clientId;
        private long advisorId;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Column(nullable = false)
        private String address;

        @Column(nullable = false)
        private String phone;

        @Column(nullable = false)
        private String email;

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

        public Long getClientId() {
        return clientId;
    }

        public String getFirstName() {
        return firstName;
    }

        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

        public String getLastName() {
        return lastName;
    }

        public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        public String getAddress() {
        return address;
    }

        public void setAddress(String address) {
        this.address = address;
    }

        public String getPhone() {
        return phone;
    }

        public void setPhone(String phone) {
        this.phone = phone;
    }

        public String getEmail() {
        return email;
    }

        public void setEmail(String email) {
        this.email = email;
    }
    }
@Entity
public class Portfolio{
    @Id
    @GeneratedValue()
    private long portfolioId;

    private long clientId;
    private long creationDate;
    protected Portfolio() {

    }
    public Long getClientId() {
        return clientId;
    }
    public Long getPortfolioId() {
        return portfolioId;
    }
    public Long getClientId() {
        return creationDate;
    }

}
@Entity
public class Security{
    @Id
    @GenerateValue()
    private long securityID;

    @ManyToOne
    private Portfolio portfolioID;//here

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(String name, String category, long purchasePrice, Date purchaseDate, long quantity, Portfolio portfolioID) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolioID = portfolioID;//here
    }

    public Long getSecurityID() {
        return securityID;
    }

    public Portfolio getPortfolioID() { return portfolioID; }//here

    public void setPortfolioID(Portfolio portfolioID) { this.portfolioID = portfolioID; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

}

