package ru.javajunior.juniorproject.entity;

// TODO: Занесение пользователей в базу данных

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int userId;
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
    @Column(name = "goalEnergy")
    private double goalEnergy;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "bmr")
    private double bmr;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getImt() {
        return imt;
    }

    public void setImt(double imt) {
        this.imt = imt;
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
        return bmr;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", imt=" + imt +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                ", goalEnergy=" + goalEnergy +
                ", gender='" + gender + '\'' +
                ", bmr=" + bmr +
                '}';
    }
}
