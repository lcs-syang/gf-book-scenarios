import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * These can be used anywhere in the class below
     */
    //Will keep track of whether a key was just pressed
    private boolean keyAlreadyDown;
    //Will contain the key and sound file that this instance of the class wil play
    private String key;
    private String sound;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile)
    {
        // No key has been pressed
        keyAlreadyDown = false;
        
        //Set the instance variable using the parameters
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // Amimate the piano key being pressed
        if(Greenfoot.isKeyDown(key) && keyAlreadyDown == false)
        {
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        
        //Stop showing the key being pressed
        //Condition 1 - the key was down the last time act() fired
        //Condition 2- the "g" has been released no longer being pressed
        if ( keyAlreadyDown == true && Greenfoot.isKeyDown(key) == false)
        {
            setImage("white-key.png");
            keyAlreadyDown = false;
        }
        
    }
    
    /**
     * Play the note of this key.
     */
    public void play()
    {
        // Key is up
        Greenfoot.playSound(sound +".wav");
        keyAlreadyDown = false;
    }
}

