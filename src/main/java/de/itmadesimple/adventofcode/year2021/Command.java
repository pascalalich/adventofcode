package de.itmadesimple.adventofcode.year2021;

public class Command {

    private final Direction direction;
    private final Integer distance;

    public Command(Direction direction, Integer distance) {
        this.direction = direction;
        this.distance = distance;
    }

    public Direction getDirection() {
        return direction;
    }

    public Integer getDistance() {
        return distance;
    }

    public enum Direction {
        FORWARD,
        DOWN,
        UP
    }
}
