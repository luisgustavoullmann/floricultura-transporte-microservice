package com.microservice.transportador.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

/**
 * Created by Luis Gustavo Ullmann on 29/06/2020
 */
@Getter
@Setter
public class EntregaDto {
    private Long pedidoId;
    private LocalDate dataParaEntrega;
    private String enderecoOrigem; //Endereco Fornecedor
    private String enderecoDestino; //Endereco Cliente que fez o POST do pedido na loja
}
