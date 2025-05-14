package edu.scu.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solvenqueen {
    List<List<String>> res = new ArrayList<List<String>>();
    List<String> path=new ArrayList<>();
    //List<Integer> used=new ArrayList<>();//判断是否为正斜线
    //List<Integer> eused=new ArrayList<>();
    int[] sumused;
    int[] subused;//分别正斜线和反斜线排除
    int[] colused;//直接通过列排除
    public List<List<String>> solveNQueens(int n) {
        colused = new int[n];
        sumused = new int[n*2-1];
        subused = new int[n*2-1];
        backtracking(0,n);
        return res;
    }
    private void backtracking(int rowindex,int N){
        if(rowindex==N){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<N;i++){
            if(colused[i]==0&&sumused[i+rowindex]==0&&subused[i-rowindex+N-1]==0){
                path.add(getString(i,N));
                colused[i]=1;
                sumused[i+rowindex]=1;
                subused[i-rowindex+N-1]=1;
                backtracking(rowindex+1,N);
                path.remove(path.size()-1);
                colused[i]=0;
                sumused[i+rowindex]=0;
                subused[i-rowindex+N-1]=0;
            }
        }
    }
    private String getString(int i,int N){
        char[] c=new char[N];
        Arrays.fill(c,'.');
        c[i]='Q';
        return new String(c);
    }

    public static void main(String[] args) {
        new solvenqueen().solveNQueens(4);
    }
}
