class Evennoofdigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findnos(nums));
    }
    static int findnos(int[] nums){
        int count=0;
            for(int num: nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
    }
        static boolean even(int num){
        int noofdigits=digits(num);
        if(noofdigits%2==0) {
            return true;
        }
        return false;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}