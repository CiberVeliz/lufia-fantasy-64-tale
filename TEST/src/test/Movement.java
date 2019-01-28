/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ozmarescobar
 */
public class Movement
{
    //these constants are made for movement limits
    final float GRAVITY = 9.8f;
    final int ACCELERATION = 2;
    final int DISACCELERATION = -2;
    final int IDLE_ACCELERATION = 0;
    
    final int START_SPEED = 0;
    final int TOP_SPEED = 6;//to be polished
    
    int currentPosX;
    int currentPosY;
    
    int currentSpeedX;
    int currentSpeedY;
    
    int currentAccelX;
    int currentAccelY;

    public Movement()
    {
        this.currentPosX = 0;
        this.currentPosY = 0;
        
        this.currentSpeedX = 0;
        this.currentSpeedY = 0;
        
        this.currentAccelX = 0;
        this.currentAccelY = 0;
    }
    /**
     * Initializes the movement component of an element that is capable of moving.
     * @param currentPosX used for spawning position in X
     * @param currentPosY used for spawning position in Y
     */
    public Movement(int currentPosX, int currentPosY)
    {
        this.currentPosX = validatePosX(currentPosX);
        this.currentPosY = validatePosY(currentPosY);
        
        this.currentSpeedX = 0;
        this.currentSpeedY = 0;
        this.currentAccelX = 0;
        this.currentAccelY = 0;
    }

    /**
     * Initializes the movement component of an element that is capable of moving.
     * @param currentPosX used for spawning position in X
     * @param currentPosY used for spawning position in Y
     * @param currentSpeedX used for starting speed in X
     * @param currentSpeedY used for starting speed in Y
     */
    public Movement(int currentPosX, int currentPosY, int currentSpeedX, int currentSpeedY)
    {
        this.currentPosX = validatePosX(currentPosX);
        this.currentPosY = validatePosY(currentPosY);
        
        this.currentSpeedX = currentSpeedX;
        this.currentSpeedY = currentSpeedY;
        
        this.currentAccelX = 0;
        this.currentAccelY = 0;
    }

    /**
     * Initializes the movement component of an element that is capable of moving.
     * @param currentPosX used for spawning position in X
     * @param currentPosY used for spawning position in Y
     * @param currentSpeedX used for spawning speed in X
     * @param currentSpeedY used for spawning speed in Y
     * @param currentAccelX used for spawning acceleration in X
     * @param currentAccelY used for spawning acceleration in Y
     */
    public Movement
        (
            int currentPosX, int currentPosY,
            int currentSpeedX, int currentSpeedY,
            int currentAccelX, int currentAccelY
        )
    {
        this.currentPosX = validatePosX(currentPosX);
        this.currentPosY = validatePosY(currentPosY);
        
        this.currentSpeedX = currentSpeedX;
        this.currentSpeedY = currentSpeedY;
        
        this.currentAccelX = currentAccelX;
        this.currentAccelY = currentAccelY;
    }
    
    private int validatePosX(int posX)//TODO collisions, when done, set speeds and accelerations to 0
    {
        if(posX < Frame.LEFT_CONSTRAINT) return Frame.LEFT_CONSTRAINT;
        if(posX > Frame.RIGHT_CONSTRAINT) return Frame.RIGHT_CONSTRAINT;
        return posX;
        
    }
    
    private int validatePosY(int posY)//TODO collision, when done, set speeds and accelerations to 0
    {
        if(posY < Frame.TOP_CONSTRAINT) return Frame.TOP_CONSTRAINT;
        if(posY > Frame.BOTTOM_CONSTRAINT) return Frame.BOTTOM_CONSTRAINT;
        return posY;
    }
    
    public int getCurrentPosX()
    {
        return currentPosX;
    }

    public void setCurrentPosX(int currentPosX)
    {
        this.currentPosX = currentPosX;
    }
    
    public void givePosX(int amount)
    {
        if(amount == 0) return;
        this.currentPosX = validatePosX(currentPosX + amount);
    }

    public int getCurrentPosY()
    {
        return currentPosY;
    }

    public void setCurrentPosY(int currentPosY)
    {
        this.currentPosY = currentPosY;
    }
    
    public void givePosY(int amount)
    {
        if(amount == 0) return;
        this.currentPosY = validatePosY(currentPosY + amount);
    }

    public int getCurrentSpeedX()
    {
        return currentSpeedX;
    }

    public void setCurrentSpeedX(int currentSpeedX)
    {
        this.currentSpeedX = currentSpeedX;
    }
    
    public void giveSpeedX(int amount)
    {
        this.currentSpeedX += amount;
    }

    public int getCurrentSpeedY()
    {
        return currentSpeedY;
    }

