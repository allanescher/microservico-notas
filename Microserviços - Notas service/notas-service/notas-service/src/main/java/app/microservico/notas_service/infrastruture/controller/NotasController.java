package app.microservico.notas_service.infrastruture.controller;

import app.microservico.notas_service.application.service.NotasService;
import app.microservico.notas_service.domain.model.LancamentoNota;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
@RequiredArgsConstructor
public class NotasController {
    private final NotasService servico;

    @PostMapping
    public LancamentoNota adicionarNota(@RequestBody LancamentoNota nota) {
        return servico.salvarNota(nota);
    }

    @GetMapping
    public List<LancamentoNota> obterTodasNotas() {
        return servico.getAllNotas();
    }
}
