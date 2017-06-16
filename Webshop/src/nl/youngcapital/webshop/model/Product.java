package nl.youngcapital.webshop.model;

public abstract class Product {
	
	
	public static final int gram = 1;
	public static final int kilo = 2;
	public static final int liter = 3;
	public static final int stuk = 4;
	public static final int pak = 5;
	
	Product(String naam, int prijspereenheid, String imageurl, int eenheid){
		setNaam(naam);
		setPrijsPerEenheid(prijspereenheid);
		setImageUrl(imageurl);
		setEenheid(eenheid);
		
	}
	
	Product(String naam, int prijspereenheid, String imageurl){
		this(naam, prijspereenheid, imageurl, 0);
	}
	
	public String toString(){
		return getNaam() + " " + getEenheidNaam() + " " + getPrijsPerEenheid();
	}
	
	private int getPrijs(int hoeveelheid){
		return getPrijsPerEenheid() * hoeveelheid;
	}
	
	private String getEenheidNaam(){
		switch(getEenheid()){
			case 1: 
				return "gram";
			case 2:
				return "kilo";
			case 3:
				return "liter";
			default:
			case 4:
				return "stuk";
			case 5:
				return "pak";
		}
	}
	
	protected abstract String getNaam();
	
	protected abstract void setNaam(String naam);
	
	protected abstract int getEenheid();
	
	protected abstract void setEenheid(int eenheid);
	
	protected abstract int getPrijsPerEenheid();
	
	protected abstract void setPrijsPerEenheid(int prijspereenheid);
	
	protected abstract String getImageUrl();
	
	protected abstract void setImageUrl(String imageUrl);

}
