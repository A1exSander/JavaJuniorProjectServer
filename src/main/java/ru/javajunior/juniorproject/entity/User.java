package ru.javajunior.juniorproject.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "imt")
    private double imt;
    @Column(name = "weight", nullable = false)
    private double weight;
    @Column(name = "height", nullable = false)
    private double height;
    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "goalProtein")
    private double goalProtein;
    @Column(name = "goalFat")
    private double goalFat;
    @Column(name = "goalCarbohydrates")
    private double goalCarbohydrates;
    @Column(name = "goalEnergy")
    private double goalEnergy;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "bmr")
    private double bmr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImt() {
        return imt = weight/(height*height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getGoalProtein() {
        return goalProtein;
    }

    public void setGoalProtein(double goalProtein) {
        this.goalProtein = goalProtein;
    }

    public double getGoalFat() {
        return goalFat;
    }

    public void setGoalFat(double goalFat) {
        this.goalFat = goalFat;
    }

    public double getGoalCarbohydrates() {
        return goalCarbohydrates;
    }

    public void setGoalCarbohydrates(double goalCarbohydrates) {
        this.goalCarbohydrates = goalCarbohydrates;
    }

    public double getGoalEnergy() {
        return goalEnergy;
    }

    public void setGoalEnergy(double goalEnergy) {
        this.goalEnergy = goalEnergy;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBmr() {
        if (gender.equals("MALE")){
            return 10*weight + 6.25*height - 5*age + 5;
        } else {
            return 10*weight + 6.25*height - 5*age - 161;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", imt=" + imt +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", goalProtein=" + goalProtein +
                ", goalFat=" + goalFat +
                ", goalCarbohydrates=" + goalCarbohydrates +
                ", goalEnergy=" + goalEnergy +
                ", gender='" + gender + '\'' +
                ", bmr=" + bmr +
                '}';
    }
}
