import java.awt.Color;
import java.util.ArrayList;
import java.awt.Point;

public class Steganography {
    public static void clearLow(Pixel p) {
        p.setColor(new Color(p.getRed() / 4 * 4, p.getGreen() / 4 * 4, p.getBlue() / 4 * 4));
    }

    public static Picture testClearLow(Picture p) {
        Pixel[][] pixels = p.getPixels2D();
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[r].length; c++) {
                clearLow(pixels[r][c]);
            }
        }
        return p;
    }

    public static void setLow(Pixel p, Color c) {
        int colorR = c.getRed() / 64;
        int colorG = c.getGreen() / 64;
        int colorB = c.getBlue() / 64;

        int pixelR = p.getRed() / 4 * 4;
        int pixelG = p.getGreen() / 4 * 4;
        int pixelB = p.getBlue() / 4 * 4;

        p.setColor(new Color(colorR + pixelR, colorG + pixelG, colorB + pixelB));
    }

    public static Picture testSetLow(Picture p, Color color) {
        Pixel[][] pixels = p.getPixels2D();
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[r].length; c++) {
                setLow(pixels[r][c], color);
            }
        }
        return p;
    }

    public static Picture revealPicture(Picture hidden) {
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        Pixel[][] source = hidden.getPixels2D();
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[r].length; c++) {
                pixels[r][c].setColor(new Color(
                                        (source[r][c].getRed() % 4) * 64,
                                        (source[r][c].getGreen() % 4) * 64, 
                                        (source[r][c].getBlue() % 4) * 64));
            }
        }

        return copy;
    }

    /**
     * Determines whether secret can be hidden in source, which is
     * true if source and secret are the same dimensions.
     * @param source is not null
     * @param secret is not null
     * @return true if secret can be hidden in source, false otherwise.
     */
    public static boolean canHide(Picture source, Picture secret) {
        return (source.getPixels2D().length >= secret.getPixels2D().length) && 
               (source.getPixels2D()[0].length >= secret.getPixels2D()[0].length);
    }

    /**
     * Creates a new Picture with data from secret hidden in data from source
     * @param source is not null
     * @param secret is not null
     * @return combined Picture with secret hidden in source
     * precondition: source is same width and height as secret
     */
    public static Picture hidePicture(Picture source, Picture secret) {
        Picture newPic = new Picture(source);
        Pixel[][] sourcePixels = newPic.getPixels2D();
        Pixel[][] secretPixels = secret.getPixels2D();
        for(int r = 0; r < secretPixels.length; r++) {
            for(int c = 0; c < secretPixels[r].length; c++) {
                setLow(sourcePixels[r][c], secretPixels[r][c].getColor());
            }
        }
        return newPic;
    }

    public static Picture hidePicture(Picture source, Picture secret, int startRow, int startColumn) {
        Picture newPic = new Picture(source);
        Pixel[][] sourcePixels = newPic.getPixels2D();
        Pixel[][] secretPixels = secret.getPixels2D();
        for(int r = 0; r < secretPixels.length; r++) {
            for(int c = 0; c < secretPixels[r].length; c++) {
                setLow(sourcePixels[r+startRow][c+startColumn], secretPixels[r][c].getColor());
            }
        }
        return newPic;
    }

    public static boolean isSame(Picture p1, Picture p2) {
        Pixel[][] p1Pixels = p1.getPixels2D();
        Pixel[][] p2Pixels = p2.getPixels2D();
        for(int r = 0; r < p1Pixels.length; r++) {
            for(int c = 0; c < p1Pixels[r].length; c++) {
                if(!p1Pixels[r][c].getColor().equals(p2Pixels[r][c].getColor())) return false;
            }
        }
        return true;
    }

    public static ArrayList<Point> findDifferences(Picture p1, Picture p2) {
        ArrayList<Point> points = new ArrayList<Point>();
        Pixel[][] p1Pixels = p1.getPixels2D();
        Pixel[][] p2Pixels = p2.getPixels2D();
        if((p1Pixels.length != p2Pixels.length) || (p1Pixels[0].length != p2Pixels[0].length)) {
            return points;
        }
        for(int r = 0; r < p1Pixels.length; r++) {
            for(int c = 0; c < p1Pixels[r].length; c++) {
                if(!p1Pixels[r][c].getColor().equals(p2Pixels[r][c].getColor())) {
                    points.add(new Point(r, c));
                }
            }
        }
        return points;
    }

    public static Picture showDifferentArea(Picture picture, ArrayList<Point> points) {
        Picture pic = new Picture(picture);
        Pixel[][] pixels = pic.getPixels2D();
        int leftPoint = Integer.MAX_VALUE, rightPoint = 0, topPoint = Integer.MAX_VALUE, bottomPoint = 0;
        for(Point item : points) {
            leftPoint = Math.min(leftPoint, (int)item.getY());
            rightPoint = Math.max(rightPoint, (int)item.getY());
            topPoint = Math.min(topPoint, (int)item.getX());
            bottomPoint = Math.max(bottomPoint, (int)item.getX());
        }
        System.out.println(leftPoint + " " + rightPoint + " " + topPoint + " " + bottomPoint);
        for(int i = leftPoint; i <= rightPoint; i++) {
            pixels[topPoint][i].setColor(new Color(255, 0, 0));
            pixels[bottomPoint][i].setColor(new Color(255, 0, 0));
        }
        for(int i = topPoint; i <= bottomPoint; i++) {
            pixels[i][leftPoint].setColor(new Color(255, 0, 0));
            pixels[i][rightPoint].setColor(new Color(255, 0, 0));
        }
        return pic;
    }

    public static void main(String[] args) {
        // Picture source = new Picture("beach.jpg");
        // Picture secret = new Picture("temple.jpg");
        // if(canHide(source, secret)) {
        //     Picture newPic = hidePicture(source, secret);
        //     newPic.explore();
        //     Picture revealedPic = revealPicture(newPic);
        //     revealedPic.explore();
        // }
        // Picture beach = new Picture("beach.jpg");
        // Picture robot = new Picture("robot.jpg");
        // Picture flower1 = new Picture("flower1.jpg");
        // beach.explore();
        // // these lines hide 2 pictures
        // Picture hidden1 = hidePicture(beach, robot, 65, 208);
        // Picture hidden2 = hidePicture(hidden1, flower1, 280, 110);
        // hidden2.explore();
        // Picture unhidden = revealPicture(hidden2);
        // unhidden.explore();

        // Picture swan = new Picture("swan.jpg");
        // Picture swan2 = new Picture("swan.jpg");
        // System.out.println("Swan and swan2 are the same: " +
        // isSame(swan, swan2));
        // swan = testClearLow(swan);
        // System.out.println("Swan and swan2 are the same (after clearLow run on swan): "
        // + isSame(swan, swan2));

        // Picture arch = new Picture("arch.jpg");
        // Picture arch2 = new Picture("arch.jpg");
        // Picture koala = new Picture("koala.jpg") ;
        // Picture robot1 = new Picture("robot.jpg");
        // ArrayList<Point> pointList = findDifferences(arch, robot1);
        // System.out.println("PointList after comparing two identical s pictures " +
        // "has a size of " + pointList.size());
        // pointList = findDifferences(arch, koala);
        // System.out.println("PointList after comparing two different sized pictur t es " +
        // "has a size of " + pointList.size());
        // Picture arch2 = hidePicture(arch, robot1, 65, 102);
        // pointList = findDifferences(arch, arch2);
        // System.out.println("Pointlist after hiding a picture has a siz m e of"
        // + pointList.size());
        // arch.show();
        // arch2.show();

        Picture hall = new Picture("femaleLionAndHall.jpg");
        Picture robot2 = new Picture("robot.jpg");
        Picture flower2 = new Picture("flower1.jpg");
        // hide pictures
        Picture hall2 = hidePicture(hall, robot2, 50, 300);
        Picture hall3 = hidePicture(hall2, flower2, 115, 275);
        hall3.explore();
        if(!isSame(hall, hall3))
        {
            Picture hall4 = showDifferentArea(hall, findDifferences(hall, hall3));
            hall4.show();
            Picture unhiddenHall3 = revealPicture(hall3);
            unhiddenHall3.show();
        } 
    }
}