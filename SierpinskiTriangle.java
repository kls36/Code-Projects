/*
 * Written by Kelly Sullivan
 */


import java.awt.*;
import javax.swing.*;

public class SierpinskiTriangle extends Canvas {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        // JFrame for  triangle
        JFrame frame = new JFrame("Sierpinski's Triangle");
        frame.setSize(900, 900);
        SierpinskiTriangle sp = new SierpinskiTriangle();
        frame.add(sp);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        //  base triangle 
        int width = this.getSize().width;
        int height = (int) (Math.sqrt(3) / 2 * width);
        drawTriangle(g, 0, height, width, height, 0);
    }

    private void drawTriangle(Graphics g, int x, int y, int side, int height, int level) {
        // stop recursion at 4 pixels
        if (side < 4) return;

        // draw main triangle
        if (level == 0) {
            g.setColor(Color.BLACK);
            int[] xPoints = {x, x + side, x + side / 2};
            int[] yPoints = {y, y, y - height};
            g.fillPolygon(xPoints, yPoints, 3);
        }

        // draw inside triangle
        g.setColor(Color.WHITE);
        int[] innerXPoints = {x + side / 4, x + 3 * side / 4, x + side / 2};
        int[] innerYPoints = {y - height / 2, y - height / 2, y};
        g.fillPolygon(innerXPoints, innerYPoints, 3);

        // find new sides
        int newSide = side / 2;
        int newHeight = height / 2;

        // draw smaller
        
        // bottom left
        drawTriangle(g, x, y, newSide, newHeight, level + 1);

        // bottom right
        drawTriangle(g, x + newSide, y, newSide, newHeight, level + 1);

        // top
        drawTriangle(g, x + side / 4, y - height / 2, newSide, newHeight, level + 1);
    }
}
