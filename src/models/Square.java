package models;

import java.awt.Point;

public class Square extends Tetronimo
{
    public Square()
    {
        super.r1.setLocation(0, 0);
        super.r2.setLocation(Tetronimo.SIZE, 0);
        super.r3.setLocation(Tetronimo.SIZE, Tetronimo.SIZE);
        super.r4.setLocation(0, Tetronimo.SIZE);

        super.add( r1 );
        super.add( r2 );
        super.add( r3 );
        super.add( r4 );
    }

    @Override
    public int getHeight()
    {
        return Tetronimo.SIZE*2;
    }

    @Override
    public int getWidth()
    {
        return Tetronimo.SIZE*2;
    }

}
