/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.empleados;

/**
 *
 * @author Deny
 */
public class Job {
    int id;
    String title;
    double minSalary, maxSalary;
    public void getDetails(){
        System.out.println("id"+ id);
        System.out.println("title"+ title);
        System.out.println("minSalary"+ minSalary);
        System.out.println("maxSalary"+ maxSalary);
    }
    
}
