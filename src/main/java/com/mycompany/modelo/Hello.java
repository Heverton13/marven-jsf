/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Aluno
 */

@ManagedBean
public class Hello {
    
   public String sayHello(){
       return "Hello Marven!";
   }
}
