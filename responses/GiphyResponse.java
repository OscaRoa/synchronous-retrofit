package responses;

import java.util.ArrayList;
import responses.Gif;

public class GiphyResponse{
	private ArrayList<Gif> data;

	public void setData(ArrayList<Gif> data){
		this.data = data;
	}
	public ArrayList<Gif> getData(){
		return data;
	}
}
