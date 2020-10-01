package clases;

public class Data 
{
	//App ID
	private int id;
	//Nombre de la App
	private String track_name;
	//Tamaño (en Bytes)
	private String size_bytes;
	//Moneda
	private String currency;
	//Precio en la moneda
	private double price;
	//Cantidad de reseñas (Para todas las versiones)
	private int rating_count_tot;
	//Cantidad de reseñas (Para la versión actual)
	private int rating_count_ver;
	//Promedio de puntaje de las reseñas (Para todas las versiones)
	private double user_rating;
	//Promedio de puntaje de las reseñas (Para la versión actual)
	private double user_rating_ver;
	//Ultima version
	private String ver;
	//Rating de contenido
	private String cont_rating;
	//Género principal
	private String prime_genre;
	//Cantidad de dispositivos soportados
	private int sup_devices_num;
	//Cantidad de capturas de pantallas por dispositivos
	private int ipadSc_urls_num;
	//Cantidad de lenguajes soportados
	private int lang_num;
	//Licencia Vpp activada
	private int vpp_lic;
	
	//*********************************
	/*********CONSTRUCTORES***********/
	//*********************************
	public Data(int id,  String track_name, String size_bytes2,  String currency, double price, int rating_count_tot,
				int rating_count_ver, double user_rating, double user_rating_ver,  String ver, String cont_rating,
				String prime_genre, int sup_devices_num, int ipadSc_urls_num, int lang_num, int vpp_lic)
	{
		this.id=id;
		this.track_name=track_name;
		this.size_bytes=size_bytes2;
		this.currency=currency;
		this.price=price;
		this.rating_count_tot=rating_count_tot;
		this.rating_count_ver=rating_count_ver;
		this.user_rating=user_rating;
		this.user_rating_ver=user_rating_ver;
		this.ver=ver;
		this.cont_rating=cont_rating;
		this.prime_genre=prime_genre;
		this.sup_devices_num=sup_devices_num;
		this.ipadSc_urls_num=ipadSc_urls_num;
		this.lang_num=lang_num;
		this.vpp_lic=vpp_lic;
	}
	
	
	//*********************************
	/*********GETERS & SETERS*********/
	//*********************************
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrack_name() {
		return track_name;
	}
	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}
	public String getSize_bytes() {
		return size_bytes;
	}
	public void setSize_bytes(String size_bytes) {
		this.size_bytes = size_bytes;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating_count_tot() {
		return rating_count_tot;
	}
	public void setRating_count_tot(int rating_count_tot) {
		this.rating_count_tot = rating_count_tot;
	}
	public int getRating_count_ver() {
		return rating_count_ver;
	}
	public void setRating_count_ver(int rating_count_ver) {
		this.rating_count_ver = rating_count_ver;
	}
	public double getUser_rating() {
		return user_rating;
	}
	public void setUser_rating(double user_rating) {
		this.user_rating = user_rating;
	}
	public double getUser_rating_ver() {
		return user_rating_ver;
	}
	public void setUser_rating_ver(double user_rating_ver) {
		this.user_rating_ver = user_rating_ver;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	public String getCont_rating() {
		return cont_rating;
	}
	public void setCont_rating(String cont_rating) {
		this.cont_rating = cont_rating;
	}
	public String getPrime_genre() {
		return prime_genre;
	}
	public void setPrime_genre(String prime_genre) {
		this.prime_genre = prime_genre;
	}
	public int getSup_devices_num() {
		return sup_devices_num;
	}
	public void setSup_devices_num(int sup_devices_num) {
		this.sup_devices_num = sup_devices_num;
	}
	public int getIpadSc_urls_num() {
		return ipadSc_urls_num;
	}
	public void setIpadSc_urls_num(int ipadSc_urls_num) {
		this.ipadSc_urls_num = ipadSc_urls_num;
	}
	public int getLang_num() {
		return lang_num;
	}
	public void setLang_num(int lang_num) {
		this.lang_num = lang_num;
	}
	public int getVpp_lic() {
		return vpp_lic;
	}
	public void setVpp_lic(int vpp_lic) {
		this.vpp_lic = vpp_lic;
	}
}
