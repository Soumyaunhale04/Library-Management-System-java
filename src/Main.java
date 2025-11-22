import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        boolean online = true;
        while(online){
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show Books");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter Book id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("\nEnter Title: ");
                    String title = input.nextLine();;

                    System.out.print("\nEnter Author's name: ");
                    String author = input.nextLine();

                    library.addBook(new Book(id, author, title));
                    break;
                case 2:
                    System.out.print("\nEnter Book id to remove: ");
                    library.removeBook(input.nextInt());
                    break;
                case 3:
                    System.out.print("\nEnter Book id to issue: ");
                    library.issueBook(input.nextInt());
                    break;
                case 4:
                    System.out.print("\nEnter Book id to return: ");
                    library.returnBook(input.nextInt());
                    break;
                case 5:
                    library.showBooks();
                    break;
                case 6:
                    online = false;
                    break;
                default:
                    System.out.print("\nInvalid Choice!");
            }
        }
    }
}