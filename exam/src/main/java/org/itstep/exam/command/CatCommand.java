package org.itstep.exam.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CatCommand implements Command {
    @Override
    public void execute(String... args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("README.md"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
