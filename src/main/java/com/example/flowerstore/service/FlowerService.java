package com.example.flowerstore.service;

import com.example.flowerstore.items.Flower;
import com.example.flowerstore.items.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll(); // поверне всі елементи з бази даних
    }

    @PostMapping
    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
