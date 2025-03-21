package app.microservico.notas_service.application.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class NotaRequestDTO {
    private String nomeAluno;
    private double notaValor;
}
