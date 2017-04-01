package com.dhara;

public class EightQueens
{
    private int rows;
    private int columns;
    private int[][] board;
    private int cont;

    public EightQueens(int rows)
    {
        this.rows    = rows;
        this.columns = rows;
        board     = new int[rows][rows];
    }

    public void show()
    {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j]>0) System.out.printf("  %2d  |", board[i][j]);
                else System.out.printf("      |", board[i][j]);
            }
            System.out.println();
            for(int j=0; j<board[i].length; j++) System.out.print("------+");
            System.out.println();
        }
    }

    public boolean resolution(int f, int c, int num) {
        cont++;
        board[f][c] = num;
        if(num==rows) return true;
        int[][] posibles = possibilities();
        for(int i=0; i<posibles.length; i++) {
            if(resolution(posibles[i][0], posibles[i][1], num+1)) return true;
        }
        board[f][c]=0;
        return false;
    }

    public int[][] possibilities()
    {
        int[][] resp = new int[rows*columns][2];
        int[] sumaFilas = new int[columns];
        int[] sumaColumnas = new int[rows];
        int     pos  = 0;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(board[i][j]>0) {
                    sumaFilas[i]++;
                    sumaColumnas[j]++;
                }
            }
        }
        for(int i=0; i<rows; i++) {
            if(sumaFilas[i]>0) continue;
            for(int j=0; j<columns; j++) {
                if(sumaColumnas[j]>0) continue;
                if(i>0 && j>0             && board[i-1][j-1] > 0) continue;
                if(i>0 && j<columns-1 && board[i-1][j+1] > 0) continue;
                if(i<rows-1 && j>0    && board[i+1][j-1] > 0) continue;
                if(i<rows-1 && j<columns-1 && board[i+1][j+1] > 0) continue;
                resp[pos][0]=i;
                resp[pos][1]=j;
                pos++;
            }
        }
        int[][] tmp = new int[pos][2];
        for(int i=0; i<pos; i++) { tmp[i][0] = resp[i][0]; tmp[i][1]=resp[i][1]; }
        return tmp;
    }

    boolean validate(int f, int c)
    {
        if(f<0 || f>rows-1 || c<0 || c>columns-1) return false;
        if(board[f][c]!=0) return false;
        return true;
    }

    public int getCont() {
        return cont;
    }
}
