/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gerardomedina.Interface;

import com.portfolio.gerardomedina.Entity.Persona;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto persona
    public void savePersona (Persona persona);
    
    //Eliminar Persona por Id
    public void deletePersona(long id);
    
    //buscar persona por id
    public Persona findPersona(long id);
    
}