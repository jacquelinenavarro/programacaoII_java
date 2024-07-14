package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public abstract class Animal implements Moveable {
    private int age;  
    private int nFt;
    protected String pattern;
    
    public void sleep(int time){
        for (int i = 0; i < time; i++){
            System.out.print("zz");
        }
        System.out.println();
    }

    @Override
    public void move(int nSteps) {
        for (int i = 0; i < nSteps; i++){
            System.out.println(pattern + " " + pattern);
            if (nFt == 4) {
                System.out.println(pattern + " " + pattern);
            }   
            System.out.println();
        }
    }
    
    

    public int getnFt() {
        return nFt;
    }

    public void setnFt(int nFt) {
        if (nFt == 2 || nFt == 4) {
            this.nFt = nFt;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }
    }
    
    
}
