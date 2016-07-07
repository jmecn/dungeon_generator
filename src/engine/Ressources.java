package engine;

import java.util.Random;

public class Ressources {
	private static Ressources res;
		
	private static String[] monsterName = { "alphyn",	"bunny",	"chima",	"dandan",	"elemal",	"fachen",	"goblin",	"hog",		"imp",		"jest",		"koalad",	"linum",	"mummy",	"nyan",		"olos", 	"pata", 	"qi", 	"rat", 		"snake", "troll", "uxie", 	"vermillion", 	"wasp", 	"xylopod", 	"yolocamph", 	"zilly" };
	private static String[] monsterName1= { "Alpha", 	"Bunner", 	"Chimera", 	"Daran", 	"Elemental","Fraken", 	"Goblord", 	"Hedgard", 	"Imperos", 	"Jester", 	"Koamad", 	"Lordum", 	"Mastras", 	"Ninja", 	"Olopus", 	"Partara", 	"Quim", "Routard", 	"Snake", "Troll", "Uximer", "Vizir", 		"Werewolf", "Xinus", 	"Yopor", 		"Zebra" };
	
	private static String[] weaponName = { "void", "Wooden Sword", "Dagger", "Sword", "Broadsword", "Master Sword" };
	private static String[] shieldName = { "void", "Wooden Shield", "Copper Shield", "Iron Shield", "Silver Shield", "Master Shield" };
	
	private Ressources() {
		
	}
	
	public static Ressources getInstance() {
		if(res==null) {
			res = new Ressources();
		}
		return res;
	}
	
	public static char getLetter() {
		Random rnd = new Random();
		return monsterName[rnd.nextInt(monsterName.length)].charAt(0);
	}
	
	public static char getLetterAt(int index) {
		return monsterName[index].charAt(0);
	}
	
	public static char getCapitalLetterAt(int index) {
		return monsterName1[index].charAt(0);
	}
	
	public static String getName() {
		Random rnd = new Random();
		return monsterName[rnd.nextInt(monsterName.length)];
	}
	
	public static String getNameAt(int index) {
		return monsterName[index];
	}
	
	public static String getCapitalNameAt(int index) {
		return monsterName1[index];
	}
	
	public static String getWeaponAt(int index) {
		return weaponName[index];
	}
	
	public static String getShieldAt(int index) {
		return shieldName[index];
	}
}
