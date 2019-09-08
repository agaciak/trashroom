package pl.agaciak.trashroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agaciak.trashroom.model.Towar;

public interface TowarRepository extends JpaRepository<Towar, Long> {

}
