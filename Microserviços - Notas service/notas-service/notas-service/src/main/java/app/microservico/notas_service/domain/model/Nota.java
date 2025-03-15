package app.microservico.notas_service.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter@Setter
@NoArgsConstructor@AllArgsConstructor
public class Nota {

    @Column(name = "nota")
    private double nota;

    @Column(name = "conceito")  // Adiciona o campo conceito
    private String conceito;

    public boolean isAprovado() {
        return nota >= 6.0;
    }

    //Metodo que atribui conceito com base na nota
    public void atribuirConceito() {
        if (nota >= 9.0) {
            this.conceito = "A";
        } else if (nota >= 7.0) {
            this.conceito = "B";
        } else if (nota >= 5.0) {
            this.conceito = "C";
        } else {
            this.conceito = "D";
        }
    }
}
