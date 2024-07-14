package test;

import entity.Human;
import entity.Chicken;
import entity.Fish;
import entity.Horse;
import entity.Animal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class AnimalsTest {
    public static void main(String[] args) {
        Animal animal = new Chicken();
        
        animal.move(4);
        animal.sleep(5);
        
        animal = new Fish();
        
        animal.move(3);
        
        animal = new Horse();
        
        animal.move(3);
        
        animal = new Human();
        
        animal.move(5);
    }
            
}
