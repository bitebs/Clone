package com.company;

public class Opponent {
    public static int[][] moves = {{1,-2}, {2,-1}, {1,2}, {2,1}};

    public static void main(String[] args) {
        //for (int i=0; i< moves.length; i++)
            //System.out.println(moves[1][0]+" ");
        new PlayerOpponent().printMoves();
    }
}

class PlayerOpponent{
    public void printMoves(){
        for (int i=0; i<Opponent.moves.length; i++)
            System.out.println(Opponent.moves[i][0]+", "+Opponent.moves[i][1]);
    }
}
