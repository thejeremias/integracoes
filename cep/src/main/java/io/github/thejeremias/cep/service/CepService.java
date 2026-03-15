package io.github.thejeremias.cep.service;

import io.github.thejeremias.cep.dto.CepRequest;
import io.github.thejeremias.cep.dto.CepResponse;


public interface CepService {

    CepResponse buscarCep(CepRequest cepRequest);

}
