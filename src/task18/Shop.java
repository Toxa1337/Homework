package task18;

// Написать программную реализацию для онлайн покупок в зарубежном интернет-магазине.
// Клиент совершает онлайн покупку. При оформлении заказа у пользователя запрашивается ФИО и ИНН.
// В программе проверяется, действителен ли номер ИНН для такого клиента.
// Исключение будет выдано в том случае, если введен недействительный ИНН.


import java.util.Objects;
import java.util.Scanner;

class Shop{
    public static void main(String[] args){
        Client[] users = new Client[3];
        users[0] = new Client("Smirnov A.V.", "63927154082", true);
        users[1] = new Client("Romanov R.N.", "19635203651", false);
        users[2] = new Client("Max P.R.", "18456273837", true);
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Please, enter your Name S.P.: ");
        String name = scanner.nextLine();
        System.out.println("Enter your INN: ");
        String userINN = scanner.nextLine();
        for (Client user : users){
            if (Objects.equals(user.getName(), name)){
                if (Objects.equals(user.getInn(), userINN))
                {
                    if (user.isDate()){
                        flag = true;
                        break;
                    }
                    else{
                        System.out.println("Your INN overdue.");
                    }
                }
                System.out.println("You have entered an incorrect INN.");

            }
        }
        if (flag) {
            System.out.println("Everything is fine. You can start shopping.");
        } else {
            System.out.println("There is no information about you in the database. Access is restricted.");
        }
    }
}

class Client {
    private String name;
    private String inn;
    private boolean date;

    Client(String name, String INN, boolean date){
        this.name = name;
        this.inn = INN;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    public boolean isDate() {
        return date;
    }

}
