package app.microservico.notas_service.domain.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class Nota {
    private double valor;
    public boolean isAprovado() {
        return valor >= 6.0;
    }
}
