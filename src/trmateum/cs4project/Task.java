/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trmateum.cs4project;

/**
 *
 * @author Kane
 */
    public class Task {
        private String name;
        private String desc;
        private int difficulty;
        private int priority;
        protected boolean befDeadline;
    
        public Task(String n, String s, int d, int p){
            this.name = n;
            this.desc = s;
            this.difficulty = d;
            this.priority = p;
            this.befDeadline = true;
        }   
    public void accomplish(boolean befDeadline){
        if(befDeadline){
            System.out.println("You have accomplished this Task!");
        }
        else{
            System.out.println("You have accomplished this Task, but past the deadline. You can do better next time!");
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the difficulty
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
