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

    public static Command parse(String line) {
        if (line.equals("")) {
            return null;
        }
        String[] parts = line.split("\\s");
        Direction direction = Direction.valueOf(parts[0].toUpperCase());
        Integer distance = Integer.parseInt(parts[1]);
        return new Command(direction, distance);
    }
}
