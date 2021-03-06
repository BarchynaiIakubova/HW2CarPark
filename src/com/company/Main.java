package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final String WRITE_PATH = "./Car Park.json";

    public static void main(String[] args) {
        CarPark[] carPark = {
                new CarPark(1, "Renault Magnum", "", State.BASE),
                new CarPark(2, "Volvo FH12    ", "", State.BASE),
                new CarPark(3, "DAF FX        ", "", State.REPAIR),
                new CarPark(4, "DAF FX        ", "", State.REPAIR),
                };

//        CarPark[] carPark = {
//                CarPark.methodOfCar(1, "Renault Magnum", "", State.BASE),
//                CarPark.methodOfCar(2, "Volvo FH12", "", State.BASE),
//                CarPark.methodOfCar(3, "DAF FX", "", State.REPAIR),
//
//        };
        String json = GSON.toJson(carPark);
        write(json);
        System.out.println("#  | Bus            | Driver     | State  ");
        System.out.println("---+----------------+------------+--------------");
        System.out.println(carPark[0]);
        System.out.println(carPark[1]);
        System.out.println(carPark[2]);

    }

    private static void write(String object) {
        try (FileWriter fileWriter = new FileWriter(WRITE_PATH)) {
            fileWriter.write(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
