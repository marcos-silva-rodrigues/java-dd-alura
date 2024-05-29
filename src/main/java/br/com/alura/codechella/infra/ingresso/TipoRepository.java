package br.com.alura.codechella.infra.ingresso;

import br.com.alura.codechella.infra.ingresso.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
