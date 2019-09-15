package pl.agaciak.trashroom.service;


import org.springframework.stereotype.Service;
import pl.agaciak.trashroom.model.Towar;
import pl.agaciak.trashroom.repository.TowarRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TowarService {


private final TowarRepository towarRepository;


    public TowarService(TowarRepository towarRepository) {
        this.towarRepository = towarRepository;
    }

    public List<Towar> getTowarlist() {
        List<Towar> allTowary = towarRepository.findAll();

        return allTowary;
    }
}
