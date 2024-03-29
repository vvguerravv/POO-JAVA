/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class App {

    public static void main(String[] args) {

        Draw draw = new Draw("Guerra");

        draw.setCanvasSize(800,800);
        draw.setXscale(0,800);
        draw.setYscale(0,800);

        draw.setPenColor(Color.BLUE);

        draw.filledSquare(100,100,50);

        draw.picture(100,100,"DUke.png");

    }

}
