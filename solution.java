package testing;

	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*; 
	
	class solution extends JFrame { 
	  
	    // JFrame 
	    static JFrame f; 
	  
	    // JButton 
	    static JButton b, b1;
	  
	    // label to display text 
	    static JLabel l; 
	  
	    private ImageIcon image1;
	    private JLabel label1;
	    private ImageIcon image2;
	    private JLabel label2;
	    
	 
	    	setLayout(new FlowLayout());
	    	
	    	image1 = new ImageIcon(getClass().getResource("rubicon1.jpg"));
	    	
	    	label1 = new JLabel(image1);
	    	add(label1);
	    	//---------------------------------------------------------
	    	image2 = new ImageIcon(getClass().getResource("rubicon2.jpg"));
	    	
	    	label2 = new JLabel(image2);
	    	add(label2);
	    	
	    }
	    
	    
	    
	    
	    // main class 
	    public static void main(String[] args) 
	    { 
	    	
	    	
	    	//solution gui = new solution();
	    	//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //	gui.setVisible(true);
	    //	gui.pack();
	    //	gui.setTitle("Definitely not a virus");
	    	
	        // create a new frame to store text field and button 
	        f = new JFrame("DEFINITELY NOT A VIRUS "); 
	  
	        // create a label to display text 
	        l = new JLabel("not a virus"); 
	  
	        // create a new buttons 
	        b = new JButton("CLAIM YOUR PRIZE NOW"); 
	        b1 = new JButton("button2"); 
	   
	        
	  
	        // create a panel to add buttons 
	        JPanel p = new JPanel(); 
	  
	        // add buttons and textfield to panel 
	        p.add(b); 
	        p.add(b1); 
 
	        p.add(l); 
	  
	        // setbackground of panel 
	        p.setBackground(Color.red); 
	        
	  
	        // add panel to frame 
	        f.add(p); 
	  
	        // set the size of frame 
	        f.setSize(3000, 3000); 
	  
	        f.show(); 
	        
	    
	        
	        
	        }
	    
	} 