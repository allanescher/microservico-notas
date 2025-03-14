package app.microservico.notas_service.infrastruture.repository;

import app.microservico.notas_service.domain.model.LancamentoNota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<LancamentoNota, Long> {}
