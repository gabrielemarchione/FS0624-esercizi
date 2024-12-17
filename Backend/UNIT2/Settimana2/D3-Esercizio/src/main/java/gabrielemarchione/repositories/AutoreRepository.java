package gabrielemarchione.repositories;

import gabrielemarchione.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {
    boolean existsByEmail(String email);
}
