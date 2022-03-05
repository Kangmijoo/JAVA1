// while 반복문
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);		//string to double
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		System.out.println("Value of supply : "+ valueOfSupply);//공급가
		System.out.println("VAT : "+ vat);						//부가세
		System.out.println("Total : "+ total);					//
		System.out.println("Expense : "+ expense);				//비용
		System.out.println("Income : "+ income);				//이익
		
		// 배열 : 한번에 많은 데이터를 담기 위함. 변수가 많아질 수록 변수가 더렵혀질 가능성이 커서 배열 사용
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend "+ (i+1) +" : "+ (income*dividendRates[i]) );
			i = i + 1;
		}

	}

}
