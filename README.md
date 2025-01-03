# Hangman Game

This is a simple text-based hangman game implemented in Java.

## How to Run the Game

1. Clone the repository:
   ```
   git clone https://github.com/githubnext/workspace-blank.git
   ```
2. Navigate to the project directory:
   ```
   cd workspace-blank
   ```
3. Compile the Java files:
   ```
   javac src/*.java
   ```
4. Run the game:
   ```
   java src.Main
   ```

## Classes and Their Responsibilities

### Main
- The main entry point for the application.
- Instantiates the `Game` class and starts the game.
- Handles any exceptions that may occur during the game.

### Game
- Implements the game logic, including selecting a random word.
- Tracks guessed letters and remaining attempts.
- Determines the game state (win/loss).

### Player
- Manages player input.
- Displays the game state to the user.
- Handles invalid input and prompts the player to try again.

### WordList
- Stores a list of possible words for the game.
- Provides a method to select a random word from the list.

## Credits

This game was created by [Your Name] and GitHub Copilot.
