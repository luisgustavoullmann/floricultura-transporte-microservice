package com.microservice.transportador.repositories;

import com.microservice.transportador.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Luis Gustavo Ullmann on 29/06/2020
 */
@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
