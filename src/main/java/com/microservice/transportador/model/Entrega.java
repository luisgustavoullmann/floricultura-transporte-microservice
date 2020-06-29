package com.microservice.transportador.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Luis Gustavo Ullmann on 29/06/2020
 */
@Getter
@Setter
@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId; // vem do fornecedor
    private LocalDate dataParaBusca;
    private LocalDate previsaoParaEntrega;
    private String enderecoOrigem;
    private String enderecoDestino;
}
