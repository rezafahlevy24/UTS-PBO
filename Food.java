import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int framecounter;
    
    public Food(){
        int random = Greenfoot.getRandomNumber(3);
        setImage(random + ".png");
        GreenfootImage image = getImage();
        image.scale(20,20);
    }
    
    public void act()
    {
        framecounter++;
        if (isTouching(Snake.class)){
            getWorld().removeObject(this);
        } else if (framecounter >= 500){
            getWorld().removeObject(this);
        }
    }
}
