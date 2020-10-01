package clases;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.apache.commons.codec.binary.StringUtils;

import com.opencsv.CSVReader;

public class Reader
{
	private String file;
	public Reader(String file)
	{
		this.file=file;
	}
	
	public ArrayList read() throws IOException
	{
		ArrayList list=new ArrayList();
		//ABRE EL ARCHIVO
		FileReader filereader = new FileReader(file); 
		CSVReader csvReader = new CSVReader(filereader);
		//AQUI SE GUARDARAN LOS DATOS DE MOMENTO
	    String[] nextRecord; 
	    

		int id;
		String track_name;
		String size_bytes;
		String currency;
		double price;
		int rating_count_tot;
		int rating_count_ver;
		double user_rating;
		double user_rating_ver;
		String ver;
		String cont_rating;
		String prime_genre;
		int sup_devices_num;
		int ipadSc_urls_num;
		int lang_num;
		int vpp_lic;
		int cont=0;
	    //BASICAMENTE, MIENTRAS EL DOCUMENTO TENGA LINEAS PENDIENTES POR LEER
	    while ((nextRecord = csvReader.readNext()) != null)
	    {
	    	if (cont==0)
	    	{
	    		cont++;
	    	}
	    	else
	    	{
	    		id=Integer.parseInt(nextRecord[1]);
		    	track_name=nextRecord[2];
		    	size_bytes=nextRecord[3];
		    	currency=nextRecord[4];
		    	price=Double.parseDouble(nextRecord[5]);
		    	rating_count_tot=Integer.parseInt(nextRecord[6]);
		    	rating_count_ver=Integer.parseInt(nextRecord[7]);
		    	user_rating=Double.parseDouble(nextRecord[8]);
		    	user_rating_ver=Double.parseDouble(nextRecord[9]);
		    	ver=nextRecord[10];
		    	cont_rating=nextRecord[11];
		    	prime_genre=nextRecord[12];
		    	sup_devices_num=Integer.parseInt(nextRecord[13]);
		    	ipadSc_urls_num=Integer.parseInt(nextRecord[14]);
		    	lang_num=Integer.parseInt(nextRecord[15]);
		    	vpp_lic=Integer.parseInt(nextRecord[16]);
		    	Data nuevo=new Data(id, track_name, size_bytes, currency, price, rating_count_tot, rating_count_ver, 
		    						user_rating, user_rating_ver, ver, cont_rating, prime_genre, sup_devices_num, 
		    						ipadSc_urls_num, lang_num, vpp_lic);
		    	
		    	//AQUI SE SUPONE QUE DEBERIA INGRESARSE A NUESTRO MANEJADOR DE DATOS QUE LO CORRELACIONE A ALGUN LUGAR
		    	list.add(nuevo);
	    	}
	    	
	    }
	     
	    return list;
	}
}
