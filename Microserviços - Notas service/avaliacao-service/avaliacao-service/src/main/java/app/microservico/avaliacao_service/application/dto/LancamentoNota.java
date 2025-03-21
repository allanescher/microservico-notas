package app.microservico.avaliacao_service.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LancamentoNota {

    private String nomeAluno;
    private double nota; // Representando aprovação (true) ou reprovação (false)
}
