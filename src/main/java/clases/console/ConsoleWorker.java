package clases.console;

import clases.commands.*;
import clases.commands.abstracts.Command;
import clases.shop.Cart;
import clases.shop.CartFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleWorker {

    final private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    final private Command[] commands = new Command[]{new Delete(), new Help(), new Put(), new Show(), new DeleteAll(), new PutAll()};

    public ConsoleWorker() throws IOException {
        setNewCart();
        start();
    }

    private void start() throws IOException {
        System.out.println("Добро пожаловать в эмулятор корзины!");
        boolean flag = true;
        String line;
        String[] parts;
        String param = "";
        String commandName = "";
        while (true){
            line = reader.readLine().trim().toLowerCase();
            if (line.contains(" ")) {
                parts = line.split(" ", 2);
                commandName = parts[0];
                param = parts[1];
            } else commandName = line;
            for (Command command:
                    commands) {
                if (command.getName().equals(commandName)) {
                    command.execute(param);
                    flag = false;
                }
            }
            if (flag){
                System.out.println("Такой команды нет, для просмотра возможных команд напишите help");
                flag = true;
            }
        }
    }

    public void setNewCart(){
        Cart cart = CartFactory.getCart();
        for (Command command:
                commands) {
            command.setCart(cart);
        }
    }
}
