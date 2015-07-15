import retrofit.Callback;
import responses.*;
import retrofit.RetrofitError;
import retrofit.client.Response;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args) {
		int cantidad = 1;
		String busqueda = JOptionPane.showInputDialog("Gifs chidos de:");
		String numero = JOptionPane.showInputDialog("¿Cuántos?");
		cantidad = Integer.parseInt(numero);
		Main.searchGifs(busqueda, cantidad);
	}

	public static void searchGifs(String term, int numImages){
		GiphyService service = new GiphyService();

		GiphyResponse gifs = service.searchGifs(term);
		int i = 0;
		for (Gif gif : gifs.getData()) {
			i++;
			if(i <= numImages){
				Main.openInBrowser(gif.getImages().fixed_height.url);
			}
		}
	}

	public static void openInBrowser(String url){
		if(Desktop.isDesktopSupported()){
			try {
          Desktop.getDesktop().browse(new URI(url));
            } catch (URISyntaxException e) {
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
		}
	}
}
