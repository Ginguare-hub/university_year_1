void main() {
    double x;
    double y;
    double y_max;
    double x_range_min, y_range_min, x_range_max, y_range_max;
    boolean isIncorrect;

    x = 0;
    y = 0;

    static int X_RANGE_MIN = -1000;
    y_range_min = -1000;
    x_range_max = 1000;
    y_range_max = 1000;

    Scanner in = new Scanner(System.in);

    System.out.println("Даны координаты точки М(х,у). Определите, принадлежит, ли 
                        данная точка замкнутомуmмножеству D.");

    isIncorrect = true;
    while (isIncorrect) {
        System.out.print("Введите x: ");

        try {
            x = in.nextDouble();
            if (x > x_range_max || x < x_range_min) {
                System.out.println("Значение x выходит за рамки ограничения.");
            } else {
                isIncorrect = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный тип данных.");
            in.next();
        }
    }

    isIncorrect = true;
    do {
        System.out.print("Введите y: ");

        try {
            y = in.nextDouble();
            if (y > y_range_max || y < y_range_min) {
                System.out.println("Значение y выходит за рамки ограничения.");
            } else {
                isIncorrect = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный тип данных.");
            in.next();
        }
    } while (isIncorrect) 

    if (x <= 2 && x >= 0) {
        y_max = 0.5*(-1)*x + 1;
        if (y >= 0 && y <= y_max) {
            System.out.println("Точка M принадлежит D");
        }
        else {
            System.out.println("Точка M не принадлежит D");
        }
    }
    else {
        System.out.println("Точка M не принадлежит D");
    }
}
















do {
    System.out.print("Введите y: ");

    try {
        y = in.nextDouble();
        if (y > y_range_max || y < y_range_min) {
            System.out.println("Значение y выходит за рамки ограничения.");
        } else {
            isIncorrect = false;
        }
    } catch (InputMismatchException e) {
        System.out.println("Вы ввели неверный тип данных.");
        in.next();
    }
} while (isIncorrect) 
