package service;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;
import entities.animal_entities.Herbivore;

public class ForestNoteBook {
	private List<Carnivore> carnivores = new LinkedList<Carnivore>();
	private List<Omnivore> omnivores = new LinkedList<Omnivore>();
	private List<Herbivore> herbivores = new LinkedList<Herbivore>();
	private int plantCount;
	private int animalCount;
	private List<Animal> animals = new LinkedList<Animal>();
	private List<Plant> plants = new LinkedList<Plant>();

	public ForestNoteBook() {
		plantCount = 0;
		animalCount = 0;
	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		// remove animals who are carnivores from animals list
		animals.removeAll(carnivores);
		// set with the new carnivores list
		this.carnivores.clear();
		this.carnivores.addAll(carnivores);
		// TODO check for duplicates in this.carnivores
		// add new carnivores to animals list
		animals.addAll(carnivores);
		// maintain animalCount
		animalCount = animals.size();
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		// remove animals who are omnivores from animals list
		animals.removeAll(omnivores);
		// set with the new omnivores list
		this.omnivores.clear();
		this.omnivores.addAll(omnivores);
		// TODO check for duplicates in omnivores
		// add new omnivores to animals list
		animals.addAll(omnivores);
		// maintain animalCount
		animalCount = animals.size();
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		// remove animals who are herbivores from animals list
		animals.removeAll(herbivores);
		// set with the new herbivores list
		this.herbivores.clear();
		this.herbivores.addAll(herbivores);
		// TODO check for duplicates in herbivores
		// add new herbivores to animals list
		animals.addAll(herbivores);
		// maintain animalCount
		animalCount = animals.size();
	}

	//TODO i would've rather do the incrementation here in the getters
	public int getPlantCount() {
		return plantCount;
	}

	public int getAnimalCount() {
		return animalCount;
	}

	public void addAnimal(Animal animal) {
		// check for duplicates
		if (animals.stream().anyMatch(a -> a.getName().equals(animal.getName()))) {
			return;
		}
		if (animals.add(animal)) {
			// increase animalCount if addition is successful
			animalCount++;
			// put animal in its corresponding list, according to its class
			if (animal instanceof Carnivore) {
				carnivores.add((Carnivore) animal);
			} else if (animal instanceof Omnivore) {
				omnivores.add((Omnivore) animal);

			} else if (animal instanceof Herbivore) {
				herbivores.add((Herbivore) animal);
			}
		}
	}

	public void addPlant(Plant plant) {
		// check for duplicates
		if (plants.stream().anyMatch(p -> p.getName().equals(plant.getName()))) {
			return;
		}
		if (plants.add(plant)) {
			// increase plantCount if addition is successful
			plantCount++;
		}
	}

	public void printNotebook() {
		System.out.println("Forest notebook contains:");
		System.out.println("" + getPlantCount() + " plants:");
		plants.forEach(System.out::println);
		System.out.println("" + getAnimalCount() + " animals:");
		animals.forEach(System.out::println);
		System.out.println("End of forest notebook contents.");
	}

	//TODO you could also optimize it by using Comparator.comparing
	// animals.sort(Comparator.comparing(animal -> animal.getName()));
	public void sortAnimalsByName() {
		animals.sort(new Comparator<Animal>() {
			@Override
			public int compare(Animal a1, Animal a2) {
				if (a1 == null || a2 == null) {
					return 0;
				}
				return a1.getName().compareTo(a2.getName());
			}
		});
	}

	public void sortPlantsByName() {
		plants.sort(new Comparator<Plant>() {
			@Override
			public int compare(Plant p1, Plant p2) {
				if (p1 == null || p2 == null) {
					return 0;
				}
				return p1.getName().compareTo(p2.getName());
			}
		});
	}
}
