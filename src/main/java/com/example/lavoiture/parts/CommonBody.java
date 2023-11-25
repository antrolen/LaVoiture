package com.example.lavoiture.parts;

import com.example.lavoiture.measures.Cost;
import com.example.lavoiture.measures.Weight;

public class Body implements IBody{
    Cost cost;
    Weight weight;
    BodyTypes type;

    public Body(Cost cost, Weight weight, BodyTypes type) {
        this.cost = cost;
        this.weight = weight;
        this.type = type;
    }

    public Body() {
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public BodyTypes getType() {
        return type;
    }

    public void setType(BodyTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Body{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
