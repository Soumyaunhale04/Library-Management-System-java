📘 Library Management System (Java OOP Project)

A simple console-based Library Management System implemented in Java, designed to demonstrate a strong understanding of Object-Oriented Programming (OOP) concepts such as classes, objects, encapsulation, method overriding, and the use of TreeMap for efficient and sorted data storage.

This project is ideal for learning Java fundamentals and showcasing OOP knowledge for internship applications.

🚀 Features

✔ Add new books

✔ Issue books

✔ Return books

✔ Remove books (only if not issued)

✔ Show all books (sorted by ID automatically using TreeMap)

✔ Prevent duplicate book IDs

✔ Clean and reusable OOP architecture

🧠 OOP Concepts Used
1. Classes & Objects

Book → Represents each book

Library → Stores and manages all books

Main → User interface

2. Encapsulation

Private variables (id, title, author, isIssued)

Public getters & controlled methods (issueBook(), returnBook())

3. Data Structure

TreeMap<Integer, Book> → keeps books sorted by ID and gives O(log n) access

4. Method Overriding

Custom toString() for clean output

🛠️ Tech Stack

Java (Core Java + OOP)

TreeMap Collection

Scanner (User Input)

Works on any JDK 8 or above

📂 Project Structure
Library-Management-System-Java/
│
├── Book.java        # Book model class
├── Library.java     # Manages books using TreeMap
└── Main.java        # Menu-driven CLI application

📸 Sample Output
==============================
Library Management System
==============================

1. Add Book
2. Remove Book
3. Issue Book
4. Return Book
5. Show Books
6. Exit
------------------------------

Enter choice: 1
Enter Book id: 101
Enter Title: Java Basics
Enter Author's name: John Doe

Java Basics added successfully!

📖 How to Run
1. Clone the repository
   git clone https://github.com/Soumyaunhale04/Library-Management-System-java

2. Compile
   javac *.java

3. Run
   java Main

👩‍💻 Author

Soumya Unhale
B.Tech CSE | Java Developer | Learning Backend

Feel free to explore or contribute! 🚀