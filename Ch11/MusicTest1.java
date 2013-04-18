import javax.sound.midi.*;

public class MusicTest1 {
<<<<<<< HEAD
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got sequencer");
		}
		catch (MidiUnavailableException ex) {
			System.out.println("Bummer");
		}
	} //Close play

	public static void main(String[] args) {
		MusicTest1 m1 = new MusicTest1();
		m1.play();
	} //Close main
} //Close class.
=======
    public void play() {
	try {
	    Sequencer sequencer = MidiSystem.getSequencer();
	    System.out.println("We got a sequencer");
	}
	catch(MidiUnavailableException ex) {
	    System.out.println("Bummer");
	}
    } //Close play

    public static void main(String[] args) {
	MusicTest1 mt = new MusicTest1();
	mt.play();
    } //Close main
} //Close class
>>>>>>> Ch11

