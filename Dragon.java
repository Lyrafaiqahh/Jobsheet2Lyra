public class Dragon {
    int x, y; 
    int width, height; 

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    
    void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    
    void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

   
    void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

   
    void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    
    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    }

  
    void detectCollision() {
        System.out.println("Game Over");
       
    }

    public static void main(String[] args) {
        Dragon dragon = new Dragon(0, 0, 10, 10); // Inisialisasi dragon dengan posisi (0,0) dan area permainan 10x10
        dragon.moveRight(); 
        dragon.printPosition(); //
    }
}
