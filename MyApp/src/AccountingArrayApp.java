// array 배열
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);		//string to double
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		// 배열 : 한번에 많은 데이터를 담기 위함. 변수가 많아질 수록 변수가 더렵혀질 가능성이 커서 배열 사용
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of supply : "+ valueOfSupply);//공급가
		System.out.println("VAT : "+ vat);						//부가세
		System.out.println("Total : "+ total);					//
		System.out.println("Expense : "+ expense);				//비용
		System.out.println("Income : "+ income);				//이익
		System.out.println("Dividend 1 : "+ dividend1);
		System.out.println("Dividend 2 : "+ dividend2);
		System.out.println("Dividend 3 : "+ dividend3);

	}

}
