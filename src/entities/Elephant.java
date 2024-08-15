package entities;

import enums.Foods;

import java.util.function.Predicate;

public class Elephant extends Animal{
    @Override
    public void setFoods(String[] foods) {
        foods= new String[]{Foods.HAY.name(), Foods.FRUIT.name()};
        for(String food:foods) {
            System.out.println("Elephant can eat:"+food);
        }
    }

    @Override
    public int getLifeExpectancy() {
        return 36;
    }
    public int bath() {
        if (checkHealth()) {
            setHealth(getHealth()+5);
        }
        return 10;
    }

    @Override
    public void treat() {
       if(bath()<10) System.out.println(getHealth());
       else System.out.println(10);
    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }
}
