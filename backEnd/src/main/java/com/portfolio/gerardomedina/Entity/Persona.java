
package com.portfolio.gerardomedina.Entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Size(min=1, max = 50, message="No cumple con la longitud ")
    private String nombre;
    
    @NotNull
    @Size(min=1, max = 50, message="No cumple con la longitud ")
    private String apellido;
    
       
    @Size(min=1, max = 100, message="No cumple con la longitud ")
    private String img;

    public static class Long {

        public Long() {
        }
    }
}
