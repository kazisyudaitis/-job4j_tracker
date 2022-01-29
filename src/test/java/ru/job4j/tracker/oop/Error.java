package ru.job4j.tracker.oop;

public class Error {
    private boolean active;

    private int status;

   private String message;

   public Error(boolean active, int status, String message) {
       this.active = active;
       this.status = status;
       this.message = message;
   }

   public Error() {
   }

   public void printInfo() {
       System.out.println("Активность: " + active);
       System.out.println("Статус: " + status);
       System.out.println("Сообщение: " + message);
   }

    public static void main(String[] args) {
        Error error = new Error(true, 7, "Есть ошибки!");
        error.printInfo();
        Error err = new Error(true, 3, "Еще остались ошибки!");
        err.printInfo();
        Error noErr = new Error();
        noErr.printInfo();
    }
}
