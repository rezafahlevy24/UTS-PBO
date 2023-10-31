import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame extends World
{  
    int framecounter;
    Score score = new Score();
    Tail tail = new Tail();
    Snake snake = new Snake();
    
        public int getRandomNumber(int start,int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    public SnakeGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        Snake snake = new Snake();
        setPaintOrder(Snake.class);
        addObject(snake, getWidth() / 2, getHeight() / 2);
        addObject(score,61,60);
        score.setLocation(71,37);
        score.setLocation(67,34);
        addFood();
    }
    
    public void act()
    {
        framecounter++;
        if(framecounter >= 500)
        {
            addFood();
        }
    }
    
    public void addFood(){
        addObject(new Food(), getRandomNumber(50,550), getRandomNumber(50,550));
        framecounter = 0;
    }
    
    public void displayGameOver(){
        GameOver gameover = new GameOver();
        setPaintOrder(GameOver.class);
        addObject(gameover, 300, 300);
        Greenfoot.stop();
    }
}