    public void setCurrentSpeedY(int currentSpeedY)
    {
        this.currentSpeedY = currentSpeedY;
    }
    
    public void giveSpeedY(int amount)
    {
        this.currentSpeedY += amount;
    }

    public int getCurrentAccelX()
    {
        return currentAccelX;
    }

    public void setCurrentAccelX(int currentAccelX)
    {
        this.currentAccelX = currentAccelX;
    }
    
    public void giveAccelX(int amount)
    {
        this.currentAccelX += amount;
    }

    public int getCurrentAccelY()
    {
        return currentAccelY;
    }

    public void setCurrentAccelY(int currentAccelY)
    {
        this.currentAccelY = currentAccelY;
    }
    
    public void giveAccelY(int amount)
    {
        this.currentAccelY += amount;
    }
    
    public void moveDown()
    {
        if(getCurrentSpeedY() > TOP_SPEED)//faster than expected
        {
            setCurrentAccelY(DISACCELERATION);
            giveSpeedY(getCurrentAccelY());
            if(getCurrentSpeedY() < TOP_SPEED) setCurrentSpeedY(TOP_SPEED);
            
        }
        else if(getCurrentSpeedY() < TOP_SPEED)//not reached yet top speed
        {
            setCurrentAccelY(ACCELERATION);
            giveSpeedY(getCurrentAccelY());
            if(getCurrentSpeedY() > TOP_SPEED) setCurrentSpeedY(TOP_SPEED);
        }
        else
        {
            setCurrentAccelY(IDLE_ACCELERATION);
        }
        givePosY(getCurrentSpeedY());
    }
    
    public void moveUp()
    {
        if(getCurrentSpeedY() < -TOP_SPEED)//faster than expected
        {
            setCurrentAccelY(-DISACCELERATION);
            giveSpeedY(getCurrentAccelY());
            if(getCurrentSpeedY() > -TOP_SPEED) setCurrentSpeedY(-TOP_SPEED);
            
        }
        else if(getCurrentSpeedY() > -TOP_SPEED)//not reached yet top speed
        {
            setCurrentAccelY(-ACCELERATION);
            giveSpeedY(getCurrentAccelY());
            if(getCurrentSpeedY() < -TOP_SPEED) setCurrentSpeedY(-TOP_SPEED);
        }
        else
        {
            setCurrentAccelY(IDLE_ACCELERATION);
        }
        givePosY(getCurrentSpeedY());
    }
    
    public void moveRight()
    {
        if(getCurrentSpeedX() > TOP_SPEED)//faster than expected
        {
            setCurrentAccelX(DISACCELERATION);
            giveSpeedX(getCurrentAccelX());
            if(getCurrentSpeedX() < TOP_SPEED) setCurrentSpeedX(TOP_SPEED);
            
        }
        else if(getCurrentSpeedX() < TOP_SPEED)//not reached yet top speed
        {
            setCurrentAccelX(ACCELERATION);
            giveSpeedX(getCurrentAccelX());
            if(getCurrentSpeedX() > TOP_SPEED) setCurrentSpeedX(TOP_SPEED);
        }
        else
        {
            setCurrentAccelX(IDLE_ACCELERATION);
        }
        givePosX(getCurrentSpeedX());
    }
    
    public void moveLeft()
    {
        if(getCurrentSpeedX() < -TOP_SPEED)//faster than expected
        {
            setCurrentAccelX(-DISACCELERATION);
            giveSpeedX(getCurrentAccelX());
            if(getCurrentSpeedX() > -TOP_SPEED) setCurrentSpeedX(-TOP_SPEED);
            
        }
        else if(getCurrentSpeedX() > -TOP_SPEED)//not reached yet top speed
        {
            setCurrentAccelX(-ACCELERATION);
            giveSpeedX(getCurrentAccelX());
            if(getCurrentSpeedX() < -TOP_SPEED) setCurrentSpeedX(-TOP_SPEED);
        }
        else
        {
            setCurrentAccelX(IDLE_ACCELERATION);
        }
        givePosX(getCurrentSpeedX());
    }
    
    public void stop()
    {
        if(getCurrentSpeedX() > 0)//faster than expected
        {
            setCurrentAccelX(DISACCELERATION);
            giveSpeedX(getCurrentAccelX());
            if(getCurrentSpeedX() < 0) setCurrentSpeedX(0);
            
        }
        else if(getCurrentSpeedX() < 0)//not reached yet top speed
        {
            setCurrentAccelX(ACCELERATION);
            giveSpeedX(getCurrentAccelX());
            if(getCurrentSpeedX() > 0) setCurrentSpeedX(0);
        }
        else
        {
            setCurrentAccelX(IDLE_ACCELERATION);
        }
        givePosX(getCurrentSpeedX());
    }
    
}
