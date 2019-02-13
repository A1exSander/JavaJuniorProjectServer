package ru.javajunior.juniorproject.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "portion")
public class Portion {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "portionId", length = 6, nullable = false)
    private int portionID;
    @Column(name = "mass", nullable = false)
    private int mass;
    @Column(name = "brDinSup", nullable = false)
    private String brDinSup;
    @Column(name = "date", nullable = false)
    private String date;
    @Column (name = "userId", nullable = false)
    private int userId;
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "portionUserId", nullable = false)
//    private User user;
    @Column(name = "ingredientId", nullable = false)
    private int ingredientId;
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "portion_ingredient", joinColumns = { @JoinColumn(name = "portion_id") },
//            inverseJoinColumns = { @JoinColumn(name = "ingredient_id") })

//    private List<Ingredient> ingredients;

    public int getPortionID() {
        return portionID;
    }

    public void setPortionID(int portionID) {
        this.portionID = portionID;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

//    public List<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<Ingredient> ingredients) {
//        this.ingredients = ingredients;
//    }
}
