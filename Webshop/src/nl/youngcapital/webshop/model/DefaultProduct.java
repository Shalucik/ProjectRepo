package nl.youngcapital.webshop.model;

public class DefaultProduct extends Product {
	
	private String naam;
	private int prijspereenheid;
	private String imageurl;
	private int eenheid;

	
	public DefaultProduct(String naam, int prijspereenheid, String imageurl, int eenheid) {
		super(naam, prijspereenheid, imageurl, eenheid);
	}
	
	public DefaultProduct(String naam, int prijspereenheid, String imageurl) {
		super(naam, prijspereenheid, imageurl);
	}
	
	@Override
	protected String getNaam() {
		return this.naam;
	}

	@Override
	protected void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	protected int getEenheid() {
		return this.eenheid;
	}

	@Override
	protected void setEenheid(int eenheid) {
		this.eenheid = eenheid;
	}

	@Override
	protected int getPrijsPerEenheid() {
		return this.prijspereenheid;
	}

	@Override
	protected void setPrijsPerEenheid(int prijspereenheid) {
		this.prijspereenheid = prijspereenheid;
	}

	@Override
	protected String getImageUrl() {
		return this.imageurl;
	}

	@Override
	protected void setImageUrl(String imageUrl) {
		this.imageurl = imageurl;
	}

}
