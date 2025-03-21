package app.microservico.avaliacao_service.infrastruture.controller;

import app.microservico.avaliacao_service.application.dto.LancamentoNota;
import app.microservico.avaliacao_service.application.service.AvaliacaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    private final AvaliacaoService avaliacaoService;

    public AvaliacaoController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    @PostMapping("/avaliar")
    public void avaliarNota(@RequestBody LancamentoNota lancamentoNota) {
        avaliacaoService.avaliarNota(lancamentoNota);
    }
}
