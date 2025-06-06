package com.example.chess.figures;

import com.example.chess.ChessGame;
import com.example.chess.Tile;
import javafx.scene.image.Image;

public class Knight extends Figure {

    static final int[][] pairs = {{1,2}, {1,-2}, {-1,2}, {-1,-2}, {2,1}, {2,-1}, {-2,1}, {-2,-1}};

    public Knight(Tile tile, COLOR color, King king) {
        super(tile, color, king,
                new Image(ChessGame.class.getResourceAsStream(String.format("chess/%sN.png", color == COLOR.WHITE ? "w" : "b"))));
    }

    @Override
    public void loadMoves() {
        moves.clear();
        checkAround(pairs);
    }

}
