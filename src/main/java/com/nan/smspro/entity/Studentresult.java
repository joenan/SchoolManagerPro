/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nan.smspro.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Nandom
 */
@Entity
@Table(name = "studentresult")
@NamedQueries({
    @NamedQuery(name = "Studentresult.findAll", query = "SELECT s FROM Studentresult s")})
public class Studentresult implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "serial_no")
    private Integer serialNo;
    @Column(name = "name")
    private String name;
    @Column(name = "mat_no")
    private String matNo;
    @Basic(optional = false)
    @Column(name = "exam")
    private double exam;
    @Basic(optional = false)
    @Column(name = "ca")
    private double ca;
    @Column(name = "department")
    private String department;
    @Column(name = "degree")
    private String degree;

    public Studentresult() {
    }

    public Studentresult(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public Studentresult(Integer serialNo, double exam, double ca) {
        this.serialNo = serialNo;
        this.exam = exam;
        this.ca = ca;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatNo() {
        return matNo;
    }

    public void setMatNo(String matNo) {
        this.matNo = matNo;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serialNo != null ? serialNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentresult)) {
            return false;
        }
        Studentresult other = (Studentresult) object;
        if ((this.serialNo == null && other.serialNo != null) || (this.serialNo != null && !this.serialNo.equals(other.serialNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Studentresult[ serialNo=" + serialNo + " ]";
    }
    
}
