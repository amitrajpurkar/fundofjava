package unit1GettingStarted.chp05;

import static unit1GettingStarted.Utils.printSeparator;
import static unit1GettingStarted.Utils.printSeparatorWithSpacing;

public class Chapter05 {
    public static void main(String[] args) {
        printSeparator();
        System.out.println("Chapter 5: Using Classes and Objects");
        printSeparator();

        getSummary();
        
    }

    public static void getSummary() {
        printSeparatorWithSpacing();
        System.out.println("Summary");
        System.out.println("""
                1. Object-based programming uses classes, objects, and methods to solve problems\n
                2. A class specifies a set of attributes and methods for the objects of that class\n
                3. A new object is obtained by instantiating its class. An object's attributes receive their initial values during instantiation\n
                4. The behavior of an object depends on its current contents and on the methods that manipulate this state\n
                5. The set of a class’s methods is called its interface. The interface is what a programmer needs to know to use objects of a class. The information in an interface usually includes the method headers and documentation about arguments, return values, and changes of state\n
                6. A class usually includes a toString method that returns a string representation of an object of the class. This string might include information about the object's current contents. Java's print and println methods automatically call this method when they receive an object as a parameter\n
                7. Digital images are captured by sampling analog information from a light source, using a device such as a digital camera or a flatbed scanner. Each sampled color value is mapped to a discrete color value among those supported by the given color system\n
                8. During the display of an image file, each color value is mapped onto a pixel in a two-dimensional grid. The positions in this grid correspond to the screen coordinate system, in which the upper-left corner is at (0, 0) and the lower-right corner is at (width - 1, height - 1)
                9. An enhanced for loop structure is used to visit each pixel in an image
                10. A nested loop structure is used to visit each position in a two-dimensional grid. In a row-major traversal, the outer loop of this structure moves down the rows using the y-coordinate, and the inner loop moves across the columns using the x-coordinate. Each column in a row is visited before moving to the next row. A column-major traversal reverses these settings\n
                11. Image-manipulation algorithms either transform pixels at given positions or create a new image using the pixel information of a source image. Examples of the former type of operation are conversion to black and white and conversion to gray scale. Blurring, edge detection, and altering the image size are examples of the second type of operation\n
                12. Digital sound clips are captured by sampling analog information from a sound source, using a device such as a microphone. Each sampled sound value is mapped to a discrete sound value among those supported by the given sound system\n
                13. Sound-manipulation algorithms either transform samples at given positions or create a new sound clip using the sample information of a source clip. An example of the former type of operation is adjusting the volume. Echoing and composing sound clips size are examples of the second type of operation\n
                """);
        printSeparator();
        keyTerms();
    }

    public static void keyTerms(){
        System.out.println("KEY TERMS");
        System.out.println("""
            Accessors -- a method that returns the value of a private attribute
            Application Programming Interface (API) -- a set of methods that provides a public interface to a class
            Aspect ratio -- the ratio of the width to the height of an image
            Default constructor -- a constructor that has no parameters
            Edge detection -- the process of detecting the edges of an image
            Enhanced for loop -- a loop that uses a variable to control the iteration of a collection or list
            Mutators -- a method that changes the value of a private attribute
            Object instantiation -- the process of creating a new object of a class
            Object recognition -- the process of determining the class of an object
            Row-major traversal -- a traversal that moves down the rows using the y-coordinate, 
                and the inner loop moves across the columns using the x-coordinate. 
                Each column in a row is visited before moving to the next row
            Sampling rate -- the number of samples per second
            Screen coordinate system -- a two-dimensional grid in which the upper-left corner is at (0, 0) 
                and the lower-right corner is at (width - 1, height - 1)
            Sound clip -- a sequence of sampled sound values
            Splicing -- the process of creating a new sound clip using the sample information of a source clip
        """);
        printSeparator();
    }
}
