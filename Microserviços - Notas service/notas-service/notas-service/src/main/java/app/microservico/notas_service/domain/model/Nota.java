package app.microservico.notas_service.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // Hibernate precisa de construtor sem parâmetros
public class Nota {

    @Column(name = "nota")
    private double nota;

    @Column(name = "conceito")
    private String conceito;

    // Método de fábrica para manter imutabilidade
    public static Nota criarNota(double nota) {
        return new Nota(nota);
    }

    // Construtor privado para garantir imutabilidade
    public Nota(double nota) {
        this.nota = nota;
        this.conceito = atribuirConceito(nota);
    }

    public boolean isAprovado() {
        return nota >= 6.0;
    }

    private String atribuirConceito(double nota) {
        if (nota >= 9.0) return "A";
        else if (nota >= 7.0) return "B";
        else if (nota >= 5.0) return "C";
        else return "D";
    }
}