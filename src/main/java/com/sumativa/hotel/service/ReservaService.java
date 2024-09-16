package com.sumativa.hotel.service;

import java.util.List;
import java.util.Optional;

import com.sumativa.hotel.model.Reserva;

//Interface
public interface ReservaService {
    //Esqueleto del interface

    // getAllReservas() debe devolver una lista de las reservas
    List<Reserva> getAllReservas();

    // getReservas  obtiene una reserva por su id
    Optional<Reserva> getReservaById(Long id);
    
    // crea un objeto de tipo Reserva
    Reserva createReserva(Reserva reserva);

    // actualiza un objeto de tipo Reserva por su id
    Reserva updateReserva(Long id,Reserva reserva);

    // elimina una reserva por su id
    void deleteReservaById(Long id);
    
    
}
