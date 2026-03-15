package io.github.thejeremias.cep.client;

import io.github.thejeremias.cep.dto.CepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "${clients.viacep.url}")
public interface ViaCepClient {

    @GetMapping("/ws/{cep}/json")
    CepResponse buscarCep(@PathVariable Integer cep);

}
