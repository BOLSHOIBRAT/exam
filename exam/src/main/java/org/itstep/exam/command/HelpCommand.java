package org.itstep.exam.command;

public class HelpCommand implements Command{
    @Override
    public void execute(String... args) {
        System.out.println("Командная оболочка Java Command Line");
        System.out.println("Список содержимых команд:");
        System.out.println("\tdir — выводит список файлов в текущей директории");
        System.out.println("\tcd “путь” — перейти в директорию, путь к которой задан первым аргументом");
        System.out.println("\tpwd — вывести полный путь до текущей директории");
        System.out.println("\tcat «имя_файла» - выводит содержимое текстового файла «имя_файла»");
        System.out.println("\thelp - выводит эту справку");
        System.out.println("\texit - выход");
    }
}
