package org.itstep.exam;


import org.itstep.exam.command.*;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Command> commands = new HashMap<>();
        commands.put("dir", new DirCommand());
      /*  commands.put("cd", new CdCommand());*/
        commands.put("pwd", new PwdCommand());
        commands.put("cat", new CatCommand());
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());



        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("> ");
            String command = scanner.nextLine();
            String[] parts = command.split("\\s+");
            if (commands.containsKey(parts[0])){
                commands.get(parts[0]).execute(Arrays.copyOfRange(parts, 1, parts.length));
            } else {
                System.err.println("Error!");
            }
        }
    }
}
