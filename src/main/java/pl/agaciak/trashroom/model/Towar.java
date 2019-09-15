package pl.agaciak.trashroom.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Towar {


    @Id
    @GeneratedValue(generator = "towarseq")
    @SequenceGenerator(name = "towarseq", sequenceName = "tower_seq", allocationSize = 1)
    private Long id;

    private String nameProduct;
    private Integer quantity;
    private LocalDate timeUse;
    private String nameDistributor;


    @ManyToMany
    private Set<Dostawa> dostawy = new HashSet<>();

    public Towar() {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getTimeUse() {
        return timeUse;
    }

    public void setTimeUse(LocalDate timeUse) {
        this.timeUse = timeUse;
    }

    public String getNameDistributor() {
        return nameDistributor;
    }

    public void setNameDistributor(String nameDistributor) {
        this.nameDistributor = nameDistributor;
    }





    public Towar(String nameProduct, Integer quantity, LocalDate timeUse, String nameDistributor) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.timeUse = timeUse;
        this.nameDistributor = nameDistributor;

    }


    public Towar(String nameProduct, Integer quantity, LocalDate timeUse, String nameDistributor, Set<Dostawa> dostawy) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.timeUse = timeUse;
        this.nameDistributor = nameDistributor;
        this.dostawy = dostawy;
    }

    public Set<Dostawa> getDostawy() {
        return dostawy;
    }

    public void setDostawy(Set<Dostawa> dostawy) {
        this.dostawy = dostawy;
    }
}
