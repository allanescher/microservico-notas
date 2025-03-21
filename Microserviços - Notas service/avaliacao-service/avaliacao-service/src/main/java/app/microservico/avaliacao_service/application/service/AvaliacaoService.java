package app.microservico.avaliacao_service.application.service;

import app.microservico.avaliacao_service.application.dto.LancamentoNota;
import app.microservico.avaliacao_service.application.dto.ResultadoAvaliacao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {
    //private final KafkaTemplate<String, ResultadoAvaliacao> kafkaTemplate;

    // Metodo para avaliar a nota e enviar o resultado para o Kafka
    //@KafkaListener(topics = "notas", groupId = "grupo-avaliacao")
    public void avaliarNota(LancamentoNota nota) {
        // Lógica para avaliar se a nota é suficiente para aprovação
        String resultado = calcularStatus(nota.getNota());

        // Criando o objeto ResultadoAvaliacao com os dados recebidos
        ResultadoAvaliacao avaliacao = new ResultadoAvaliacao(nota.getNomeAluno(), nota.getNota(), resultado);

        // Enviando o resultado para o Kafka
        //kafkaTemplate.send("avaliacoes", avaliacao);
    }

    // Metodo para calcular o status do aluno com base na nota
    private String calcularStatus(double nota) {
        // Lógica de avaliação da nota (ajustável conforme requisitos)
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
