class contains_dup{
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        int k=3;
        // int r=1,l=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[l]==nums[r]){
        //         if(Math.abs(l-r)<=k){
        //             System.out.println("true");
        //             break;
        //         }
        //     }
        //     else{
        //         if(r==nums.length-1){
        //             l++;
        //             r=l+1;
        //         }
        //         else{
        //             r++;
        //         }
        //     }
        // }
        // System.out.println("false");

        int r=1,l=0;
        while(r<nums.length){
            if(nums[r]==nums[l]){
                if(Math.abs(r-l)<=k){
                    System.out.println(true); 
                }
            }
            r++;
            if(r==nums.length-1){
                l++;
                r=l+1;
            }
            
        }
        System.out.println(false);
    }
}

