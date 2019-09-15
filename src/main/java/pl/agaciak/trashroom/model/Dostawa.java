package pl.agaciak.trashroom.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "dostawy")
public class Dostawa {
    public Dostawa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Set<Towar> getTowary() {
        return towary;
    }

    public void setTowary(Set<Towar> towary) {
        this.towary = towary;
    }

    public Dostawa(Long id, String nameProduct, Set<Towar> towary) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.towary = towary;
    }

    @Id
    private Long id;
    private String nameProduct;

    @ManyToMany
    private Set<Towar> towary = new HashSet<>();

}


