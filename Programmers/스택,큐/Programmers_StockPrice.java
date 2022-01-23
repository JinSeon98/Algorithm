public class Programmers_StockPrice {

	 public int[] solution(int[] prices) {
	       int[] answer = new int[prices.length];
		      
		        for(int i = 0; i < prices.length; i++) {
		        	int sec = 0;
		        	int cri = prices[i];
		        	for(int j = i+1; j < prices.length; j++) {
		        		if(cri <= prices[j]) {
			        		sec++;
			        		if(j == prices.length-1){
				        		answer[i] = sec;
				        	}
			        	}
		        		else if(cri > prices[j]) {
		        			sec++;
			        		answer[i] = sec;
			        		break;
		        		}
		        	}
		        }
		        return answer;
	    }
}
