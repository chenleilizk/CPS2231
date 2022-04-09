
public class Stock {

	     String symbol;
		 String name;
		 double previousClosingPrice;
		 double currentPrice;
		 Stock(){
		 }
		 Stock(String newSymbol,String newName){
			 symbol = newSymbol;
			 name = newName;
		 }
		 double getPercentage() {
			 return (currentPrice-previousClosingPrice)/previousClosingPrice*100 ;
		 }
		 void setPrice(double newPrice) {
			 currentPrice = newPrice;
		 }

}
