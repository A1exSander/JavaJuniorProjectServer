package ru.javajunior.juniorproject.entity;


import java.util.List;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ration")
public class Ration {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int rationID;
    @Column(name = "mass", nullable = false)
    private int mass;
    @Column(name = "brDinSup", nullable = false)
    private String brDinSup;
    @Column(name = "date", nullable = false)
    private String date;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "ration_ingredient", joinColumns = { @JoinColumn(name = "ration_id") },
            inverseJoinColumns = { @JoinColumn(name = "ingredient_id") })

    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public int getRationID() {
        return rationID;
    }

    public void setRationID(int rationID) {
        this.rationID = rationID;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrDinSup() {
        return brDinSup;
    }

    public void setBrDinSup(String brDinSup) {
        this.brDinSup = brDinSup;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
