package org.itstep.exam.command;

import java.io.File;

public class DirCommand implements Command{
    @Override
    public void execute(String... args) {
        File dir = new File(".");
        for (File f: dir.listFiles()){
            System.out.println(f.getName());
        }

    }
}
