package com.microservice.transportador.service;

import com.microservice.transportador.model.Entrega;
import com.microservice.transportador.model.dto.EntregaDto;
import com.microservice.transportador.model.dto.VoucherDto;
import com.microservice.transportador.repositories.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Luis Gustavo Ullmann on 29/06/2020
 */
@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;

    public VoucherDto reservaEntrega(EntregaDto pedidoDto) {
        Entrega entrega = new Entrega();
        entrega.setDataParaBusca(pedidoDto.getDataParaEntrega()); //Data que o transporte buscar no fornecedor
        entrega.setPrevisaoParaEntrega(pedidoDto.getDataParaEntrega().plusDays(1l)); // Data pervista para entregar no cliente final
        entrega.setEnderecoDestino(pedidoDto.getEnderecoDestino()); //Destino = endereco cliente final
        entrega.setEnderecoOrigem(pedidoDto.getEnderecoOrigem()); //Origem = endereco fornecedor
        entrega.setPedidoId(pedidoDto.getPedidoId()); //Id vem do pedido feito ao fornecedor pela loja

        entregaRepository.save(entrega); //salvando a entrega

        VoucherDto voucher = new VoucherDto();
        voucher.setNumero(entrega.getId());
        voucher.setPrevisaoParaEntrega(entrega.getPrevisaoParaEntrega());
        return voucher;
    }
}
