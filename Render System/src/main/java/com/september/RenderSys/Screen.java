package com.september.RenderSys;

import java.util.Random;

public class Screen {
	
	private int width;
	private int height;
	public int[] pixels;
	
	private static Random random = new Random();
	
	int time = 0;
	int counter = 0;
	
	public Screen(int width, int height) {
		
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		
	}
	
	public void clear() {
		for(int i = 0; i < pixels.length; i++)
			pixels[i] = 0;
	}
	
	public void render() {
		counter++;
		if(counter % 10 == 0) {
			time++;
		}
		for (int y = 100; y < height - 300; y++) {
			for(int x = 100; x < width - 200; x++)
				pixels[x + (y * width)] = random.nextInt(0xffffff);
		}
	}
	
}
