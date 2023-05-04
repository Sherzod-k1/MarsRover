package de.szut;

public interface Command {
    void execute(Rover rover);


    public class MoveForwardCommand implements Command {
        @Override
        public void execute(Rover rover) {
            rover.moveForward();
        }
    }

    public class MoveBackwardCommand implements Command {
        @Override
        public void execute(Rover rover) {
            rover.moveBackward();
        }
    }

    public class TurnLeftCommand implements Command {
        @Override
        public void execute(Rover rover) {
            rover.turnLeft();
        }
    }

    public class TurnRightCommand implements Command {
        @Override
        public void execute(Rover rover) {
            rover.turnRight();
        }
    }

    public class MoveUpCommand implements Command {
        @Override
        public void execute(Rover rover) {
            rover.moveUp();
        }
    }

    public class MoveDownCommand implements Command {
        @Override
        public void execute(Rover rover) {
            rover.moveDown();
        }
    }
}


