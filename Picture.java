/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person body;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {

        
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(-120);
        sun.moveVertical(-30);
        sun.changeSize(300);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(-115);
        sun.moveVertical(-25);
        sun.changeSize(290);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(-110);
        sun.moveVertical(-20);
        sun.changeSize(280);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(-105);
        sun.moveVertical(-15);
        sun.changeSize(270);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(-100);
        sun.moveVertical(-10);
        sun.changeSize(260);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(-95);
        sun.moveVertical(-5);
        sun.changeSize(250);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(-90);
        sun.moveVertical(0);
        sun.changeSize(240);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(-85);
        sun.moveVertical(5);
        sun.changeSize(230);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("black");
        sun.moveHorizontal(-80);
        sun.moveVertical(10);
        sun.changeSize(220);
        sun.makeVisible();
        
        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(-75);
        sun.moveVertical(15);
        sun.changeSize(210);
        sun.makeVisible();
        
        body = new Person();
        body.changeColor("yellow");
        body.moveHorizontal(-20);
        body.moveVertical(0);
        body.changeSize(-100, -100);
        body.makeVisible();
    

        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
