package BFS;

import java.util.*;

public class KnightBfS {
    public static class Node{
        int x;
        int y;
        public Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    static int N = 3;
    static int[] x= {1,2,2,1,-1,-2,-2,-1};
    static int[] y= {2,1,-1,-2,-2,-1,1,2};
    static boolean[][] visited = new boolean[N][N];

    public static boolean travel(int sx,int sy,int ex,int ey){
        Queue<Node> q = new LinkedList<>();
        Node m = new Node(sx,sy);
        q.add(m);
        visited[sx][sy] = true;
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x==ex && node.y==ey){
                return true;
            }
            for(int i=0;i<8;i++){
                int nx = node.x+x[i];
                int ny = node.y+y[i];

                if(nx>=0 && ny>=0 && nx<N && ny<N && !visited[nx][ny]){
                    q.add(new Node(nx,ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = 0;
        int sy = 0;
        int ex = 1;
        int ey = 1;
        System.out.println(travel(sx,sy,ex,ey));
    }
}
