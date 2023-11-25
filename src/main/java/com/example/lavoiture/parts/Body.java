package com.example.lavoiture.parts;

import com.example.lavoiture.measures.Cost;
import com.example.lavoiture.measures.Weight;

public interface IBody {
    public Cost getCost() ;
    public Weight getWeight();
    public BodyTypes getType();
}
