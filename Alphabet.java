package Alphabet;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Alphabet {

    public static void main(String[] args){
    	
    JFrame frame=new JFrame();
    frame.setSize(400,550); //size in pixle
    frame.setTitle("Teaching Alphabet for Children");
    frame.setVisible(true);
    
    ImageIcon icon = new ImageIcon("E:\\Java\\Project\\Program\\src\\Alphabet\\a.jpg");
	frame.setIconImage(icon.getImage());
    
    JPanel panel=new JPanel();
    panel.setLayout(new FlowLayout());
    panel.setBackground(Color.pink);
   
    JLabel label=new JLabel("Hi Dear",SwingConstants.RIGHT);
    JTextField text=new JTextField("Enter Your Name Here",15);
    text.setBackground(Color.pink);
    text.setForeground(Color.white);
    
    JLabel label1= new JLabel("This Program Will help You Learn English Alphabet");
    label.setFont(new Font("Dialog",Font.BOLD,15));
    label.setForeground(Color.white);
    label1.setFont(new Font("Dialog",Font.BOLD,15));
    label1.setForeground(Color.white);

    ImageIcon pic = new ImageIcon ("E:\\Java\\Project\\Program\\Src\\Alphabet\\ax.jpg");
    JLabel picture = new JLabel (pic, SwingConstants.CENTER);
    
    final JButton Song = new JButton("                     ABCs Song                 ");
    final JButton Stop = new JButton("          Stop          ");
    final JButton A = new JButton("A");
    final JButton B = new JButton("B");
    final JButton C = new JButton("C");
    final JButton D = new JButton("D ");
    final JButton E = new JButton("E");
    final JButton F = new JButton(" F");
    final JButton G = new JButton("G ");
    final JButton H = new JButton("H");
    final JButton I = new JButton("I");
    final JButton J = new JButton("J ");
    final JButton K = new JButton("K");
    final JButton L = new JButton("L");
    final JButton M = new JButton(" M");
    final JButton N = new JButton("N");
    final JButton O = new JButton("O");
    final JButton P = new JButton("P");
    final JButton Q = new JButton("Q");
    final JButton R = new JButton("R");
    final JButton S = new JButton("S");
    final JButton T = new JButton("T ");
    final JButton U = new JButton("U");
    final JButton V = new JButton("V");
    final JButton W = new JButton("W");
    final JButton X = new JButton("X");
    final JButton Y = new JButton("Y");
    final JButton Z = new JButton("Z");
    final JButton Apple=new JButton(" Apple");
    final JButton Book=new JButton("Book ");
    final JButton Cat=new JButton("  Cat   ");
    final JButton Dog=new JButton("   Dog  ");
    final JButton Egg=new JButton("  Egg  ");
    final JButton Fish=new JButton("  Fish  ");
    final JButton Gold=new JButton("  Gold  ");
    final JButton Hand=new JButton(" Hand  ");
    final JButton Iran=new JButton("   Iran ");
    final JButton Jungle=new JButton("Jungle");
    final JButton Kick=new JButton(" Kick ");
    final JButton Lamp=new JButton("Lamp ");
    final JButton Map=new JButton(" Map  ");
    final JButton Nation=new JButton("Nation ");
    final JButton Onion=new JButton("Onion");
    final JButton Persian=new JButton("Persian");
    final JButton Quick=new JButton(" Quick");
    final JButton Red=new JButton("  Red  ");
    final JButton Sell=new JButton("  Sell  ");
    final JButton Tall=new JButton("  Tall  ");
    final JButton Union=new JButton("Union   ");
    final JButton Vanilla=new JButton("Vanilla");
    final JButton Wall=new JButton("Wall");
    final JButton Xenon=new JButton("Xenon ");
    final JButton Year=new JButton("Year");
    final JButton Zero=new JButton("Zero");
    
    
    
    ActionListener Sounds = new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
        	
if(e.getSource() == Song){   		
	File ABCsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\ABCs.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(ABCsound);
	Clip clip = AudioSystem.getClip();
	clip.open(audioInputStream);
	clip.start();
	if(e.getSource() == Stop)
	clip.stop();
} 
catch(Exception ex){}
}
  	
if(e.getSource() == A){   		
	File Asound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\A.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Asound);
	Clip clip = AudioSystem.getClip();
	clip.open(audioInputStream);
	clip.start();
} 
catch(Exception ex){}
}   

