/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.empleados;

import javax.swing.JOptionPane;

/**
 *
 * @author Deny
 */
public class Main {

    public static void main(String[] args) {
        Empleados e1 = new Empleados();
        Empleados e2 = new Empleados();
        Departament d1 = new Departament();
        Job j1 = new Job();
        e1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Id"));
        e1.Nombre = JOptionPane.showInputDialog("Ingresa el Nombre");
        e1.Apellido_Paterno = JOptionPane.showInputDialog("Ingresa el apellido Paterno");
        e1.Apellido_Materno = JOptionPane.showInputDialog("Ingresa el apellido Materno");
        e1.Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Edad"));
        e1.email = JOptionPane.showInputDialog("Ingresa el email");
        e1.telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero telefonico"));
        e1.salario = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el Salario"));
        e1.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");

        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Id"));
        e2.Nombre = JOptionPane.showInputDialog("Ingresa el Nombre");
        e2.Apellido_Paterno = JOptionPane.showInputDialog("Ingresa el apellido Paterno");
        e2.Apellido_Materno = JOptionPane.showInputDialog("Ingresa el apellido Materno");
        e2.Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Edad"));
        e2.email = JOptionPane.showInputDialog("Ingresa el email");
        e2.telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero telefonico"));
        e2.salario = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el Salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratacion");

        d1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Id"));
        d1.title = JOptionPane.showInputDialog("Ingresa el Titulo");
        d1.location = JOptionPane.showInputDialog("Ingresa la Localizacion");

        j1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Id"));
        j1.title = JOptionPane.showInputDialog("Ingresa el Titulo");
        j1.minSalary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Minimo Salario"));
        j1.maxSalary = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el Maximo Salario"));


        /*
        e1.id  =1;
        e1.Nombre ="Tibucio";
        e1.Apellido_Paterno = "Sanchez";
        e1.Apellido_Materno = "Mora";
        e1.Edad= 30;
        e1.email =   "tiburcio@cesba.mx";
        e1.telefono  = 2101616;
        e1.salario  = 30000.00f;
        e1.hiredate  = "24/07/2021";
         */
 /*Empleados e2;
        e2 = new Empleados();
        e2.id  =2;
        e2.Nombre ="Samuel";
        e2.Apellido_Paterno = "Carranza";
        e2.Apellido_Materno = "Diaz";
        e2.Edad= 32;
        e2.email =   "samu@cesba.mx";
        e2.telefono  = 51234687;
        e2.salario  = 20000.00f;
        e2.hiredate  = "31/07/2021";*/
        e1.getDetails();
        System.out.println("-------------------------------------");
        e2.getDetails();
        System.out.println("-------------------------------------");
        d1.getDetails();
        System.out.println("-------------------------------------");
        j1.getDetails();
        System.out.println("-------------------------------------");

    }
}
