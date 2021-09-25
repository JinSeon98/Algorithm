class Recommend_newId {
    public String solution(String new_id) {
        String answer = "";
        
        //1�ܰ� : ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ
        new_id = new_id.toLowerCase();
        //2�ܰ� : ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");
        //3�ܰ� : ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
        new_id = new_id.replaceAll("[.]{2,}", ".");
        //4�ܰ� : ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
        if(new_id.startsWith(".")) {
        	new_id = new_id.substring(1, new_id.length());
        }
        if(new_id.endsWith(".")) {
        	new_id = new_id.substring(0, new_id.length()-1);
        }
        //5�ܰ� : �� ���ڿ��̶��, new_id�� "a"�� ����
        if(new_id.length() == 0) {
        	new_id = "a";
        }
        /*6�ܰ� : ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����
         * ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� ����*/
        if(new_id.length() >= 16) {
        	new_id = new_id.substring(0, 15);
        }
        if(new_id.endsWith(".")) {
        	new_id = new_id.substring(0, new_id.length()-1);
        }
        //7�ܰ� : ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ����
        if(new_id.length() <= 2) {
        	char ch = new_id.charAt(new_id.length()-1);
        	for(int i = new_id.length(); i < 3; i++) {
        		new_id += String.valueOf(ch);
        	}
        }
        answer = new_id;
        return answer;
    }
}