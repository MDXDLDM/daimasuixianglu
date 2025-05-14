package edu.scu.greedy;

public class candy {
    public int Candy(int[] ratings) {
//        if(ratings.length==1)return 1;
//        int sum=0;int[] count=new int[ratings.length];
//        int i=1;
//        while (i<ratings.length){
//            if(i==ratings.length-1&&ratings[i]==ratings[i-1]){
//                count[i]=1;
//                sum+=count[i];
//                i++;
//            }
//            while(i>0&&i<ratings.length-1&&ratings[i]==ratings[i-1]&&ratings[i]==ratings[i+1]){
//                count[i]=1;
//                sum+=count[i];
//                i++;
//            }
//            if(i>0&&i<ratings.length-1&&ratings[i]==ratings[i-1]){
//                i++;
//            }
//            int temp2=i-1;
//            if(i>0&&i< ratings.length&&ratings[i]>ratings[i-1]){
//                if(count[i-1]==0){
//                    count[i-1]=1;
//                    sum+=count[i-1];
//                }
//                while(i< ratings.length&&ratings[i]>ratings[i-1]){
//                    count[i]=1+i-temp2;
//                    sum+=count[i];
//                    i++;
//                }
//            }
//            if(i>0&&i< ratings.length&&ratings[i]<ratings[i-1]){
//                int temp=i-1;int stairs=0;
//                while(i<ratings.length&&ratings[i]<ratings[i-1]){
//                    stairs++;
//                    i++;
//                }
//                i=temp;
//                while(stairs>=0){
//                    if(count[i]!=0){
//                        sum-=count[i];
//                    }
//                    count[i]=Math.max(count[i],stairs+1);
//                    sum+=count[i];
//                    stairs--;i++;
//                }
//            }
//        }
//        if(count[ratings.length-1]==0){
//            if(ratings[ratings.length-1]>ratings[ratings.length-2])sum=sum+count[ratings.length-2]+1;
//            else sum+=1;
//        }
//        if(count[0]==0)sum+=1;
//        return sum;
        int[] nums = new int[ratings.length];
        nums[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                nums[i] = nums[i - 1] + 1;
            }else{
                nums[i]=1;
            }
        }
        nums[ratings.length - 1] = Math.max(nums[ratings.length - 1], 1);
        int sum=nums[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i]>ratings[i+1]){
                nums[i] =Math.max(nums[i],nums[i+1]+1);
            }
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        new candy().Candy(new int[]{1,0,2});
    }
}
