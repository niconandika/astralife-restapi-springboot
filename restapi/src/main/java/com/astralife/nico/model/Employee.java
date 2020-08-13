package com.astralife.nico.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nik")
    private String nik;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "positionId")
    private long positionId;

    @Column(name = "divisionId")
    private long divisionId;

    @Column(name = "lastPosition")
    private String lastPosition;

    @CreationTimestamp
    private Date createdDate;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public long getPositionId() {
        return positionId;
    }
    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public long getDivisionId() {
        return divisionId;
    }
    public void setDivisionId(long divisionId) {
        this.divisionId = divisionId;
    }

    public String getLastPosition() {
        return lastPosition;
    }
    public void setLastPosition(String lastPosition) {
        this.lastPosition = lastPosition;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
