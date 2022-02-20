package task24.task2413;

/**
 * Класс холст для отрисовки
 */
public class Canvas {
    //ширина и высота
    private int width;
    private int height;
    //матрица, где рисуем. символ - это цвет
    private char[][] martix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.martix = new char[height + 2][width + 2];
    }

    /**
     * Очищаем холст
     */
    void clear() {
        this.martix = new char[height + 2][width + 2];
    }

    /**
     * Печатаем переданную фигуру в указанных координатах цветом с.
     * Если переданный массив содержит единицы, то на холсте им будет соответствовать символ с.
     */
    void drawMatrix(double x, double y, int[][] matrix, char c) {
        int height = matrix.length;
        int width = matrix[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == 1)
                    setPoint(x + j, y + i, c);
            }
        }
    }

    /**
     * Ставим одну точку на холсте с координатами (x, y) и цветом с
     */
    void setPoint(double x, double y, char c) {
        int x0 = (int) Math.round(x);
        int y0 = (int) Math.round(y);
        if (y0 < 0 || y0 >= martix.length) return;
        if (x0 < 0 || x0 >= martix[y0].length) return;

        martix[y0][x0] = c;
    }

    /**
     * Печатаем содержимое холста на экран
     */
    void print() {
        System.out.println();

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                System.out.print(" ");
                System.out.print(martix[i][j]);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMartix() {
        return martix;
    }
}