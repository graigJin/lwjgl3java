package com.graigjin.lwjgl3java.main;

import com.graigjin.lwjgl3java.engine.GameEngine;
import com.graigjin.lwjgl3java.engine.IGameLogic;

public class Main {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new Game();
            GameEngine gameEng = new GameEngine("GAME", 600, 480, vSync, gameLogic);
            gameEng.start();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
