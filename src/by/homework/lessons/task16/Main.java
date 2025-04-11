package by.homework.lessons.task16;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Создание пяти счетов
        Account account1 = new Account(01, "BYN001", "BYN", 1000.0);
        Account account2 = new Account(02, "BYN002", "BYN", 500.0);
        Account account3 = new Account(03, "BYN003", "BYN", 2000.0);
        Account account4 = new Account(04, "BYN004", "BYN", 800.0);
        Account account5 = new Account(05, "BYN005", "BYN", 1500.0);

        // Добавление счетов в банк
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        // Вывод информации о счетах в банке
        System.out.println("Информация о счетах в банке:");
        for (Account account : bank.getAccounts()) {
            System.out.println("Номер счёта: " + account.getAccountNumber() + ", Валюта: " + account.getCurrency() + ", Сумма: " + account.getBalance());
        }

        try {
            // Вызов метода перевода денег
            bank.transferMoney("BYN001", "BYN002", 22.22);
            System.out.println("Перевод выполнен успешно.");
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
    }
}


//1.Создать класс счёт(Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double).
//Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.
//2.Создать класс Банк. В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
//3.Создать своё непроверяемое исключение AccountNotFoundException. В этом классе добавьте поле String errorCode,переопределите гетеры и сетеры.
//4.Создать своё непроверяемое исключение NotEnoughMoneyException. В этом классе добавьте поле String errorCode,переопределите гетеры и сетеры.
//5.В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
//public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
//5.1  Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги, выбрасывает своё исключение AccountNotFoundExceptionс errorCode= not.found.account
//5.2  Если на счёте, с которого переводят деньги, сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
//5.3  Соответственно выполните логику перевода денег в белорусской валюте
//(отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту, на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.
//6.В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
//7.В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт. При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
//7.1  Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в нашем банке для выполнения переводов»
//7.2  Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств для перевода»
//7.3  В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
//8.Добавьте блок finally. В блоке finally выведите в консоли «Спасибо, что воспользовались услугами банка»
//9.*В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD иBYN).
//Сигнатура метода такая:
//public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate).
//exchangeRate это курсовая разница между долларом и белорусским рублём. Проверки выполните те же что и в пункте 5.

