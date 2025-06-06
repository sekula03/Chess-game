package com.example.chess.figures;

import com.example.chess.ChessGame;
import com.example.chess.Tile;
import javafx.scene.image.Image;

public class Rook extends Figure {

    public Rook(Tile tile, COLOR color, King king) {
        super(tile, color, king,
                new Image(ChessGame.class.getResourceAsStream(String.format("chess/%sR.png", color == COLOR.WHITE ? "w" : "b"))));
    }

    @Override
    public void loadMoves() {
        moves.clear();
        checkFile();
        checkRank();
    }

}
