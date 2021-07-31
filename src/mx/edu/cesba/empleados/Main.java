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
public class Main { 
    public static void main(String[] args) {
        Empleados e1= new Empleados();
        e1.id  =1;
        e1.Nombre ="Tibucio";
        e1.Apellido_Paterno = "Sanchez";
        e1.Apellido_Materno = "Mora";
        e1.Edad= 30;
        e1.email =   "tiburcio@cesba.mx";
        e1.telefono  = 2101616;
        e1.salario  = 30000.00f;
        e1.hiredate  = "24/07/2021";
        e1.getDetails();
        
    }
}
