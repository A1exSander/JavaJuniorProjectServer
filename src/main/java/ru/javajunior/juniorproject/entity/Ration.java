package ru.javajunior.juniorproject.entity;

// TODO: Занесение дневного рациона в таблицу пользователя в базе данных

import java.util.Calendar;

public class Ration {
    private Meal breakfast;
    private Meal dinner;
    private Meal supper;
    private Calendar day;

    public Meal getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Meal breakfast) {
        this.breakfast = breakfast;
    }

    public Meal getDinner() {
        return dinner;
    }

    public void setDinner(Meal dinner) {
        this.dinner = dinner;
    }

    public Meal getSupper() {
        return supper;
    }

    public void setSupper(Meal supper) {
        this.supper = supper;
    }

    public Calendar getDay() {
        return day;
    }

    public void setDay(Calendar day) {
        this.day = day;
    }
}
