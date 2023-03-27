/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gerardomedina.Security.Entity;

import com.portfolio.gerardomedina.Security.Enums.RolNombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author USUARIO
 */
@Entity
public class Rol{
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    
    //constructor
    public Rol (){
    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    //getter & setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
}