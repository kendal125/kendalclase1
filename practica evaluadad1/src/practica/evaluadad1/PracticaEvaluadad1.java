/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.evaluadad1;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class PracticaEvaluadad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         monto total que debe pagar a la Caja 
         Costarricense del Seguro Social (CCSS)
        */
        /*se requiere un programa que 
         calcule dicho monto basado en el salario para un empleado especifico
        */
        /*
        El programa debe solicitar el salario individual y calcular el monto total a pagar aplicando los 
         Seguro de Enfermedad y Maternidad (SEM) al 9.25% del salario.
        - Invalidez, Vejez y Muerte (IVM) al 5.08% del salario. 
        */
        String lectura="";//se guarda el salario que digita el usuario
        lectura=JOptionPane.showInputDialog("digite su salario");//pide al usuario su salario
        int sal=Integer.parseInt(lectura);
        
        Double salSEM=(sal*0.0925);//se multiplica el salario por el seguro de maternidad
        Double salIVM=(sal*0.0508);// se multiplica por el seguro de invalidez
        Double salpagar=(salSEM+salIVM);//se suma lo que tiene que pagar
        Double salpor=(salpagar-sal);//se resta lo que tiene que pagar 
        Double salpe=(salpor*0.025);//se multiplica por el 2,5%
        
        JOptionPane.showMessageDialog(null, "su salario con SEM es: " +salSEM);//imprime el resultado del SEM
        JOptionPane.showMessageDialog(null, "su salario con IVM es: " +salIVM);//imprime el resultado del IVM
        JOptionPane.showMessageDialog(null, "usted debera pagar es: " +salpagar);// lo que tiene que pagar 
        JOptionPane.showMessageDialog(null, "se le restara: " +salpor);// se resta lo que tiene que pagar a su salario
        JOptionPane.showMessageDialog(null, "su salario final es: :" +salpe);//resultado final de su salario
        
        
        
        
        
        
                
                
    
        
        
        
        
        
    }
    
}
