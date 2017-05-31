# Week 2 Jets Project

## Emperial Command

This project will populate a menu to the user which prompts them to make a selection.
Each selection will show the appropriate information fo that selection. 

## User Story
1. List current Fighters in the fleet
2. View current list of Fighters in order of fastest to slowest.
3. View current list of Fighters in order of longest range to lowest range.
4. Add a Fighter to the current list. You can check to see if the Fighter was added by selecting `1`.

## Instructions 
1. User arrives to the docking station.
2. User is promted with a menu and asked to select an option that corresponds to the user story.
## Example
#### Sorting based on speed.
```
// Sorting list based on speed	
	public void sortSpeed() {
		TieFighter[] temp = new TieFighter[fighter.length];
		for (int i = 0; i < fighter.length; i++) {
			temp[i] = fighter[i];
		}

		TieFighter e = null;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				for (int j = i; j > 0; j--) {
					if (temp[j - 1].getSpeed() < temp[j].getSpeed()) {
						e = temp[j - 1];
						temp[j - 1] = temp[j];
						temp[j] = e;
					}
				}
			}
		}

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				System.out.println(temp[i].getModel() + " / "  + "Mach:" + temp[i].getSpeed());
			}
		}

	}
```
#### Breakdown
1. The fighters had to be seprerated, indiviually. The for loop through the array list of TieFigheters allowed me to extract each TieFighter at each index and store them to a temporay value named "temp" For simplicity the array list had 5 different TieFighters.

2. Iterating over the temporary list of fighters allowed me to search for the TieFighter with the fastest speed. If the TieFighters speed at the current position "temp[j].getspeed()" was greater than the TieFighter which came before it, then we set the slower TieFighter into the list first, putting it at the farthest index of the list, index[4].

3. Lastly I printed out to the order of fastest to slowest to the screen.

## Refelection
The week two project focused on concepts such as abstraction, encapsulation, inheritance and polymorphism. As well as , implementing Object-Oriented concepts using Java features such as classes and interfaces. At first, my comprehension of OO concepts was minimal at best, but through this project I was able to connect the dots and see how inheritance and encapsulation worked. 
