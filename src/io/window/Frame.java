package io.window;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(Dimension dimension) {
        super();
        this.setSize(dimension);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
