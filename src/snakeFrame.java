import javax.swing.JFrame;

public class snakeFrame extends JFrame{

    //constructor
    snakeFrame(){
        //initializing panel and adding panel to frame
        //panel is child to frame
        this.add(new panel());
        //to set title to frame
        this.setTitle("Snake Game");

        //ensuring size remain unchanged for uniform user experience
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set size based on the panel
        //pack(): sizes frame so that all its contents are at or above their preferred sizes
        this.pack();

        //frame is initially set to invisible, to make to visible
        this.setVisible(true);

        //spawning the frame in the center of the screen
        this.setLocationRelativeTo(null);

    }
}
