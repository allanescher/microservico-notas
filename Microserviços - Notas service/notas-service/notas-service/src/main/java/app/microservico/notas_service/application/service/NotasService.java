package app.microservico.notas_service.application.service;

import app.microservico.notas_service.domain.model.LancamentoNota;
import app.microservico.notas_service.domain.model.Nota;
import app.microservico.notas_service.infrastruture.repository.NotaRepository;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotasService {
    private final NotaRepository repositorio;
    //private final KafkaTemplate<String, LancamentoNota> kafkaTemplate;

    public LancamentoNota salvarNota(String nomeAluno, double notaValor) {
        Nota nota = new Nota(notaValor); // Cria a nota com conceito já atribuído
        LancamentoNota lancamento = new LancamentoNota(null, nomeAluno, nota);
        return repositorio.save(lancamento);
    }

    public List<LancamentoNota> getAllNotas(){
        return repositorio.findAll();
    }
}
