package app.microservico.avaliacao_service.application.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = )
public class ResultadoAvaliacao {
    private String nomeAluno;
    private double nota;
    private String status;
}
