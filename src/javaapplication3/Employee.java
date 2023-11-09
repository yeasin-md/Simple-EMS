/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.io.*;
/**
 *
 * @author User
 */
public class Employee implements Serializable{
    private String name;
    private String surname;
    private Job job;
    private int staffNr;

    public Employee(String name, String surname, Job job, int staffNr) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.staffNr = staffNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getStaffNr() {
        return staffNr;
    }

    public void setStaffNr(int staffNr) {
        this.staffNr = staffNr;
    }
    
        
    
    
}
