package com.practicingMicroservices.Microservices.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flightId", nullable = false, length = 11)
    private Integer flightId;
    @Column(name = "companyId", nullable = false, length = 11)
    private Integer companyId;
    @Column(name = "returning", length = 4)
    private Boolean returning;
    @Column(name = "origin", length = 50)
    private String origin;
    @Column(name = "destination", length = 50)
    private String destination;
    @Column(name = "price", length = 50)
    private Integer price;
    @Column(name = "date",  length = 50)
    private Date date;
    @Column(name = "duration", length = 50)
    private String duration;
    @Column(name = "luggage", length = 11)
    private Boolean luggage;
    @Column(name = "layovers", length = 4)
    private Integer layovers;

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public boolean isReturning() {
        return returning;
    }

    public void setReturning(boolean returning) {
        this.returning = returning;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isLuggage() {
        return luggage;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    public Integer getLayovers() {
        return layovers;
    }

    public void setLayovers(Integer layovers) {
        this.layovers = layovers;
    }
}
