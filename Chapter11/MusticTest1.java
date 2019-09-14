import javax.sound.midi.*;

/**
 * MusticTest1
 */
public class MusticTest1 {

  public void play() throws InvalidMidiDataException {
    try {
      Sequencer player = MidiSystem.getSequencer();
      player.open();
      Sequence seq = new Sequence(Sequence.PPQ, 4);
      Track track = seq.createTrack();

      ShortMessage a = new ShortMessage();
      a.setMessage(144, 1, 44, 100);
      MidiEvent noteOn = new MidiEvent(a, 1);
      track.add(noteOn);

      ShortMessage b = new ShortMessage();
      b.setMessage(128, 1, 44, 100);
      MidiEvent noteOff = new MidiEvent(b, 16);
      track.add(noteOff);

      player.setSequence(seq);
      player.start();
    } catch (MidiUnavailableException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

  public static void main(String[] args) throws InvalidMidiDataException {
    MusticTest1 mt = new MusticTest1();
    mt.play();
  }
}