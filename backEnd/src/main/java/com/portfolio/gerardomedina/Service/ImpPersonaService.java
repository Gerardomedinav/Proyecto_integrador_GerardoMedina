/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gerardomedina.Service;

import com.portfolio.gerardomedina.Entity.Persona;
import com.portfolio.gerardomedina.Interface.IPersonaService;
import com.portfolio.gerardomedina.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonaRepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
    ipersonaRepository.save(persona);  
    }

    @Override
    public void deletePersona(long id) {
       ipersonaRepository.deleteById(id);  
    
    }

    @Override
    public Persona findPersona(long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