if(e.getSource() == B){    		
	File Bsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\B.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Bsound);
	Clip clip = AudioSystem.getClip();
	clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){}
}
	
if(e.getSource() == C){
    File Csound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\C.wav");
    try{
    AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Csound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == D){
    File Dsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\D.wav");
    try{
    AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Dsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == E){
    File Esound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\E.wav");
    try{
    AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Esound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == F){
    File Fsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\F.wav");
    try{
    AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Fsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == G){
	File Gsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\G.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Gsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == H){
	File Hsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\H.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Hsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == I){
	File Isound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\I.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Isound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == J){
	File Jsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\J.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Jsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == K){
	File Ksound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\K.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Ksound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == L){
	File Lsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\L.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Lsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == M){
	File Msound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\M.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Msound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == N){
	File Nsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\N.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Nsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == O){
	File Osound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\O.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Osound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == P){
	File Psound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\P.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Psound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Q){
	File Qsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Q.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Qsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == R){
	File Rsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\R.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Rsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == S){
	File Ssound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\S.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Ssound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == T){
	File Tsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\T.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Tsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == U){
	File Usound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\U.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Usound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == V){
	File Vsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\V.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Vsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == W){
	File Wsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\W.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Wsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == X){
	File Xsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\X.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Xsound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Y){
	File Ysound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Y.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Ysound);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Z){
	File Zsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Z.wav");
	try{
	AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Zsound);
	Clip clip = AudioSystem.getClip();
	clip.open(audioInputStream);
	clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Apple){	
File Applesound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Apple.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Applesound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Book){
File Booksound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Book.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Booksound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Cat){
File Catsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Cat.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Catsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Dog){
File Dogsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Dog.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Dogsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Egg){
File Eggsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Egg.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Eggsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Fish){
File Fishsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Fish.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Fishsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Gold){
File Goldsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Gold.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Goldsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Hand){
File Handsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Hand.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Handsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Iran){
File Iransound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Iran.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Iransound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Jungle){
File Junglesound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Jungle.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Junglesound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Kick){
File Kicksound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Kick.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Kicksound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Lamp){
File Lampsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Lamp.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Lampsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Map){
File Mapsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Map.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Mapsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Nation){
File Nationsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Nation.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Nationsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Onion){
File Onionsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Onion.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Onionsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Persian){
File Persiansound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Persian.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Persiansound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Quick){
File Quciksound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Quick.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Quciksound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Red){
File Redsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Red.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Redsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Sell){
File Sellsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Sell.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Sellsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Tall){
File Tallsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Tall.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Tallsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Union){
File Unionsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Union.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Unionsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Vanilla){
File Vanillasound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Vanilla.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Vanillasound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Wall){
File Wallsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Wall.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Wallsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Xenon){
File Xenonsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Xenon.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Xenonsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Year){
File Yearsound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Year.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Yearsound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

if(e.getSource() == Zero){
File Zerosound = new File("E:\\Java\\Project\\Program\\Src\\Alphabet\\Zero.wav");
try{
AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(Zerosound);
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
} 
catch(Exception ex){   }
}

  }
};
    
    Song.addActionListener(Sounds);
    Stop.addActionListener(Sounds);
    
    A.setBackground(Color.red);
    A.setForeground(Color.yellow);
    A.addActionListener(Sounds);
    Apple.addActionListener(Sounds);
  
    B.setBackground(Color.green);
    B.setForeground(Color.white);
    B.addActionListener(Sounds);
    Book.addActionListener(Sounds);
 
    C.setBackground(Color.blue);
    C.setForeground(Color.white);
    C.addActionListener(Sounds);
    Cat.addActionListener(Sounds);
   
    D.setBackground(Color.white);
    D.setForeground(Color.black);
    D.addActionListener(Sounds);
    Dog.addActionListener(Sounds);
   
    E.setBackground(Color.darkGray);
    E.setForeground(Color.white);
    E.addActionListener(Sounds);
    Egg.addActionListener(Sounds);
    
    F.setBackground(Color.white);
    F.setForeground(Color.black);
    F.addActionListener(Sounds);
    Fish.addActionListener(Sounds);
    
    G.setBackground(Color.cyan);
    G.setForeground(Color.white);
    G.addActionListener(Sounds);
    Gold.addActionListener(Sounds);
    
    H.setBackground(Color.yellow);
    H.setForeground(Color.white);
    H.addActionListener(Sounds);
    Hand.addActionListener(Sounds);
   
    I.setBackground(Color.pink);
    I.setForeground(Color.white);
    I.addActionListener(Sounds);
    Iran.addActionListener(Sounds);
   
    J.setBackground(Color.magenta);
    J.setForeground(Color.white);
    J.addActionListener(Sounds);
    Jungle.addActionListener(Sounds);
    
    K.setBackground(Color.lightGray);
    K.setForeground(Color.white);
    K.addActionListener(Sounds);
    Kick.addActionListener(Sounds);
    
    L.setBackground(Color.orange);
    L.setForeground(Color.white);
    L.addActionListener(Sounds);
    Lamp.addActionListener(Sounds);
    
    M.setBackground(Color.gray );
    M.setForeground(Color.white);
    M.addActionListener(Sounds);
    Map.addActionListener(Sounds);
    
    N.setBackground(Color.red);
    N.setForeground(Color.white);
    N.addActionListener(Sounds);
    Nation.addActionListener(Sounds);
    
    O.setBackground(Color.blue);
    O.setForeground(Color.white);
    O.addActionListener(Sounds);
    Onion.addActionListener(Sounds);
    
    P.setBackground(Color.green);
    P.setForeground(Color.white);
    P.addActionListener(Sounds);
    Persian.addActionListener(Sounds);
    
    Q.setBackground(Color.cyan);
    Q.setForeground(Color.white);
    Q.addActionListener(Sounds);
    Quick.addActionListener(Sounds);

    R.setBackground(Color.darkGray);
    R.setForeground(Color.white);
    R.addActionListener(Sounds);
    Red.addActionListener(Sounds);
    
    S.setBackground(Color.orange);
    S.setForeground(Color.white);
    S.addActionListener(Sounds);
    Sell.addActionListener(Sounds);
    
    T.setBackground(Color.white);
    T.setForeground(Color.black);
    T.addActionListener(Sounds);
    Tall.addActionListener(Sounds);
    
    U.setBackground(Color.pink);
    U.setForeground(Color.white);
    U.addActionListener(Sounds);
    Union.addActionListener(Sounds);
    
    V.setBackground(Color.green);
    V.setForeground(Color.white);
    V.addActionListener(Sounds);
    Vanilla.addActionListener(Sounds);
    
    W.setBackground(Color.blue);
    W.setForeground(Color.white);
    W.addActionListener(Sounds);
    Wall.addActionListener(Sounds);
    
    X.setBackground(Color.lightGray);
    X.setForeground(Color.white);
    X.addActionListener(Sounds);
    Xenon.addActionListener(Sounds);
    
    Y.setBackground(Color.yellow);
    Y.setForeground(Color.white);
    Y.addActionListener(Sounds);
    Year.addActionListener(Sounds);
    
    Z.setBackground(Color.red);
    Z.setForeground(Color.white);
    Z.addActionListener(Sounds);
    Zero.addActionListener(Sounds);
    
    frame.add(panel);
    panel.add(label);
    panel.add(text);
    panel.add(label1);
    
    panel.add(Song);
    panel.add(Stop);
    panel.add(A);
    panel.add(Apple);
    panel.add(B);
    panel.add(Book);
    panel.add(C);
    panel.add(Cat);
    panel.add(D);
    panel.add(Dog);
    panel.add(E);
    panel.add(Egg);
    panel.add(F);
    panel.add(Fish);
    panel.add(G);
    panel.add(Gold);
    panel.add(H);
    panel.add(Hand);
    panel.add(I);
    panel.add(Iran);
    panel.add(J);
    panel.add(Jungle);
    panel.add(K);
    panel.add(Kick);
    panel.add(L);
    panel.add(Lamp);
    panel.add(M);
    panel.add(Map);
    panel.add(N);
    panel.add(Nation);
    panel.add(O);
    panel.add(Onion);
    panel.add(P);
    panel.add(Persian);
    panel.add(Q);
    panel.add(Quick);
    panel.add(R);
    panel.add(Red);
    panel.add(S);
    panel.add(Sell);
    panel.add(T);
    panel.add(Tall);
    panel.add(U);
    panel.add(Union);
    panel.add(V);
    panel.add(Vanilla);
    panel.add(W);
    panel.add(Wall);
    panel.add(X);
    panel.add(Xenon);
    panel.add(Y);
    panel.add(Year);
    panel.add(Z);
    panel.add(Zero);
    
    panel.add(picture);
   
    }
}
               

            


