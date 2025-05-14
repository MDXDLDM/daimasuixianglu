package edu.scu.huisu;

import java.util.*;

public class itinerary {
    HashMap<String, List<String>> map = new HashMap<>();
    List<String> path = new ArrayList<>();
    List<String> result;
    int flag=0;
    int nums=0;
    public List<String> findItinerary(List<List<String>> tickets) {
        nums+=tickets.size();
        nums++;
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            if (!map.containsKey(from)) {
                List<String> list = new ArrayList<>();
                list.add(to);
                map.put(from, list);
            }else{
                map.get(from).add(to);
            }
        }//获取到所有可以作为出发站点的终点位置，作为每一层的树
        System.out.println(nums);
        for (String from : map.keySet()) {
            Collections.sort(map.get(from));
        }
        path.add("JFK");
        backtracking("JFK");
        return result;
    }
    private void backtracking(String start) {
        if(flag==1)return;
        if(path.size()==nums){
            flag=1;
            result=new ArrayList<>(path);
        }
        if(!map.containsKey(start)||map.get(start).isEmpty()){
            return;
        }
        for(int i=0;i<map.get(start).size();i++){
            String to = map.get(start).get(i);
            if(i>0&&map.get(start).get(i-1).equals(to))continue;
            path.add(to);
            map.get(start).remove(to);
            backtracking(to);
            path.remove(path.size()-1);
            map.get(start).add(i,to);
        }
    }
    private void sortListList(List<List<String>> list) {
        list.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                int i = 0;
                while (i < o1.size() - 1 && i < o2.size() - 1 && o1.get(i).equals(o2.get(i))) i++;
                if (o1.get(i).equals(o2.get(i))) {
                    if (o1.size() > o2.size()) return 1;
                    else if (o1.size() < o2.size()) return -1;
                    else return 0;
                } else {
                    return o1.get(i).compareTo(o2.get(i));
                }
            }
        });
    }

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("MUC", "LHR")),
                new ArrayList<>(Arrays.asList("JFK", "MUC")),
                new ArrayList<>(Arrays.asList("SFO", "SJC")),
                new ArrayList<>(Arrays.asList("LHR","SFO"))
        ));
        //[["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
        System.out.println(new itinerary().findItinerary(listOfLists));
    }
}
