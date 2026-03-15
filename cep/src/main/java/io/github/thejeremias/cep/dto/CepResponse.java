package io.github.thejeremias.cep.dto;

public record CepResponse(String localidade, String uf, String estado, String bairro, String logradouro, String cep, String complemento) {}
