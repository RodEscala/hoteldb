package com.sumativa.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumativa.hotel.model.Reserva;
import com.sumativa.hotel.service.ReservaService;






@RestController
@RequestMapping("/reservas")
public class ReservaController {
    
    private static final Logger log = LoggerFactory.getLogger(ReservaController.class);

    @Autowired
    private ReservaService reservaService;

    // Obtener todas las reservas
    @GetMapping
    public List<Reserva> getAllReservas() {
        log.info("Get /reservas");
        log.info("Retornando todas las reservas");
        return reservaService.getAllReservas();
    }

    // Obtener una reserva por el id
    @GetMapping("/{id}")
    public Optional<Reserva> getReservasById(@PathVariable Long id) {
        log.info("Get /reserva");
        log.info("Retornando la reserva con id ");
        log.debug("Retornando la reserva con id ",id);
        return reservaService.getReservaById(id);
    }

    // Crear una reserva
    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva) {
        log.info("Post /reserva");
        log.info("Crea una Reserva");
        return reservaService.createReserva(reserva);
    }

    // Actualiza una reserva por su id
    @PutMapping("/{id}")
    public Reserva updateReservaById(@PathVariable Long id, @RequestBody Reserva reserva) {
        log.info("Put /reserva");
        log.info("Actualiza una reserva con el id");
        log.debug("Actualiza una reserva con el id",id);
        return reservaService.updateReserva(id, reserva);
        
    }

    // Elimina una reserva por su id
    @DeleteMapping("/{id}")
    public void deleteReservaById(@PathVariable Long id){
        log.info("Delete /reserva");
        log.info("Borra una reserva por el id ");
        log.debug("Borra una reserva por el id ",id);
        reservaService.deleteReservaById(id);
    }
    
    
    
    
}
