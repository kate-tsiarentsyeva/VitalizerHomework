package collections;
import java.util.*;

public class CollectionEx {

    public static void main(String[] args) {

        List<String> listOfAnimals = new ArrayList<String>();
        listOfAnimals.add("Cat");
        listOfAnimals.add("Dog");
        listOfAnimals.add(0, "Monkey");
        listOfAnimals.add("Cow");
        listOfAnimals.add(3,"Bear");
        listOfAnimals.add(2,"Mouse");
        listOfAnimals.add("Wolf");

        System.out.println(listOfAnimals.get(3));
        System.out.println(listOfAnimals.size());

        String animal = "";
        for (int i = 0; i < listOfAnimals.size(); i++) {
            animal = animal + listOfAnimals.get(i) + " ";
        }
        System.out.println("All animals: " + animal);

        LinkedList<String> petsList = new LinkedList<String>();
        petsList.add("Bob");
        petsList.add("Cherry");
        petsList.add("Tommy");
        petsList.add("Bunny");
        petsList.add("Flash");
        petsList.addLast("Lizzy");
        petsList.addFirst("Yale");

        System.out.println("Pets names are: " + petsList);
        petsList.remove("Flash");
        String val = petsList.get(3);
        petsList.set(3, val + "AnotherName");
        System.out.println("List after change: " + petsList);

        Map<Integer,String> pupils = new HashMap<Integer,String>();
        pupils.put(4, "Jane");
        pupils.put(1, "Bob");
        pupils.put(2, "Martin");
        pupils.put(3, "Julie");

        String first = pupils.get(2);
        System.out.println(first);

        Set<Integer> keys = pupils.keySet();
        Collection<String> values = pupils.values();
        pupils.replace(1, "Billy");
        pupils.remove(2);
        String name = pupils.get(3);
        pupils.put(5, name);
        Set<Map.Entry<Integer, String>> set = pupils.entrySet();

        for (Map.Entry<Integer, String> pupil : set) {
            System.out.print(pupil.getKey() + ": ");
            System.out.println(pupil.getValue());
        }

        HashSet<String> names = new HashSet<String>();

        names.add("Robert");
        names.add("Lily");
        names.add("Barny");
        names.add("Paul");
        names.add("Tom");

        boolean isAdded = names.add("Lily");
        System.out.println(isAdded);

        System.out.printf("Set contains" + names.size() + " elements.");

        for(String person : names){

            System.out.println(person);
        }
    }
}
