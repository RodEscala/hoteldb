package com.sumativa.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumativa.hotel.model.Reserva;
import com.sumativa.hotel.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService{

    // Inyeccion de dependencias
    @Autowired
    private ReservaRepository reservaRepository;


    // obtener todas las reservas
    @Override
    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }
    
    // obtener una reserva por  id
    @Override
    public Optional<Reserva> getReservaById(Long id){
        return reservaRepository.findById(id);
    }

    // Create reserva
    @Override
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    // Update reserva por id
    @Override
    public Reserva updateReserva(Long id, Reserva reserva){
        if(reservaRepository.existsById(id)){
            reserva.setId(id);
            return reservaRepository.save(reserva);
        }
        else{
            return null;
        }  
    }

    // Delete reserva por el id
    @Override
    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }





}
