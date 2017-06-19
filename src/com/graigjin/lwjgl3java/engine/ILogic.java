package com.graigjin.lwjgl3java.engine;

public interface ILogic {

    void init() throws Exception;

    void input(Window window);

    void update(float interval);

    void render(Window window);
}
