package org.itstep.exam.command;

public class ExitCommand implements Command{
    @Override
    public void execute(String... args) {
        System.exit(0);

    }
}
