import java.awt.Rectangle;
import java.io.IOException;
import Cropping.Cropp;


public class Tester {
    public static void main(String[] args) throws IOException {
        String sourcePath = "src/main/images/sample.jpg";

        String destinationPath = "src/main/images/cropped.jpg";

        // cropping dimensions
        Rectangle croppingDimensions = new Rectangle(0, 0, 200, 200);

        // use the library
        Cropp cropper = new Cropp(sourcePath, destinationPath, croppingDimensions);

        // crop the image
         cropper.cropImage();

        System.out.println("Finished");


    }
}
