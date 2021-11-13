package com.app.RestaurantApp.drinks.dto;

import com.app.RestaurantApp.category.dto.CategoryDTO;
import com.app.RestaurantApp.drinks.Drink;
import com.app.RestaurantApp.item.dto.ItemDTO;

public class DrinkDTO extends ItemDTO {

    private double volume;

    public DrinkDTO() { }

    public DrinkDTO(Long id, String name, Double cost, String description, String image, CategoryDTO categoryDTO, double volume) {
        super(id, name, cost, description, image, categoryDTO);
        this.volume = volume;
    }

    public DrinkDTO(Drink drink) {
        super(drink.getId(), drink.getName(), drink.getCost(), drink.getDescription(), drink.getImage(),
                new CategoryDTO(drink.getCategory()));
        this.volume = drink.getVolume();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
