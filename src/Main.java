public class Main {
    public static void main(String[] args) {
        try {
            Game game = new Game();
            game.start();
        } catch (NullPointerException e) {
            System.err.println("A null pointer exception occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("An array index out of bounds exception occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Game has ended.");
        }
    }
}
