package com.graigjin.lwjgl3java.main;

import com.graigjin.lwjgl3java.engine.Engine;
import com.graigjin.lwjgl3java.engine.ILogic;

public class Main {

    public static void main(String[] args) {

        try {
            boolean vSync = true;
            ILogic gameLogic = new Game();
            Engine gameEngine = new Engine("GAME v.0.1", 1200, 800, vSync, gameLogic);
            gameEngine.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
