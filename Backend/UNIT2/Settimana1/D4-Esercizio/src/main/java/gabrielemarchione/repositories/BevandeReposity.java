package gabrielemarchione.repositories;

import gabrielemarchione.entities.Bevande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandeReposity extends JpaRepository<Bevande, Long> {
}
