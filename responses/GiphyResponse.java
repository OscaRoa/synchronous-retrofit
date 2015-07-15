package responses;

import java.util.ArrayList;
import responses.Gif;
import java.util.Random;
import java.util.*;

public class GiphyResponse{
	private ArrayList<Gif> data;

	public GiphyResponse(){
		this.data = data;
	}
	public ArrayList<Gif> getRandomData(){
		Collections.shuffle(data);
		return data;
	}

	public ArrayList<Gif> getData(){
		return data;
	}
}
