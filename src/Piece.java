/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paul
 */

 //default game piece
public class Piece {
    public int x;
    public int y;
    public boolean is_white;
    void movement(int new_x,int new_y){
        this.x = new_x;
        this.y = new_y;
    }
}

class Pawn extends Piece{
//Can move 1 case forwards, except when starting it can move 2, attack sideway
}

class King extends Piece{
//Can move all around it 1 case
}

class Queen extends Piece{
//Can move staight, sideways or diagonally, forwards or backwards as many cases as it wants
}

class Rook extends Piece{
//Can move straight or sideways, forwards or backwards as many cases as it wants
}

class Bishop extends Piece{
//Can move diagonally forwards or backwards as many cases as it wants
}

class Knight extends Piece{
//Can move in an L shape (x+/-2, y+/-1 or x+/-1, y+/-2) 
}