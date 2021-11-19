import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	String nama, gender;
	int umur;
	
	public Main() {
		User user = null;
		// TODO Auto-generated constructor stub
		
		
		boolean valid;
		do {
			valid = true;
			System.out.print("Input Nama anda : ");
			nama = sc.nextLine();
			System.out.print("Masukan Gender \"Male\" or \"Female\" : ");
			gender = sc.nextLine();
			System.out.print("Masukan umur anda minim 13 Tahun : ");
			umur = sc.nextInt(); sc.nextLine();
			try {
				user = new User(nama, gender, umur);
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				valid = false;
				System.out.println("Please obey the condition above!!");
			} 
		} while (!valid);
		
		System.out.println("\nSelamat datang " + user.getNama());
		
		int choose = 0;
		do {
			System.out.println("1. Profile");
			System.out.println("2. Battle");
			System.out.println("3. Exit");
			
			choose = sc.nextInt(); sc.nextLine();
			switch (choose) {
			case 1:
				System.out.println("Hallo, your name is " + user.getNama());
				System.out.println("Gender anda adalah " + user.getGender());
				System.out.println("Umur anda adalah " + user.getUmur());
				System.out.println("Press enter to continue");
				sc.nextLine();
				break;

			case 2:
				int choosepokemon;
				Vector<pokemon> pokemon = new Vector<pokemon>();
				pokemon.add(new Charmander());
				pokemon.add(new Squirtle());
				pokemon.add(new Bulbasaur());
				pokemon.add(new Pikachu());
				
				for (int i = 0; i < pokemon.size(); i++) {
					System.out.println((i+1) + ". " + pokemon.get(i).getNamapokemon());
				}
				System.out.println("choose your pokemon");
				choosepokemon = (sc.nextInt() - 1); sc.nextLine();
				
				pokemon pokemonuser;
				pokemon pokemonenemy;
				
				if (pokemon.get(choosepokemon) instanceof Charmander) {
					pokemonuser = (Charmander) pokemon.get(choosepokemon);
				} else if (pokemon.get(choosepokemon) instanceof Squirtle) {
					pokemonuser = (Squirtle) pokemon.get(choosepokemon);
				} else if (pokemon.get(choosepokemon) instanceof Bulbasaur) {
					pokemonuser = (Bulbasaur) pokemon.get(choosepokemon);
				} else {
					pokemonuser = (Pikachu) pokemon.get(choosepokemon);
				}
				
				System.out.println("Wait, we are randoming your opponent pokemon.");
				
				int enemy = new Random().nextInt(4);
				if (pokemon.get(enemy) instanceof Charmander) {
					pokemonenemy = (Charmander) pokemon.get(enemy);
				} else if (pokemon.get(enemy) instanceof Squirtle) {
					pokemonenemy = (Squirtle) pokemon.get(enemy);
				} else if (pokemon.get(enemy) instanceof Bulbasaur) {
					pokemonenemy = (Bulbasaur) pokemon.get(enemy);
				} else {
					pokemonenemy = (Pikachu) pokemon.get(enemy);
				}
				
				System.out.println("Found!!, Your Enemy pokemon is...");
				System.out.println("=========================================");
				System.out.println("Your pokemon");
				System.out.println(pokemonuser.getNamapokemon());
				System.out.println("Skill : \n1. " + pokemonuser.skill1().get(0) + "\n2. " + pokemonuser.skill2().get(0) + "\n3. " + pokemonuser.skill3().get(0));
				System.out.println("Health : " + pokemonuser.getHealth());
				System.out.println("=========================================");
				System.out.println("your enemy pokemon");
				System.out.println(pokemonenemy.getNamapokemon());
				System.out.println("Health : " + pokemonenemy.getHealth());
				
				
				Vector<Vector<Object>> Skilllistuser = new Vector<Vector<Object>>();
				Skilllistuser.add(pokemonuser.skill1());
				Skilllistuser.add(pokemonuser.skill2());
				Skilllistuser.add(pokemonuser.skill3());
				
				Vector<Vector<Object>> Skilllistenemy = new Vector<Vector<Object>>();
				Skilllistenemy.add(pokemonenemy.skill1());
				Skilllistenemy.add(pokemonenemy.skill2());
				Skilllistenemy.add(pokemonenemy.skill3());
				
				
				boolean upperhand;
				boolean normal;
				
				
				
				if (!(pokemonuser.getElement().equals(pokemonenemy.getWeakness())) && !(pokemonenemy.getElement().equals(pokemonuser.getWeakness()))) {
					normal = true;
					
				} else {
					normal = false;
				}
				
				if (pokemonuser.getElement().equals(pokemonenemy.getWeakness())) {
						upperhand = true;
				} else {
						upperhand = false;
				}
				
				
				int userhealth = pokemonuser.getHealth();
				int enemyhealth = pokemonenemy.getHealth();
				
//				System.out.println(normal);
//				System.out.println(upperhand);
					if (upperhand && !normal) {
						boolean stop = false;
						do {
							for (int i = 0; i < Skilllistuser.size(); i++) {
								System.out.println((i+1) + ". " + Skilllistuser.get(i).get(0));
							}
					System.out.println("Choose your Pokemon Skill to be used");					
					int skillchoose = (sc.nextInt()-1); sc.nextLine();
					int userdemage = (((int) Skilllistuser.get(skillchoose).get(1)) * 2);
					System.out.println(userdemage);
					
					enemyhealth -= userdemage;
//					enemyhealth = enemyhealth - userdemage;
					
					System.out.println("your enemy health is " + enemyhealth);
					
					
					int counter = new Random().nextInt(3);
					int counterdemage = (((int)Skilllistenemy.get(counter).get(1)) / 2);
					
					userhealth -= counterdemage;
					
					System.out.println("your health is " + userhealth);
					
					if (enemyhealth <= 0) {
						System.out.println("Congrats, you winn!!");
						stop = true;
					}
					
					else if (userhealth <= 0) {
						System.out.println("Sorry, You lose!!");
						stop = true;
					}
					
						} while (!stop);
						
						
					} else if (!upperhand && !normal) {
						boolean stop = false;
						do {
							for (int i = 0; i < Skilllistuser.size(); i++) {
								System.out.println((i+1) + ". " + Skilllistuser.get(i).get(0));
							}
					System.out.println("Choose your Pokemon Skill to be used");					
					int skillchoose = (sc.nextInt()-1); sc.nextLine();
					int userdemage = (((int) Skilllistuser.get(skillchoose).get(1)) / 2);
					System.out.println(userdemage);
					
					enemyhealth -= userdemage;
					
					System.out.println("your enemy health is " + enemyhealth);
					
					int counter = new Random().nextInt(3);
					int counterdemage = (((int) Skilllistenemy.get(counter).get(1)) * 2);
					
					userhealth -= counterdemage;
					
					System.out.println("your health is " + userhealth);
					
					if (enemyhealth <= 0) {
						System.out.println("Congrats, you winn!!");
						stop = true;
					}
					
					else if (userhealth <= 0) {
						System.out.println("Sorry, You lose!!");
						stop = true;
					}
					
						} while (!stop);
					} else if (normal && !upperhand) 	{
						boolean stop = false;
						do {
							for (int i = 0; i < Skilllistuser.size(); i++) {
								System.out.println((i+1) + ". " + Skilllistuser.get(i).get(0));
							}
					System.out.println("Choose your Pokemon Skill to be used");					
					int skillchoose = (sc.nextInt()-1); sc.nextLine();
					int userdemage = (((int) Skilllistuser.get(skillchoose).get(1)));
					
					System.out.println(userdemage);
					
					enemyhealth -= userdemage;
					
					System.out.println("your enemy health is " + enemyhealth);
					
					int counter = new Random().nextInt(3);
					int counterdemage = (((int) Skilllistenemy.get(counter).get(1)));
					
					userhealth -= counterdemage;
					
					System.out.println("your health is " + userhealth);
					
					if (enemyhealth <= 0) {
						System.out.println("Congrats, you winn!!");
						stop = true;
					}
					
					else if (userhealth <= 0) {
						System.out.println("Sorry, You lose!!");
						stop = true;
					}
					
						} while (!stop);
					}
					
				break;
				
			}
		} while (choose != 3);
		
		System.out.println("terima kasih");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
