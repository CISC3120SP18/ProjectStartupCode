package edu.cuny.brooklyn.project;

public class GameSettings {
	// default frame size
	final static int FRAME_WIDTH = 80;
	final static int FRAME_HEIGHT = 25;
	
	// default treasure field size
	public final static int FIELD_WIDTH = 70;
	public final static int FIELD_HEIGHT = 15;
	
	// default user I/O field size
	public final static int IO_WIN_WIDTH = 70;
	public final static int IO_WIN_HEIGHT = 3;
	
	public final static char FIELD_EMPTY = ' ';
	
	public final static char DISPLAY_BLANK = ' ';
	
	// default treasure set up
	public final static int DEFAULT_TREASURE_SIZE = 10;
	public final static int DEFAULT_TREASURE_VALUE = 1;
	
	// number of types of puzzlers
	public final static int NUM_TYPES_OF_PUZZLERS = 1;
	
	// score window
	public static final int DEFAULT_SCORE_WINDOW_HEIGHT = 1;
	public static final int DEFAULT_SCORE_WINDOW_WIDTH = 70;
	
	// clue error
	public static final int DEFAULT_CLUE_ERROR_INCREMENT = 2;
	
	// score computation
	public static final int MAX_SCORE = 100;
	public static final int SCORE_PENALTY = 10;
}
