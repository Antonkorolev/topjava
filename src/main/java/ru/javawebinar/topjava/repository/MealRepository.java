package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.util.List;

public interface MealRepository {

    Meal save(Meal meal);

    boolean  delete(int mealId);

    Meal get(int mealId);

    List<Meal> getAll();
}
