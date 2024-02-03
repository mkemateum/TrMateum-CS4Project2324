/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trmateum.cs4project;

/**
 *
 * @author Kane
 */
public class User {
    private String name;
    private int level;
    private String rank;
    private double HP;
    private final double maxHP;
    
    public User(String n){
        this.name = n;
        this.level = 1;
        this.rank = "Procrastinator";
        this.HP = 50;
        this.maxHP = 50;
    }

    
}
