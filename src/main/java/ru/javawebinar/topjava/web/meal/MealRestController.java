package ru.javawebinar.topjava.web.meal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.service.MealService;
import ru.javawebinar.topjava.to.MealTo;
import ru.javawebinar.topjava.util.MealsUtil;

import java.util.Collection;
import java.util.List;

@Controller
public class MealRestController {

    @Autowired
    private MealService service;

    public MealRestController(MealService service) {
        this.service = service;
    }

    public List<MealTo> getAll(){
        return service.getAll();
    }

    public Meal create(Meal meal){
        return service.create(meal);
    }

    public MealTo get(int id){
        return service.get(id);
    }

    public void update(Meal meal){
        service.update(meal);
    }

    public void delete(int id){
        service.delete(id);
    }

}