package org.itstep.exam.command;

import java.io.FileNotFoundException;

public interface Command {
    void execute(String... args) throws FileNotFoundException;

}