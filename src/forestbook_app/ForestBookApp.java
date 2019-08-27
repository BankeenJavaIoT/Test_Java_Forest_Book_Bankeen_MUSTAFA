package forestbook_app;

import java.util.HashSet;
import java.util.Set;

import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Bush;
import entities.plant_entities.Flower;
import entities.plant_entities.LeafType;
import entities.plant_entities.Plant;
import entities.plant_entities.Scent;
import entities.plant_entities.Tree;
import entities.plant_entities.Weed;
import service.ForestNoteBook;

public class ForestBookApp {

	public static void main(String[] args) {
		ForestNoteBook forestObserverBook = new ForestNoteBook();
		addVariousForestElementsToForestNotebook(forestObserverBook);
		printForestNotebookContents(forestObserverBook);
	}

	private static void printForestNotebookContents(ForestNoteBook forestObserverBook) {
		System.out.println("The number of animals in the forest notebook: " + forestObserverBook.getAnimalCount());
		System.out.println("The number of plants in the forest notebook: " + forestObserverBook.getPlantCount());

		System.out.println("==========================================================");
		System.out.println("Printing the forest notebook in standard fashion, without sorting");
		forestObserverBook.printNotebook();
		System.out.println("==========================================================");

		System.out.println();
		System.out.println("Printing all carnivores in the forest notebook");
		forestObserverBook.getCarnivores().forEach(System.out::println);
		System.out.println();
		System.out.println("Printing all omnivores in the forest notebook");
		forestObserverBook.getOmnivores().forEach(System.out::println);
		System.out.println();
		System.out.println("Printing all herbivores in the forest notebook");
		forestObserverBook.getHerbivores().forEach(System.out::println);
		System.out.println();

		forestObserverBook.sortAnimalsByName();
		forestObserverBook.sortPlantsByName();

		System.out.println("==========================================================");
		System.out.println("Printing the forest notebook in standard fashion, after sorting");
		forestObserverBook.printNotebook();
		System.out.println("==========================================================");
	}

	private static void addVariousForestElementsToForestNotebook(ForestNoteBook forestObserverBook) {
		Tree plant1 = new Tree("Oak tree", 12.40);
		plant1.setLeafType(LeafType.HAND);
		Tree plant2 = new Tree("Chestnut tree", 8.70);
		plant2.setLeafType(LeafType.SPEAR);
		Bush plant3 = new Bush("Strawberry bush", 1.10);
		plant3.setFruit("Strawberry");
		plant3.setLeafType(LeafType.HEART);
		Flower plant4 = new Flower("Daisy flower", 0.30);
		plant4.setSmell(Scent.SWEET);
		Weed plant5 = new Weed("Rocket cress", 0.22);
		plant5.setArea(2.3);

		Herbivore animal1 = new Herbivore("Rabbit", 2.250, 0.25, 0.42);
		Set<Plant> plantDiet1 = new HashSet<Plant>();
		plantDiet1.add(plant4);
		plantDiet1.add(plant5);
		animal1.setPlantDiet(plantDiet1);
		Herbivore animal2 = new Herbivore("Deer", 75.000, 1.65, 1.40);
		Set<Plant> plantDiet2 = new HashSet<Plant>();
		plantDiet2.add(plant3);
		plantDiet2.add(plant4);
		plantDiet2.add(plant5);
		animal2.setPlantDiet(plantDiet2);
		Herbivore animal3 = new Herbivore("Grasshopper", 0.080, 0.04, 0.08);
		Set<Plant> plantDiet3 = new HashSet<Plant>();
		plantDiet3.add(plant5);
		animal3.setPlantDiet(plantDiet3);

		Carnivore animal4 = new Carnivore("Eagle", 1.800, 0.28, 0.32);
		animal4.setMaxFoodSize(0.40);
		Carnivore animal5 = new Carnivore("Snake", 0.980, 0.04, 0.78);
		animal5.setMaxFoodSize(0.15);
		Carnivore animal6 = new Carnivore("Spider", 0.005, 0.01, 0.03);
		animal6.setMaxFoodSize(0.05);

		Omnivore animal7 = new Omnivore("Bear", 250.000, 1.65, 1.75);
		Set<Plant> plantDiet7 = new HashSet<Plant>();
		plantDiet7.add(plant3);
		animal7.setPlantDiet(plantDiet7);
		animal7.setMaxFoodSize(2.00);
		Omnivore animal8 = new Omnivore("Fox", 28.000, 0.55, 0.72);
		Set<Plant> plantDiet8 = new HashSet<Plant>();
		plantDiet8.add(plant3);
		animal8.setPlantDiet(plantDiet7);
		animal8.setMaxFoodSize(0.35);
		Omnivore animal9 = new Omnivore("Ant", 0.003, 0.003, 0.008);
		Set<Plant> plantDiet9 = new HashSet<Plant>();
		plantDiet9.add(plant1);
		plantDiet9.add(plant2);
		animal9.setPlantDiet(plantDiet9);
		animal9.setMaxFoodSize(0.02);

		forestObserverBook.addPlant(plant1);
		forestObserverBook.addPlant(plant2);
		forestObserverBook.addPlant(plant3);
		forestObserverBook.addPlant(plant4);
		forestObserverBook.addPlant(plant5);

		forestObserverBook.addAnimal(animal1);
		forestObserverBook.addAnimal(animal2);
		forestObserverBook.addAnimal(animal3);
		forestObserverBook.addAnimal(animal4);
		forestObserverBook.addAnimal(animal5);
		forestObserverBook.addAnimal(animal6);
		forestObserverBook.addAnimal(animal7);
		forestObserverBook.addAnimal(animal8);
		forestObserverBook.addAnimal(animal9);
	}

}
