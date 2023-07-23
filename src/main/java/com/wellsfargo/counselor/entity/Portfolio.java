package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @ManyToOne
    private Client clientID;//here

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(Date creationDate, Client clientID) {
        this.creationDate = creationDate;
        this.clientID = clientID;//here
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClientID() { return clientID; }//here

    public void setClientID(Advisor advisorID) { this.clientID = clientID; }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}