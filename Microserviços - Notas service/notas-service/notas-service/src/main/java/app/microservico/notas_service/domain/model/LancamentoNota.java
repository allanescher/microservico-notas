package app.microservico.notas_service.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notas")
public class LancamentoNota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAluno;

    @Embedded
    private Nota nota;

    public LancamentoNota(String nomeAluno, double notaValor) {
        this.nomeAluno = nomeAluno;
        this.nota = new Nota(notaValor); // Cria a Nota já com o conceito atribuído
    }
}
