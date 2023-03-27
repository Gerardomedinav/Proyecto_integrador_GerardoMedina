/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gerardomedina.Controller;

import com.portfolio.gerardomedina.Entity.Persona;
import com.portfolio.gerardomedina.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class PersonaController {
   @Autowired IPersonaService ipersonaService;
   @GetMapping("/personas/traer")
   public List<Persona> getPersona(){
   return ipersonaService.getPersona();
   }
   
   @PostMapping("/personas/crear")
   public String createPersona(@RequestBody Persona persona){
       ipersonaService.savePersona(persona);
       return "La persona Fue creada correctamente";
   }
   
  // @DeleteMapping("/personas/borrar/(id)")
  // public String deletePersona(@PathVariable Long id){
   // ipersonaService.deletePersona(id);
   // return "La persona fue eliminada correctamente";
   //}
   
@DeleteMapping("/personas/borrar/{id}")
public String deletePersona(@PathVariable long id){
 ipersonaService.deletePersona(id);
 return "La persona fue eliminada correctamente";
 }
    
   @PutMapping("/personas/editar/{id}")
   public Persona editPersona(@PathVariable Long id,
                              @RequestParam("nombre") String NuevoNombre,
                              @RequestParam("apellido") String NuevoApellido,
                              @RequestParam("img") String NuevoImg){
       Persona persona = ipersonaService.findPersona(id);
       persona.setNombre(NuevoNombre);
       persona.setApellido(NuevoApellido);
       persona.setImg(NuevoImg);
       return persona;
   }
   @GetMapping("personas/traer/perfil")
   public Persona findPersona(){
       return ipersonaService.findPersona((long)1);
   }
   
}
   
