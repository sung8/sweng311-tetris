package models;

import java.awt.Point;
/**
 * T.java:
 * Creates a T shape tetronimo
 *
 * @author Sunghee Choi
 * @version 1.0
 *
 * @see java.awt.Point
 */
public class T extends Tetronimo
{
    public T()
    {
        super.r1.setLocation(0, 0);
        super.r2.setLocation(Tetronimo.SIZE, 0);
        super.r3.setLocation(Tetronimo.SIZE*2, 0);
        super.r4.setLocation(Tetronimo.SIZE, -Tetronimo.SIZE);

        super.add( r1 );
        super.add( r2 );
        super.add( r3 );
        super.add( r4 );
    }

    @Override
    public void rotate()
    {
        super.rotate();

        Point curLoc = super.getLocation();
        super.setLocation(0,0);

        if (super.curRotation % 4 == 2)
        {
            super.r1.setLocation( 0, 0 );
            super.r2.setLocation( 0, Tetronimo.SIZE );
            super.r3.setLocation( 0, Tetronimo.SIZE * 2 );
            super.r4.setLocation(Tetronimo.SIZE, Tetronimo.SIZE);
        } else if (super.curRotation % 4 == 3) {
            super.r1.setLocation(0, 0);
            super.r2.setLocation(Tetronimo.SIZE, 0);
            super.r3.setLocation(Tetronimo.SIZE * 2, 0);
            super.r4.setLocation(Tetronimo.SIZE, Tetronimo.SIZE);
        } else if (super.curRotation % 4 == 0) {
            super.r1.setLocation( Tetronimo.SIZE, 0 );
            super.r2.setLocation( Tetronimo.SIZE, Tetronimo.SIZE );
            super.r3.setLocation( Tetronimo.SIZE, Tetronimo.SIZE * 2 );
            super.r4.setLocation(0, Tetronimo.SIZE);
        } else if (super.curRotation % 4 == 1) {
            super.r1.setLocation(0, 0);
            super.r2.setLocation(Tetronimo.SIZE, 0);
            super.r3.setLocation(Tetronimo.SIZE*2, 0);
            super.r4.setLocation(Tetronimo.SIZE, -Tetronimo.SIZE);
        } else {
            super.r1.setLocation(0, 0);
            super.r2.setLocation(Tetronimo.SIZE, 0);
            super.r3.setLocation(Tetronimo.SIZE*2, 0);
            super.r4.setLocation(Tetronimo.SIZE, -Tetronimo.SIZE);
        }

        super.setLocation( curLoc );
    }

    @Override
    public int getHeight()
    {
        if (this.curRotation % 4 == 2) {
            return Tetronimo.SIZE*3;
        } else if (this.curRotation % 4 == 3) {
            return Tetronimo.SIZE*2;
        } else if (this.curRotation % 4 == 0) {
            return Tetronimo.SIZE*3;
        } else if (this.curRotation % 4 == 1) {
            return Tetronimo.SIZE*2;
        } else {
            return Tetronimo.SIZE*2;
        }
    }

    @Override
    public int getWidth()
    {
        if (this.curRotation % 4 == 2) {
            return Tetronimo.SIZE*2;
        } else if (this.curRotation % 4 == 3) {
            return Tetronimo.SIZE*3;
        } else if (this.curRotation % 4 == 0) {
            return Tetronimo.SIZE*2;
        } else if (this.curRotation % 4 == 1) {
            return Tetronimo.SIZE*3;
        } else {
            return Tetronimo.SIZE*3;
        }
    }
}
