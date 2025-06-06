module com.example.chess {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chess to javafx.fxml;
    exports com.example.chess;
    exports com.example.chess.figures;
    opens com.example.chess.figures to javafx.fxml;
    exports com.example.chess.net;
    opens com.example.chess.net to javafx.fxml;
}