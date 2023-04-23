package fx.fixgia.yamsplayms;

import fx.fixgia.yamsplayms.models.BoardGameEntity;
import fx.fixgia.yamsplayms.models.DiceEntity;
import fx.fixgia.yamsplayms.usecases.BoardGameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardGameTest {

    BoardGameEntity boardGame;
    BoardGameService service;

    @BeforeEach
    void setUp(){
        boardGame = new BoardGameEntity();
        List<DiceEntity> dices = new ArrayList<>();
        boardGame.setDices(dices);
        service = new BoardGameService();
    }
    @Test
    @DisplayName("Le plateau de jeu doit créer 5 dés pour pouvoir jouer")
    void createDicesForMatchTest(){
        service.createDicesForMatch(boardGame);
        assertEquals(5, boardGame.getDices().size());
    }
}
