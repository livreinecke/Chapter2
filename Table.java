
/**
 * Write a description of class Table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table
{
    
    public static void main() {
        makeTable();
    }
    
    public static void makeTable() {
        makeHeader();
        labelColumns();
        populateRows();
    }
    
    public static void makeHeader() {
        System.out.println("-------------------------------------");
        System.out.println("==          Student Points         ==");
        System.out.println("-------------------------------------");
    }
    
    public static void labelColumns() {
        System.out.println("Name\t\t Lab\t Bonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
    }
    
    public static void populateRows() {
        populateOneRow("Joe", 40, 7);
        populateOneRow("William", 50, 8);
        populateOneRow("Mary Sue", 39, 10);
    }
    
    public static void populateOneRow(String name, int lab, int bonus) {
        if(name.length() > 7) {
            System.out.println(name + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
        }
        else {
        System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    }
    }

        
}
