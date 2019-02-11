package ru.javajunior.juniorproject.entity;


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
    @Column(name = "userID", nullable = false)
    private int userID;
    @Column(name = "ingredientID", nullable =false)
    private int ingredientID;
    @Column(name = "mass", nullable = false)
    private int mass;
    @Column(name = "BrDinSup", nullable = false)
    private String BrDinSup;
    @Column(name = "date", nullable = false)
    private String date;

    public int getRationID() {
        return rationID;
    }

    public void setRationID(int rationID) {
        this.rationID = rationID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrDinSup() {
        return BrDinSup;
    }

    public void setBrDinSup(String brDinSup) {
        BrDinSup = brDinSup;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
