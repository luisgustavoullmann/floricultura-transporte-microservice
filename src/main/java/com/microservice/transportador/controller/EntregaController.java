package com.microservice.transportador.controller;

import com.microservice.transportador.model.dto.EntregaDto;
import com.microservice.transportador.model.dto.VoucherDto;
import com.microservice.transportador.service.EntregaService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Luis Gustavo Ullmann on 29/06/2020
 */
@RestController
@RequestMapping("/entrega")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @PostMapping
    public VoucherDto reserveEntrega(@RequestBody EntregaDto pedidoDto){
        return entregaService.reservaEntrega(pedidoDto);
    }
}
