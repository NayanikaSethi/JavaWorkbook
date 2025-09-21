import java.util.Scanner;
class Box {
    private float width, height, depth;

    
    Box() {
        width = height = depth = 0;
    }

    
    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    
    Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }

    
    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

    
    public float volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    private float weight;

    
    BoxWeight() {
        super();
        weight = 0;
    }

    
    BoxWeight(float w, float h, float d, float weight) {
        super(w, h, d);
        this.weight = weight;
    }

    
    BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;
    }

    
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    
    public void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

public class BoxWeightDemo {
    public static void main(String[] args) {
        
        System.out.println("Nayanika Sethi 24csu137");
        BoxWeight bw1 = new BoxWeight(2, 3, 4, 5);
        System.out.println("Volume: " + bw1.volume());
        bw1.displayWeight();

        
        BoxWeight bw2 = new BoxWeight(bw1);
        System.out.println("Copied Volume: " + bw2.volume());
        bw2.displayWeight();

        
        BoxWeight bw3 = new BoxWeight();
        bw3.setWidth(5);
        bw3.setHeight(5);
        bw3.setDepth(5);
        bw3.setWeight(10);
        System.out.println("Set Volume: " + bw3.volume());
        bw3.displayWeight();
    }
}