public class Lab8Q3 {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Calling the location() and famousFor() methods on the superclass objects
        System.out.println("Details of Manali:");
        manali.location();
        manali.famousFor();

        System.out.println("\nDetails of Mussoorie:");
        mussoorie.location();
        mussoorie.famousFor();

        System.out.println("\nDetails of Gulmarg:");
        gulmarg.location();
        gulmarg.famousFor();
    }
}