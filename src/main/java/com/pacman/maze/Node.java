package com.pacman.maze;

import lombok.Getter;

public class Node {

    @Getter
    private boolean discovered;

    @Getter
    private int x, y;
}
