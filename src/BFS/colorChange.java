package BFS;

import java.util.*;
public class colorChange {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(floodFill(new int[][]{
                {1,1,1},{1,1,0},{1,0,1}
        },1,1,2)));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r = image.length;
        int c = image[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {sr,sc});

        int currColor = image[sr][sc];

        while(!q.isEmpty()){

            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];

            if(x>=0 && y>=0 && x<r && y<c && image[x][y]==currColor){
                image[x][y]=color;
            }

            if(x-1>=0 && y>=0 && x<r && y<c && image[x-1][y]==currColor){
                q.add(new int[] {x-1,y});
            }
            if(x>=0 && y>=0 && x+1<r && y<c && image[x+1][y]==currColor){
                q.add(new int[] {x+1,y});
            }
            if(x>=0 && y-1>=0 && x<r && y<c && image[x][y-1]==currColor){
                q.add(new int[] {x,y-1});
            }
            if(x>=0 && y>=0 && x<r && y+1<c && image[x][y+1]==currColor){
                q.add(new int[] {x,y+1});
            }~
        }
        return image;
    }
}