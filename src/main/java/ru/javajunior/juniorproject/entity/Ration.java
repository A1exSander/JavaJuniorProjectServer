package ru.javajunior.juniorproject.entity;

import java.util.Calendar;

public class Ration {
    private Meal breakfast;
    private Meal dinner;
    private Meal supper;
    private Calendar calendar;

    public static class RationBuilder{
        private Meal breakfast;
        private Meal dinner;
        private Meal supper;
        private Calendar calendar;
    }
}
