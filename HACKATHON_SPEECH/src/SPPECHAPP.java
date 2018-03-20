import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import javax.speech.recognition.*;
import javax.speech.*;
import com.sun.speech.freetts.*;
import java.io.File;
import java.io.FileReader;


public class SPPECHAPP 
{
	
	
	JFrame a;
	JPanel b;
	JTextArea h;
	JTextArea i;
     Recognizer rec;
	JButton p,q,r;
	JLabel ty,lab1,lab2;
	
	SPPECHAPP(String args)
	{
		speechrecognizer();
		framewindow(args);
		windowFrame();
		button_task();
	}
	
	//new JFRAME and Icon formations
	public void framewindow(String text)
	{
		
		a = new JFrame(text);
		Image icon=Toolkit.getDefaultToolkit().getImage("E:\\SPEACH\\MAIN.jpg");
		a.setIconImage(icon);
		a.setSize(1780,720);
		a.setLayout(new BorderLayout());
		a.setContentPane(new  JLabel(new ImageIcon("E:\\SPEACH\\6.jpg")));
		a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		a.setLocation(1, 1);
		a.setVisible(true);
		a.addMouseMotionListener(new MouseMotionListener() {
		
			@Override
			public void mouseDragged(MouseEvent arg0) {
				a.repaint();
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				a.repaint();
				
			}});
	
	}
	
	Icon re1 = new ImageIcon("E:\\MS PAINT 2.0\\ICON REFRENCE TO MS PAINT\\  (1).png");
	Icon re2 = new ImageIcon("E:\\MS PAINT 2.0\\ICON REFRENCE TO MS PAINT\\  (2).png");
	
	public void button_task()
	{
		p = new JButton(re1);
		q = new JButton(re2);
		lab1 = new JLabel("USER INPUT SPEECH/TEXT");
		lab1.setFont(new Font(Font.SANS_SERIF, 15, 18));
		lab1.setForeground(Color.WHITE);
		lab1.setBounds(190, 180, 400, 50);
		lab2 = new JLabel("USER'S OUTPUT SPEECH/TEXT");
		lab2.setFont(new Font(Font.SANS_SERIF, 15, 18));
		lab2.setForeground(Color.YELLOW);
		lab2.setBounds(520, 450, 400, 50);
		p.setBounds(550,80,70,70);
		q.setBounds(908,325,70,70);
		p.setBackground(new Color(0.0f,0.7f,0.4f,1.0f));
		q.setBackground(new Color(0.0f,0.7f,0.4f,1.0f));
		
		p.setFont(new Font(Font.SERIF, 18, 12));

		
		
		
		
		
		p.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
	
				
				 Voice v;
					VoiceManager t = VoiceManager.getInstance();
					v = t.getVoice("kevin16");
					v.allocate();
					
					v.speak(h.getText());
				
				
			}});
				/*			      
				try {
					codesforTTS(Locale.US);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EngineException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a.repaint();
		*/		
				
		/*	}});*/
		
		/*q.setFont(new Font(Font.SERIF, 18, 12));
		q.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					codesforTTS();
				} catch (IllegalArgumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (EngineException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				a.repaint();
			}});
			
			*/
			
		
		p.setEnabled(true);
		q.setEnabled(true);
		b.add(p);
		b.add(q);
		b.add(lab1);
		b.add(lab2);
	
	}
	
	
	
	
	// EXTERNAL BODY FORMATION
	public void windowFrame()
	{
		b=new JPanel();
		
		b.setVisible(true);
		b.setAutoscrolls(true);
		b.setLayout(null);
		
		
		
		b.setBounds(0, 0, a.getWidth(),a.getHeight());
		Color bg = new Color(10, 10, 10, 0);
		b.setBackground(bg);
		MENU();
		a.add(b);
	}
	
	
	
	

	public void codesforTTS() 
	{
	    /*try
        {
            // set property as Kevin Dictionary
            System.setProperty("freetts.voices",
               "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory"); 
                 
            // Register Engine
            Central.registerEngineCentral
                ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            
            // Create a Synthesizer
            Synthesizer synthesizer =                                         
                Central.createSynthesizer(new SynthesizerModeDesc(op));     
     
            // Allocate synthesizer
            synthesizer.allocate();        
             
            // Resume Synthesizer
            synthesizer.resume();    
             
            // speaks the given text until queue is empty.
            synthesizer.speakPlainText(h.getText(), null);         
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
             
            // Deallocate the Synthesizer.
            synthesizer.deallocate();                                 
        } 
 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
		*/
/*		 Synthesizer synthesizer =Central.createSynthesizer(new SynthesizerModeDesc(op)); */
		 
		
		
	
		
		
	}
	

	public void MENU()
	{
		h=new JTextArea();
		h.setLayout(null);
		h.setVisible(true);
		h.setBounds(65,35,480,150);
		h.setFont(new Font(Font.SANS_SERIF, 5,12));
		h.setEditable(true);
		h.setLineWrap(true);
		h.setBorder(new LineBorder(Color.black));
		h.setText("");
		h.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				
				
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				i.setText(h.getText());
				a.repaint();
				
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				
			}});
	

		label();
		b.add(h);
	}
	
	
	public void label()
	{
		i = new JTextArea();
		i.setLayout(null);
		i.setVisible(true);
		i.setText(h.getText());
		i.setBounds(425,300,480,150);
		i.setBackground(Color.white);
		i.setForeground(Color.GREEN);
		i.setFont(new Font(Font.SANS_SERIF, 5,12));
		i.setBorder(new LineBorder(Color.black));
		b.add(i);
		
	}
	
	
	void speechrecognizer()
	{
		try {
			// Create a recognizer that supports English.
			rec = Central.createRecognizer(
							new EngineModeDesc(Locale.US));
			
			// Start up the recognizer
			rec.allocate();
	 
			// Load the grammar from a file, and enable it
			File file = new File("C:\\Users\\abhimanyu\\eclipse-workspace\\HACKATHON_SPEECH\\zipcity");
			FileReader reader = new FileReader(file);
			RuleGrammar gram = rec.loadJSGF(reader);
			gram.setEnabled(true);
	
			// Add the listener to get results
			rec.addResultListener(new ResultListener() {

				@Override
				public void audioReleased(ResultEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void grammarFinalized(ResultEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void resultAccepted(ResultEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void resultCreated(ResultEvent e) {
				
					Result r = (Result)(e.getSource());
					ResultToken tokens[] = r.getBestTokens();

					for (int i = 0; i < tokens.length; i++)
						System.out.print(tokens[i].getSpokenText() + " ");
					System.out.println();

					// Deallocate the recognizer and exit
					try {
						rec.deallocate();
					} catch (EngineException | EngineStateError e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.exit(0);
					
				}

				@Override
				public void resultRejected(ResultEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void resultUpdated(ResultEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void trainingInfoReleased(ResultEvent arg0) {
					// TODO Auto-generated method stub
					
				}});
	
			// Commit the grammar
			rec.commitChanges();
	
			// Request focus and start listening
			rec.requestFocus();
			rec.resume();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String args[])
	{
		try
		{
			System.gc();
			SwingUtilities.invokeAndWait(new Runnable() {

				@Override
				public void run() {
						
					new SPPECHAPP("SPEACH APP CODES");
					
				}});
		}
		catch(Exception t)
		{
		
		}
	}
}