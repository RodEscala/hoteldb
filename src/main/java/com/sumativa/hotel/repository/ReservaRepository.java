package com.sumativa.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumativa.hotel.model.Reserva;

public interface ReservaRepository extends  JpaRepository<Reserva, Long>{
    
}
