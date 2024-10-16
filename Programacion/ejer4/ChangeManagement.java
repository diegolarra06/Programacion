public class ChangeManagement {
    public static void main(String[] args) {
        ChangeMethod method1 = new ChangeMethod();
        
        method1.name = "Kotter's 8 Steps";
        method1.author = "John Kotter";
        method1.description = "Steps to change an organization";
        
        System.out.println("Method: " + method1.name);
        System.out.println("Author: " + method1.author);
        System.out.println("Description: " + method1.description);
        
        method1.showSteps();
    }
}

class ChangeMethod {
    String name;
    String author;
    String description;
    
    void showSteps() {
        System.out.println("Important Steps:");
        System.out.println("1. Create a sense of urgency");
        System.out.println("2. Form a guiding coalition");
        System.out.println("3. Create a vision for change");
        System.out.println("3. Empowering workers or removing barriers to change");
        // ... more steps can be added here
    }
}