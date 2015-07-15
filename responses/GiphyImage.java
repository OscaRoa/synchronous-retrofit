package responses;

public class GiphyImage{
	public class FixedHeight{
		public String url;
		private String width;
		private String height;

		public FixedHeight(){
			this.url = url;
			this.width = width;
			this.height = height;
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
	}

	public FixedHeight fixed_height;
}
