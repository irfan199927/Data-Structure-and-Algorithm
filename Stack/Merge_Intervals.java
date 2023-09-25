import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public void merge(int[][] intervals) {
		int n = intervals.length;
        Stack<ArrayList<Integer>> st = new Stack<>();
		Arrays.sort(intervals,(x,y) -> Integer.compare(x[0],y[0]));
		
		for(int i=0; i<n; i++){
		    
			if(st.isEmpty()){
			    ArrayList<Integer> arr = new ArrayList<>();
				arr.add(intervals[i][0]);
				arr.add(intervals[i][1]);
				
                st.push(arr);
			}
			else{
			    
				int l = intervals[i][0];
				int r = intervals[i][1];

				int x = st.peek().get(0);
				int y = st.peek().get(1);
				
				
			
				if(y >= l){
				    int maxX = Math.min(l,x);
				    int maxY = Math.max(r,y);
				    st.pop();
				    
				    ArrayList<Integer> arr = new ArrayList<>();
					arr.add(maxX);
					arr.add(maxY);
					st.push(arr);
				}
				else{
				    ArrayList<Integer> arr = new ArrayList<>();
					arr.add(intervals[i][0]);
					arr.add(intervals[i][1]);
					st.push(arr);
				}
			}
		}
		
		Stack<ArrayList<Integer>> ans = new Stack<>();
		
		while(!st.isEmpty()){
			ans.push(st.peek());
			st.pop();
		}
		
		while(!ans.isEmpty()){
			System.out.println(ans.peek());
			ans.pop();
		}
		
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.merge(A);
        
    }
}