package com.afs.tdd.Objects;


import jdk.internal.net.http.common.Pair;

public class MarsRover {
    int coordinateX;
    int coordinateY;
    String direction;

    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinatey() {
        return coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getStatus() {
        return coordinateX + " " + coordinateY + " " + direction;
    }

    public void rotateMarsRover(String command) {

    }
}

