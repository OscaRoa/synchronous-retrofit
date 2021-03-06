package responses;

public class Gif{
	private String type;
	private String id;
	private String url;
	private String bitly_gif_url;
	private String source;
	private String username;
	private GiphyImage images;

	public Gif(){
		this.type = type;
		this.id = id;
		this.url = url;
		this.bitly_gif_url = bitly_gif_url;
		this.source = source;
		this.username = username;
		this.images = images;
	}

	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}

	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}

	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}

	public void setBitlyGifUrl(String bitly_gif_url){
		this.bitly_gif_url = bitly_gif_url;
	}
	public String getBitlyGifUrl(){
		return this.bitly_gif_url;
	}

	public void setSource(String source){
		this.source = source;
	}
	public String getSource(){
		return this.source;
	}

	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}

	public void setImages(GiphyImage images){
		this.images = images;
	}
	public GiphyImage getImages(){
		return this.images;
	}
}
