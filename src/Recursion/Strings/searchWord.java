package Recursion.Strings;

import java.util.Scanner;

public class searchWord {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = sc.nextLine();
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                    if(search(board,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,int i,int j,String word,int index){

        if(index>=word.length()) return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] == '#') return false;

        if(word.charAt(index)!=board[i][j]) return false;

        char c = board[i][j];
        board[i][j] = '#';

        if(search(board,i+1,j,word,index+1)){
            return true;
        }
        if(search(board,i,j+1,word,index+1)){
            return true;
        }
        if(search(board,i-1,j,word,index+1)){
            return true;
        }
        if(search(board,i,j-1,word,index+1)){
            return true;
        }

        board[i][j] = c;
        return false;
    }
}
