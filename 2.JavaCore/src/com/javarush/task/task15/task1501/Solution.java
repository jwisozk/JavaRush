package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        private String name;
        public boolean isMovable(){return true;}
        public Clothes getAllowedAction(String name) {return new Clothes(name);}
        public Object getAllowedAction() {return new Clothes();}

        public Clothes(String name) {
            this.name = name;
        }

        public Clothes() {
        }
    }
}
