# Hangman Game - Java Console Application 🎮

This project is a classic **Hangman** game implemented as a Java console application. Players try to guess hidden words, track their scores, and can add new words to the game.

---

## 🚀 Features

- Add custom words (with validation rules)
- Play a new game:
  - Guess randomly selected words letter by letter
  - Limited number of attempts
  - Prevent guessing the same letter twice
- View score history
- User-friendly console-based menu

---

## 📋 Rules

- Words must be at least **4 characters long**
- **Numbers are not allowed** in the words
- Duplicate words cannot be added
- Previously guessed letters cannot be entered again

---

## 🧠 Menu Options

When the console starts, the following menu will appear:

- `a`: Add new word(s)
- `n`: Start a new game
- `s`: Show scores
- `e`: Exit the program

---

## 💡 How to Play

1. First, add new words to the game using `a`.
2. Then start a new game using `n`.
3. Each incorrect letter guess reduces your remaining attempts.
4. Guess all the letters correctly to win the game.
5. You earn **10 points** for each game you win.

---

## 🛠️ Developer Notes

### Java Structures Used:
- `ArrayList` – used to store words, guesses, and scores
- `Scanner` – used to get input from the user
- `Random` – used to select a random word

### Key Methods:
- `DigitControl()` – checks if the input contains any digit
- `Duplicate()` – checks for duplicate words
- `UserGuess()` – handles user letter guesses
- `Score()` – displays game scores
- `DE()` – checks if a letter was guessed before

---

## 📦 How to Run

This is a **Java console application**. To compile and run:

1. Compile the file using:  
   `javac HangmanGame.java`
2. Run the program using:  
   `java HangmanGame`

---

## 🧑‍💻 Author

**Betül Bilhan**

GitHub: [@betulbilhan](https://github.com/betulbilhan)

---

