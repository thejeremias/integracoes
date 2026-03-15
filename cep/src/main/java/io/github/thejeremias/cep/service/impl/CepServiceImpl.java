package io.github.thejeremias.cep.service.impl;

import io.github.thejeremias.cep.client.ViaCepClient;
import io.github.thejeremias.cep.dto.CepRequest;
import io.github.thejeremias.cep.dto.CepResponse;
import io.github.thejeremias.cep.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepClient viaCepClient;

    @Override
    public CepResponse buscarCep(CepRequest cepRequest) {
        return viaCepClient.buscarCep(Integer.valueOf(cepRequest.cep()));
    }

}
