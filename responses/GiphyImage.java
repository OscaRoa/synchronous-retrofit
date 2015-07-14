package responses;

public class GiphyImage{
	public class FixedHeight{
		private String url;
		private String width;
		private String height;
	}

	public void setGiphyUrl(String url){
		this.url = url;
	}
	public String getGiphyUrl(){
		return this.url;
	}

	public void setWidth(String width){
		this.width = width;
	}
	public String getWidth(){
		return this.width;
	}

	public void setHeight(String height){
		this.height = height;
	}
	public String getHeight(){
		return this.height;
	}
	
	public FixedHeight fixed_height;
}
