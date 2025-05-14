package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class lettercombination {
    String[] f={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> list=new ArrayList<String>();
    StringBuilder sb=new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0)return list;
        getall(digits,digits.length()-1,0);
        return list;
    }
    public void getall(String nums,int all,int index){
        if(index>all){
            list.add(sb.toString());
            return;
        }
        for(int i=0;i<f[nums.charAt(index)-'2'].length();i++){
            sb.append(f[nums.charAt(index)-'2'].charAt(i));
            getall(nums,all,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new lettercombination().letterCombinations("23"));
    }
}
