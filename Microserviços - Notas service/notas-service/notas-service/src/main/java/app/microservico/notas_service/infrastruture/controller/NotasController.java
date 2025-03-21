package app.microservico.notas_service.infrastruture.controller;

import app.microservico.notas_service.application.dto.NotaRequestDTO;
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
    public LancamentoNota adicionarNota(@RequestBody NotaRequestDTO dto) {
        return servico.salvarNota(dto.getNomeAluno(), dto.getNotaValor());
    }

    @GetMapping
    public List<LancamentoNota> obterTodasNotas() {
        return servico.getAllNotas();
    }
}
