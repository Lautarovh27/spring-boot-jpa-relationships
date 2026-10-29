package com.springboot.jpa.springboot_jpa_relationship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name="invoices")
public class Invoice {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Long amount;

    @ManyToOne 
    private Client client;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Invoice(String description, Long amount) {
        this.description = description;
        this.amount = amount;
    }

    public Invoice() {
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Invoice {id=" + id + ", description=" + description + ", amount=" + amount + ", client=" + client + "}";
    }

    
}
