/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.gerardomedina.Repository;

import com.portfolio.gerardomedina.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author USUARIO
 */


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}