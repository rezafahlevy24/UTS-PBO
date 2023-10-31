import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    int speed = 3;
    int count = 0;
    
    public Snake(){
        GreenfootImage image = getImage();
        image.scale(23,23);
        
    }
    public void act()
    {
        SnakeGame snakegame = (SnakeGame) getWorld();
        move(speed);
        control();
        extend();
        eatFood();
        if (isAtEdge()){
            snakegame.displayGameOver();
        }
    }
    
    public void control(){
        if (Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("up")){
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
    }
    
    public void extend(){
        count++;
        getWorld().addObject(new Tail(), getX(), getY());
        SnakeGame snakegame = (SnakeGame) getWorld();
        snakegame.tail.playerLength=30;
    }
    
    public void eatFood(){
        if(isTouching(Food.class)){
            SnakeGame snakegame = (SnakeGame) getWorld();
            snakegame.score.addScore();
            snakegame.addFood();
            
        }
    }
    

}
