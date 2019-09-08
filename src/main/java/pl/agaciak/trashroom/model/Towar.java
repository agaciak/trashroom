package pl.agaciak.trashroom.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDate;

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
    private Long statistics;

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

    public Long getStatistics() {
        return statistics;
    }

    public void setStatistics(Long statistics) {
        this.statistics = statistics;
    }

    public Towar(String nameProduct, Integer quantity, LocalDate timeUse, String nameDistributor, Long statistics) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.timeUse = timeUse;
        this.nameDistributor = nameDistributor;
        this.statistics = statistics;
    }
}
