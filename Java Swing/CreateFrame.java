import javax.swing.JFrame;

class CreateFrame{
    public static void main(String[] args){
        // Create a JFrame instance
        JFrame frame = new JFrame();

        // Set the size of the frame
        frame.setSize(550,500);
        
        // Set the title of the frame
        frame.setTitle("Create JFrame Example");
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}