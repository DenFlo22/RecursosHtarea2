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
public class Empleados {
    int id;
    String Nombre;
     String Apellido_Paterno;
     String Apellido_Materno;
     int Edad;
     String email;
     int telefono;
     float salario;
     String hiredate;
     //Metodo: Son las acciones que realiza un objeto
     public void getDetails(){
         System.out.println("Id:" + id);
         System.out.println("FirstName:" + Nombre);
         System.out.println("ApellidoPaterno:" + Apellido_Paterno);
         System.out.println("ApellidoMaterno:" + Apellido_Materno);
         System.out.println("Age:" + Edad);
         System.out.println("Email:" + email);
         System.out.println("Phone Number:" + telefono);
         System.out.println("Salary:" + salario);
         System.out.println("Hire Date:" + hiredate);
     }
            
    
}
