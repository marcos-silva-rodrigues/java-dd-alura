package br.com.alura.codechella.infra.evento;

import br.com.alura.codechella.infra.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
