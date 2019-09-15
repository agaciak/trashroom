package pl.agaciak.trashroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agaciak.trashroom.model.Towar;

import java.util.List;

public interface TowarRepository extends JpaRepository<Towar, Long> {
    List<Towar> findByNameProduct(String nameProduct);

}
