package ru.ke3ran.metod2.lab12;

import ru.ke3ran.metod2.lab12.shape.Rectangle;
import ru.ke3ran.metod2.lab12.shape.Shape;
import ru.ke3ran.metod2.lab12.shape.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// App class
class Lab12 extends JFrame {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    String backgroundImagePath;
    String animationImagesPath = "/home/yakaska/IdeaProjects/JavaPractice/src/ru/yakaska/metod2/lab12/frames";
    int method;

    // Init
    public Lab12() {
        super("Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        Button btn = new Button("Start animation");
        btn.setSize(200, 100);
        btn.setLocation(0, 0);
        btn.addActionListener(event -> {
            method = 1;
            setTitle("Animation");
            setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
            setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
        });
        add(btn);
    }

    void setBackgroundImagePath(String path) {
        this.backgroundImagePath = path;
    }

    void setAnimationImagesPath(String path) {
        this.animationImagesPath = path;
    }

    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.backgroundImagePath);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0:
                List<Shape> shapes = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    int choice = (int) (Math.random() * 4);
                    switch (choice) {
                        case 1:
                            shapes.add(new Circle((long) (Math.random() * 0x1000000), (int) (Math.random() * WINDOW_WIDTH), (int) (Math.random() * WINDOW_WIDTH)));
                            break;
                        case 2:
                            shapes.add(new Line((long) (Math.random() * 0x1000000), (int) (Math.random() * WINDOW_WIDTH), (int) (Math.random() * WINDOW_WIDTH)));
                            break;
                        case 3:
                            shapes.add(new Oval((long) (Math.random() * 0x1000000), (int) (Math.random() * WINDOW_WIDTH), (int) (Math.random() * WINDOW_WIDTH)));
                            break;
                        case 4:
                            shapes.add(new Rectangle((long) (Math.random() * 0x1000000), (int) (Math.random() * WINDOW_WIDTH), (int) (Math.random() * WINDOW_WIDTH)));
                            break;
                    }
                }
                randomShapesPaint(shapes, g);
                break;

            case 1:
                animate(this.animationImagesPath, g);

                break;

            default:
                break;
        }
    }

    void randomShapesPaint(List<Shape> shapes, Graphics2D g) {
        for (Shape shape : shapes) {
            g.setColor(new Color((int) shape.getColor()));
            int x = shape.getX();
            int y = shape.getY();

            // Oval
            if (shape instanceof Oval) {
                g.fillOval(x, y, (int) (Math.random() * 200), (int) (Math.random() * 200));
            }

            // Rect
            else if (shape instanceof Rectangle) {
                g.fillRect(x, y, (int) (Math.random() * 200), (int) (Math.random() * 200));
            }

            // Line
            else if (shape instanceof Line) {
                g.drawLine(x, y, (int) (Math.random() * WINDOW_HEIGHT), (int) (Math.random() * WINDOW_HEIGHT));
            }
            // Circle
            else if (shape instanceof Circle) {
                g.fillOval(x, y, 100, 100);
            }
        }
    }

    void animate(String framesPath, Graphics2D g) {
        File[] dir = new File(framesPath).listFiles();
        assert dir != null;
        Arrays.sort(dir);
        for (File file : dir) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Start app
    public static void main(String[] args) {
        Lab12 app = new Lab12();
        if (args.length == 1) {
            app.setBackgroundImagePath(args[0]);
        } else if (args.length == 2) {
            app.setBackgroundImagePath(args[0]);
            app.setAnimationImagesPath(args[1]);
        } else {
            System.out.println("[!] Background image path is empty");
        }
    }
}