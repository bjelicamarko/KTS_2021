package com.app.RestaurantApp.food;

import com.app.RestaurantApp.food.FoodService;
import com.app.RestaurantApp.food.dto.FoodDTO;
import com.app.RestaurantApp.food.dto.FoodSearchDTO;
import com.app.RestaurantApp.food.dto.FoodWithPriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<FoodDTO> findOne(@PathVariable Long id) {
//        Food food = foodService.findOne(id);
//        return new ResponseEntity<>(new FoodDTO(food), HttpStatus.CREATED);
//    }
//
//    @PostMapping(consumes = "application/json")
//    public ResponseEntity<FoodDTO> saveFood(@RequestBody FoodDTO foodDTO) {
//        Food food = foodService.saveFood(foodDTO);
//        return new ResponseEntity<>(new FoodDTO(food), HttpStatus.CREATED);
//    }
//
//    @PutMapping(consumes = "application/json")
//    public ResponseEntity<FoodDTO> updateFood(@RequestBody FoodDTO foodDTO) {
//
//        Food food = foodService.findOne(foodDTO.getId());
//
//        if (food == null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        food = foodService.saveFood(foodDTO);
//        return new ResponseEntity<>(new FoodDTO(food), HttpStatus.CREATED);
//    }

    @GetMapping(consumes = "application/json")
    public ResponseEntity<List<FoodWithPriceDTO>> getFoodWtihPrice(@RequestBody FoodSearchDTO foodSearchDTO, Pageable pageable) {

        List<FoodWithPriceDTO> foodsDTO = foodService.getFoodWithPrice(foodSearchDTO, pageable);

        return new ResponseEntity<>(foodsDTO, HttpStatus.OK);
    }
}