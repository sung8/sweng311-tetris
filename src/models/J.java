package models;

import java.awt.Point;

public class J extends Tetronimo
{
    int h, w;

    public J()
    {
        super.r1.setLocation( Tetronimo.SIZE, 0 );
        super.r2.setLocation( Tetronimo.SIZE, Tetronimo.SIZE );
        super.r3.setLocation( Tetronimo.SIZE, Tetronimo.SIZE * 2 );
        super.r4.setLocation( 0, Tetronimo.SIZE * 2 );

        super.add( r1 );
        super.add( r2 );
        super.add( r3 );
        super.add( r4 );

        h = 3 * Tetronimo.SIZE;
        w = 2 * Tetronimo.SIZE;
    }

    @Override
    public void rotate()
    {
        super.rotate();

        Point curLoc =  super.getLocation();
        super.setLocation(0, 0);
        System.out.println(curRotation);

        if (super.curRotation % 4 == 2) {
            super.r1.setLocation(0, 0);
            super.r2.setLocation(Tetronimo.SIZE, 0);
            super.r3.setLocation(Tetronimo.SIZE*2, 0);
            super.r4.setLocation(0, -Tetronimo.SIZE);
            h = 2 * Tetronimo.SIZE;
            w = 3 * Tetronimo.SIZE;
        } else if (super.curRotation % 4 == 3) {
            super.r1.setLocation( 0, 0 );
            super.r2.setLocation( 0, Tetronimo.SIZE );
            super.r3.setLocation( 0, Tetronimo.SIZE * 2 );
            super.r4.setLocation( Tetronimo.SIZE, 0);
            h = 3 * Tetronimo.SIZE;
            w = 2 * Tetronimo.SIZE;
        } else if (super.curRotation % 4 == 0) {
            super.r1.setLocation(0, 0);
            super.r2.setLocation(Tetronimo.SIZE, 0);
            super.r3.setLocation(Tetronimo.SIZE*2, 0);
            super.r4.setLocation(Tetronimo.SIZE*2, Tetronimo.SIZE);
            h = 2 * Tetronimo.SIZE;
            w = 3 * Tetronimo.SIZE;
        } else if (super.curRotation % 4 == 1 ) {
            super.r1.setLocation( Tetronimo.SIZE, 0 );
            super.r2.setLocation( Tetronimo.SIZE, Tetronimo.SIZE );
            super.r3.setLocation( Tetronimo.SIZE, Tetronimo.SIZE * 2 );
            super.r4.setLocation( 0, Tetronimo.SIZE * 2 );
            h = 3 * Tetronimo.SIZE;
            w = 2 * Tetronimo.SIZE;
        }
        super.setLocation(curLoc);
    }

    @Override
    public int getHeight()
    {
        return h;
    }

    @Override
    public int getWidth()
    {
        return w;
    }

}
