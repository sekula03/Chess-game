package com.example.chess.figures;

import com.example.chess.ChessGame;
import com.example.chess.Tile;
import javafx.scene.image.Image;

public class Bishop extends Figure {

    private final COLOR square_color;

    public Bishop(Tile tile, COLOR color, King king) {
        super(tile, color, king,
                new Image(ChessGame.class.getResourceAsStream(String.format("chess/%sB.png", color == COLOR.WHITE ? "w" : "b"))));
        square_color = (tile.getX() + tile.getY()) % 2 == 0 ? COLOR.WHITE : COLOR.BLACK;
    }

    @Override
    public void loadMoves() {
        moves.clear();
        checkLDiagonal();
        checkRDiagonal();
    }

    public COLOR getSquareColor() {
        return square_color;
    }

}
