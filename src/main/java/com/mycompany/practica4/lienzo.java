/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4;

import com.mycompany.practica4.MousePosition;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;
import javax.swing.JPanel;
import org.apache.commons.collections.buffer.CircularFifoBuffer;

/**
 *
 * @author Nicolas
 */
public class lienzo extends JPanel {
    
    
    private MousePosition fifo[] = new MousePosition[5];
    private int iter = 0;
    {
        for (int i = 0; i<5; i++){
            fifo[i] = new MousePosition(0,0);
        }
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.BLACK);
        G.drawLine(10,10,100,100);
        
        G.fillOval(fifo[0].getX(), fifo[0].getY(), 10, 10);
        G.fillOval(fifo[1].getX(), fifo[1].getY(), 10, 10);
        G.fillOval(fifo[2].getX(), fifo[2].getY(), 10, 10);
        G.fillOval(fifo[3].getX(), fifo[3].getY(), 10, 10);
        G.fillOval(fifo[4].getX(), fifo[4].getY(), 10, 10);
        
        G.fillOval(200, 200, 10, 10);
    
    }
    public void add(MousePosition a){
        if (iter == 5){iter = 0;}
        fifo[iter] = a;
        iter++;
    }

}
