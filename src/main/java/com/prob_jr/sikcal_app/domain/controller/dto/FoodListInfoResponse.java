package com.prob_jr.sikcal_app.domain.controller.dto;

import com.prob_jr.sikcal_app.domain.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FoodListInfoResponse {

    private Long foodId;
    private String foodName;
    private int carbohydrate;
    private int protein;
    private int fat;
    private int totalKcal;

    public static FoodListInfoResponse from(Food food) {
        return new FoodListInfoResponse(food.getId(),
                food.getFoodName(),
                food.getCarbohydrate(),
                food.getProtein(),
                food.getFat(),
                food.getTotalKcal()
        );
    }
}
