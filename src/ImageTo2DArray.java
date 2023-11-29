import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageTo2DArray {
    public static void main(String[] args) {
        try {
            // Load the image file
            File imageFile = new File("C:\\Users\\Abrar\\eclipse-workspace\\Practice\\src\\img.png");
            BufferedImage image = ImageIO.read(imageFile);

            // Convert the image to a 2D array of numbers
            int width = image.getWidth();
            int height = image.getHeight();
            int[][] pixelArray = new int[height][width];

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int rgb = image.getRGB(x, y);
                    int grayscale = (rgb >> 16) & 0xFF; // Extract the red component (assuming grayscale image)
                    pixelArray[y][x] = grayscale;
                }
            }

            // Print the converted array
            for (int[] row : pixelArray) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
