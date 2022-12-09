package entity;

import engine.GameSettings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyShipFormationTest {
    GameSettings gameSettings = new GameSettings(1,1,1,1,1);
    EnemyShipFormation test = new EnemyShipFormation(gameSettings);
    @Test
    void update() {
    }

    @Test
    void random() { //랜덤함수가 정상 작동하는지 확인
        int set[] = new int[3];
        set[0] = test.random("100","0","0","1","2","3");
        set[1] = test.random("0","100","0","1","2","3");
        set[2] = test.random("0","0","100","1","2","3");
        int setExpect[] = new int[3];
        for(int i = 0; i<3;i++){
            setExpect[i] = i+1;
        }
        assertArrayEquals(setExpect,set);
    }
}