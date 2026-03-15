package io.github.thejeremias.cep.controller;

import io.github.thejeremias.cep.dto.CepRequest;
import io.github.thejeremias.cep.dto.CepResponse;
import io.github.thejeremias.cep.service.CepService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cep")
@RequiredArgsConstructor
public class CepController {

    private final CepService cepService;

    @GetMapping
    public CepResponse buscarCep(@Valid CepRequest cepRequest) {
        return cepService.buscarCep(cepRequest);
    }

}
