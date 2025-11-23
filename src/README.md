# **📘 Library Management System**

A simple console-based Library Management System implemented in Java, designed to demonstrate a strong understanding of Object-Oriented Programming (OOP) concepts such as classes, objects, encapsulation, method overriding, and the use of TreeMap for efficient and sorted data storage.

## *🚀 Features*

✔ Add new books

✔ Issue books

✔ Return books

✔ Remove books (only if not issued)

✔ Show all books (sorted by ID automatically using TreeMap)

✔ Prevent duplicate book IDs

✔ Clean and reusable OOP architecture


## *🧠 OOP Concepts Used*
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

## *🛠️ Tech Stack*

1. Java (Core Java + OOP)

2. TreeMap Collection

3. Scanner (User Input)

4. Works on any JDK 8 or above

## *📂 Project Structure*
Library-Management-System/

├── Book.java       

├── Library.java    

└── Main.java      

## *📸 Sample Output*

Library Management System


1. Add Book
2. Remove Book
3. Issue Book
4. Return Book
5. Show Books
6. Exit


Enter choice: 1

Enter Book id: 101

Enter Title: Java Basics

Enter Author's name: Yashwant

Java Basics added successfully!



### ***👩‍💻 Author***

Soumya Unhale
B.Tech CSE | Java Developer | Learning Backend

Feel free to explore or contribute! 🚀
