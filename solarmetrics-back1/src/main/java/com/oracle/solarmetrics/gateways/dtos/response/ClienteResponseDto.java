package com.oracle.solarmetrics.gateways.dtos.response;


import com.oracle.solarmetrics.domains.Cliente;

public record ClienteResponseDto (
        String nome,
        String tipoUser,
        String id,
        String email,
        String telefone
){
    public static ClienteResponseDto fromCliente(Cliente cliente){
        return new ClienteResponseDto (
                cliente.getNome(),
                cliente.getTipoUser(),
                cliente.getId(),
                cliente.getEmail(),
                cliente.getTelefone()
        );
    }
}