import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{

    int playerLength = 30;
    int countLength = 0;
    
    public Tail()
    {

        GreenfootImage ekor = new GreenfootImage(18,18);
        ekor.setColor(new Color(96,124,252));
        ekor.fill();
        setImage(ekor);
    }
    
    public void act()
    {
        SnakeGame snakegame = (SnakeGame) getWorld();
        countLength++;
        if (countLength>30 && isTouching(Snake.class))
        {
            snakegame.displayGameOver();
        }
        if(countLength > playerLength){
            getWorld().removeObject(this);
        }

    }
}