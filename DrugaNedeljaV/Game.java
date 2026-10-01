package DrugaNedeljaV;
class Player {
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;

    public Player(int x, int y, int width, int height, int health) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        setHealth(health);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getHealth() {
        return health;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }
}


class Enemy {
    private int x;
    private int y;
    private int width;
    private int height;
    private int damage;

    
    public Enemy(int x, int y, int width, int height, int damage) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        setDamage(damage);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDamage() {
        return damage;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            this.damage = 0;
        } else if (damage > 100) {
            this.damage = 100;
        } else {
            this.damage = damage;
        }
    }
}
public class Game {
    public static boolean checkCollision(Player p, Enemy e) {

        return p.getX() < e.getX() + e.getWidth()
                && p.getX() + p.getWidth() > e.getX()
                && p.getY() < e.getY() + e.getHeight()
                && p.getY() + p.getHeight() > e.getY();
    }

    public static void decreaseHealth(Player p, Enemy e) {
        int newHealth = p.getHealth() - e.getDamage();

        if (newHealth < 0) {
            newHealth = 0;
        }

        p.setHealth(newHealth);
    }


    public static void main(String[] args) {

        Player player = new Player(10, 10, 50, 50, 100);

        Enemy enemy1 = new Enemy(30, 30, 40, 40, 20);
        Enemy enemy2 = new Enemy(100, 100, 30, 30, 50);

        System.out.println("Health prije sudara sa enemy1: "
                + player.getHealth());

        if (checkCollision(player, enemy1)) {
            System.out.println("Player i enemy1 su se sudarili!");

            decreaseHealth(player, enemy1);

            System.out.println("Health nakon sudara: "
                    + player.getHealth());
        } else {
            System.out.println("Player i enemy1 se nisu sudarili.");
        }

        System.out.println("\nHealth prije sudara sa enemy2: "
                + player.getHealth());

        if (checkCollision(player, enemy2)) {
            System.out.println("Player i enemy2 su se sudarili!");

            decreaseHealth(player, enemy2);

            System.out.println("Health nakon sudara: "
                    + player.getHealth());
        } else {
            System.out.println("Player i enemy2 se nisu sudarili.");
        }
    }
}
