class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rst = new ArrayList<>();
        for(int i = left; i<=right; i++){
            if(isSelfDividing(i)){
                rst.add(i);
            }
        }
        return rst;
    }
    
    private boolean isSelfDividing(int num){
        int i = num;
        while(i!=0){
            int k = i%10;
            i = i/10;
            
            if(k==0 || num%k!=0){
                return false;
            }
        }
        return true;
    }
}
