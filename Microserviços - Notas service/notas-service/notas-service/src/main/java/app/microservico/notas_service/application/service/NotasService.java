package app.microservico.notas_service.application.service;

import app.microservico.notas_service.domain.model.LancamentoNota;
import app.microservico.notas_service.infrastruture.repository.NotaRepository;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NotasService {
    private final NotaRepository repositorio;
    //private final KafkaTemplate<String, LancamentoNota> kafkaTemplate;

    public LancamentoNota salvarNota(LancamentoNota nota) {
        nota.getNota().atribuirConceito();
        LancamentoNota salva = repositorio.save(nota);
        //kafkaTemplate.send("notas", salva); // Envia para Kafka
        return salva;
    }

    public List<LancamentoNota> getAllNotas(){
        return repositorio.findAll();
    }
}
