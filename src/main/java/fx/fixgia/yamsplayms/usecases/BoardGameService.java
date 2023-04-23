package fx.fixgia.yamsplayms.usecases;

import fx.fixgia.yamsplayms.models.BoardGameEntity;
import fx.fixgia.yamsplayms.models.DiceEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BoardGameService {

    private final static int DICESNUMBER = 5;

    public void createDicesForMatch(BoardGameEntity boardGame) {

        for(int i=0; i<DICESNUMBER; ++i ){
            DiceEntity dice = new DiceEntity();
            dice.setDiceNumber(i+1);
            boardGame.getDices().add(dice);
            log.debug("we create dice {}", i+1);
        }
        log.debug("we have {} dices", DICESNUMBER);
    }
}
