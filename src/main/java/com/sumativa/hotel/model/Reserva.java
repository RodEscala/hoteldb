package com.sumativa.hotel.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(min = 2, max = 30, message = "El nombre debe tener entre 2 y 30 caracteres")
    @Pattern(regexp = "[A-Za-z0-9 ]+$", message = "El campo solo puede contener letras y números")
    @NotBlank(message = "El campo nombre no puede estar vacio")
    @Column(name = "nombre")
    private String nombre;

    @Size(min = 2, max = 30, message = "El nombre debe tener entre 2 y 30 caracteres")
    @Pattern(regexp = "[A-Za-z0-9]+$", message = "El campo solo puede contener letras y números")
    @NotBlank(message = "El campo disponibilidad no puede estar vacio")
    @Column(name = "disponibilidad")
    private String disponibilidad;



    public Long getId(){
        return this.id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDisponibilidad(){
        return disponibilidad;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }
}
