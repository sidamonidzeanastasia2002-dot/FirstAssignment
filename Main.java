public class Main {
    public static void main(String[] args) {

        // ამოცანა N1
        System.out.println("--- ამოცანა 1 ---");
        double price = 120;
        if (price >= 100) {
            price = price - price * 0.10;
        }
        System.out.println("საბოლოო ფასი: " + price);

        // N2
        System.out.println("--- ამოცანა 2 ---");
        String correctUsername = "admin";
        String correctPassword = "1234";
        String username = "admin";
        String password = "1234";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }

        // N3
        System.out.println("--- ამოცანა 3 ---");
        int[] testResults = {1, 0, 1, 1, 0};
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] == 1) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

        // N4- შეკვეთის სტატუსი
        System.out.println("--- ამოცანა 4 ---");
        String status = "SHIPPED";

        switch (status) {
            case "NEW":
                System.out.println("Order received");
                break;
            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;
            case "SHIPPED":
                System.out.println("Order is on the way");
                break;
            case "DELIVERED":
                System.out.println("Order delivered");
                break;
            default:
                System.out.println("Unknown status");
        }

        // N5: სტრინგი
        System.out.println("--- ამოცანა 5 ---");
        String text = "გამარჯობა";
        String vowels = "აეიოუ";
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("ხმოვნების რაოდენობა: " + vowelCount);
        System.out.println("სიგრძე: " + text.length());

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }
}