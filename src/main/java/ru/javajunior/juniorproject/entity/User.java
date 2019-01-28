package ru.javajunior.juniorproject.entity;

// TODO: Занесение пользователей в базу данных

public class User {
    private String login;
    private String password;
    private double imt;
    private double weight;
    private double height;
    private int age;
    private double goalProtein;
    private double goalFat;
    private double goalCarbohydrates;
    private double goalEnergy;
    private String sex;
    private double bmr;
    private final String MALE = "MALE";
    private final String FEMALE = "FEMALE";


    public User(String login, String password) {
        this.login = login;
        this.password = password;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBmr() {
        if (sex.equals(MALE)){
            return 10*weight + 6.25*height - 5*age + 5;
        } else {
            return 10*weight + 6.25*height - 5*age - 161;
        }
    }
}
