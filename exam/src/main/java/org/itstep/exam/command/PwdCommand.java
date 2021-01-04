package org.itstep.exam.command;

public class PwdCommand implements Command {
    @Override
    public void execute(String... args) {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }
}
