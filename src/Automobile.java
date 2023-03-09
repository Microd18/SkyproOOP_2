public interface Automobile {

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
