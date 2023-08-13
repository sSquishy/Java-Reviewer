import javax.swing.JFrame;

class CreateFrame{
    public static void main(String[] args){
        // Create a JFrame instance
        JFrame frame = new JFrame();

        frame.setSize(550,500);
        
        frame.setTitle("Create JFrame Example");
        
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
}