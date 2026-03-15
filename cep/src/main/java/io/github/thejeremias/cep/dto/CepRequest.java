package io.github.thejeremias.cep.dto;

import jakarta.validation.constraints.Pattern;

public record CepRequest(@Pattern(regexp = "\\d{8}", message = "CEP inválido") String cep) {}
