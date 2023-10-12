package com.headfirstjava;
import javax.sound.midi.*;

public class MusicTest1 {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Sucessfully got a sequencer");
		} catch (MidiUnavailableException mue) {
            mue.printStackTrace();
        }
	}
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}
