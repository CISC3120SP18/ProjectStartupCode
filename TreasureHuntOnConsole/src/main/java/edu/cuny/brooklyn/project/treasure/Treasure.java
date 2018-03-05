package edu.cuny.brooklyn.project.treasure;

import edu.cuny.brooklyn.project.GameSettings;

public class Treasure {
	private int[][] treasure;
	private int size;
	private int initialUnitValue;
	private int totalValue;
	
	public Treasure() {
		size = GameSettings.DEFAULT_TREASURE_SIZE;
		treasure = new int[size][size];
		initialUnitValue = GameSettings.DEFAULT_TREASURE_VALUE;
		for (int i=0; i<treasure.length; i++) {
			for (int j=0; j<treasure[i].length; j++) {
				treasure[i][j] = initialUnitValue;
				totalValue += initialUnitValue;
			}
		}
	}
	

	public int getSize() {
		return size;
	}
	
	public int getTotalValue() {
		return totalValue;
	}
	
	public int getValueAt(int x, int y) {
		return treasure[y][x];
	}
}
