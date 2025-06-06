package com.example.chess.figures;

import com.example.chess.ChessGame;
import com.example.chess.Tile;
import javafx.scene.image.Image;

public class Queen extends Figure {

    public Queen(Tile tile, COLOR color, King king) {
        super(tile, color, king,
                new Image(ChessGame.class.getResourceAsStream(String.format("chess/%sQ.png", color == COLOR.WHITE ? "w" : "b"))));
    }

    @Override
    public void loadMoves() {
        moves.clear();
        checkFile();
        checkRank();
        checkLDiagonal();
        checkRDiagonal();
    }

}
