package edu.scu.huisu;

import java.util.ArrayList;
import java.util.List;

public class ipaddress {
    List<String> ips=new ArrayList<String>();
    public List<String> IPaddress(String IP) {
        getip(0,0,IP);
        return  ips;
    }
    StringBuilder sb=new StringBuilder();
    private void getip(int count,int index,String IP){
        if(count==4&&index==IP.length()){
            ips.add(sb.deleteCharAt(sb.length()-1).toString());
        }
        if(index>=IP.length()||count>4){
            return;
        }
        for(int i=index;i<IP.length();i++){
            if(i-index==4||(i>index&&IP.charAt(index)=='0'))break;
            String temp=IP.substring(index,i+1);
            if(isIP(temp)){
                int pre=sb.length();
                sb.append(temp);
                sb.append(".");
                getip(count+1,i+1,IP);
                sb.delete(pre,sb.length());
            }else{
                break;
            }
        }
    }
    private boolean isIP(String ip){
        return ip.matches("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]");
    }
}
