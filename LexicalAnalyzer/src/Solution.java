import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Rakin
 *11:48:12 PM
 * licensed to Rakin
 */
public class Solution {

	public static void main(String[] args) {

		ArrayList<String> keyList = new ArrayList<>(
				Arrays.asList("auto", "break", "case", "char", "const", "continue", "default", "do", "double", "else",
						"float", "for", "if", "int", "long", "return", "short", "signed", "static", "while"));

		ArrayList<String> opList = new ArrayList<>(Arrays.asList("+", "*", "/", "-", "%", "&", "!", "="));
		ArrayList<String> idList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "x", "y", "z"));
		ArrayList<String> otherList = new ArrayList<>(Arrays.asList(")", ",", ";", "(", ";", "}", "{", "?", "."));
		ArrayList<String> numList = new ArrayList<>(Arrays.asList("1", "2", "0", "3", "4", "5", "6", "7", "8", "9"));

		ArrayList<String> list = new ArrayList<>();

		Set<String> keySet = new TreeSet<>();
		Set<String> opSet = new TreeSet<>();
		Set<String> idSet = new TreeSet<>();
		Set<String> otherSet = new TreeSet<>();
		Set<String> numSet = new TreeSet<>();

		try {

			Scanner scan = new Scanner(new File("E:\\Numbers.txt"));
			while (scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] arr = str.split(" ");

				for (String token : arr) {
					list.add(token);
				}
			}
			scan.close();

		} catch (Exception e) {
			System.out.println("File missing");
		}

		for (int i = 0; i < list.size(); i++) {
			if (keyList.contains(list.get(i))) {
				keySet.add(list.get(i));
			} else if (opList.contains(list.get(i))) {
				opSet.add(list.get(i));
			} else if (idList.contains(list.get(i))) {
				idSet.add(list.get(i));
			} else if (numList.contains(list.get(i))) {
				numSet.add(list.get(i));
			} else if (otherList.contains(list.get(i))) {
				otherSet.add(list.get(i));
			}
		}

		Iterator<String> itr = keySet.iterator();

		System.out.println("Keywords:");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		itr = opSet.iterator();

		System.out.println("Operators:");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		itr = idSet.iterator();

		System.out.println("Identifiers:");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		itr = numSet.iterator();

		System.out.println("Numbers:");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
		itr = otherSet.iterator();

		System.out.println("Others:");

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
