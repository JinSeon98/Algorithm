class MakePrimeNum {
	
    public int solution(int[] nums) {
        int answer = 0;
        boolean prime = false;
        
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    for(int z = 2; z < sum; z++) {
                        if(sum % z == 0) {
                            prime = false;
                            break;
                        }
                        prime = true;
                    }
                    if(prime == true) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}