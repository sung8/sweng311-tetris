package controllers;

import models.*;
import views.TetrisBoard;

import java.util.Random;

/**
 * TetrisController.java:
 * Class to hold all of the game logic for tetris
 *
 * @author Professor Rossi
 * @author Sunghee Choi
 *
 * @version 1.0 July 24, 2020
 */
public class TetrisController
{
    private final TetrisBoard TETRIS_BOARD;
    private final int cont = 1;
    private final int randNum = 0;

    /**
     * Constructor to take in a tetris board so the controller and the board can communciate
     *
     * @param tetrisBoard A tetris board instance
     */
    public TetrisController( TetrisBoard tetrisBoard )
    {
        this.TETRIS_BOARD = tetrisBoard;
    }

    /**
     * Randomly chooses the next tetronimo and returns it (INCOMPLETE)
     *
     * @return The next tetronimo to be played
     */
    public Tetronimo getNextTetromino()
    {
        Tetronimo tetronimo;

        Random rn = new Random();
        int randInt = rn.nextInt(7) + 1;

        if (randInt == 1) {
            tetronimo = new StraightLine();
        } else if (randInt == 2) {
            tetronimo = new Square();
        } else if (randInt == 3) {
            tetronimo = new T();
        } else if (randInt == 4) {
            tetronimo = new L();
        } else if (randInt == 5) {
            tetronimo = new J();
        } else if (randInt == 6) {
            tetronimo = new Z();
        } else if (randInt == 7) {
            tetronimo = new S();
        } else {
            tetronimo = new StraightLine();
        }

        tetronimo.setLocation( 40 + (5 * Tetronimo.SIZE), 0 );

        return tetronimo;
    }

    /**
     * Method to determine if the tetronimo has landed (INCOMPLETE)
     *
     * @param tetronimo The tetronimo to evaluate
     * @return True if the tetronimo has landed (on the bottom of the board or another tetronimo), false if it has not
     */
    public boolean tetronimoLanded( Tetronimo tetronimo )
    {
        int nextY = tetronimo.getYLocation() + tetronimo.getHeight() + Tetronimo.SIZE;
        return nextY <= 480;
    }
}
