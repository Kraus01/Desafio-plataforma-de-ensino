package curso_programacao;

public class Bill {
	
	  private char gender;
	    private int beer;
	    private int barbecue;
	    private int softDrink;

	    public Bill(){

	    }

	    public Bill(char gender, int beer, int barbecue, int softDrink) {
	        this.gender = gender;
	        this.beer = beer;
	        this.barbecue = barbecue;
	        this.softDrink = softDrink;
	    }
	    public double cover() {
	        if (feeding() <= 30) {
	            return 4.00;
	        } else {
	            return 0.00;
	        }
	    }

	    public double feeding(){
	    	double valorBeer = beer * 5.00;
	    	double valorBarbecue = barbecue * 7.00;
	    	double valorSoftDrink = softDrink * 3.00;
	    	
	        return valorBeer + valorBarbecue + valorSoftDrink;
	    }

	    public double ticket(){
	        double ticket;
	        if (this.gender == 'F') {
	            ticket = 8.00;
	        } else {
	                ticket = 10.00;
	            }
	        return ticket;
	    }

	    public double total(){
	        return cover() + ticket() + feeding();
	    }

}
