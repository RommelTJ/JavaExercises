import javax.sound.midi.*;

public class MusicTest1 {
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

