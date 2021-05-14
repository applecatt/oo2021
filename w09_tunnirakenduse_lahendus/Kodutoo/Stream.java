public class Stream {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("data.txt"));
            PrintWriter pw = new PrintWriter(new File("data_output.txt"))){
            while (scanner.hasNextLine()){
                pw.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
