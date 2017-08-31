/*
		Copyright (C) 2017  jmfgdev@outlook.com
        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU Affero General Public License as published
        by the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.
        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU Affero General Public License for more details.
        You should have received a copy of the GNU Affero General Public License
		along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

import java.util.Scanner;

class interject {
	public static void main (String[] args) {
		System.out.println("---INTERJECT---");
		System.out.printf("What is the number one server OS in the world?%nInput your answer --> ");
		Scanner scan = new Scanner(System.in);
		String my_result = scan.nextLine();
		scan.close();
		my_result = my_result.toLowerCase();

		if (my_result.equals("linux")) {
        	System.out.printf("I'd like to interject for a moment--%nwhat you've referred to as as %s is in fact, GNU/%s %nor, as I've recently taken to calling it, GNU plus %s%n",my_result,my_result,my_result);
		} else if (my_result.equals("gnu/linux") || my_result.equals("gnu plus linux") || my_result.equals("gnu + linux") || my_result.equals("lignux")) {
        	System.out.println("That's right!");
		} else if (my_result.equals("") || my_result.equals(" ")) {
        	System.out.println("Please input something other than the empty string.");
		} else {
			System.out.printf("%s is not the number one server OS in the world...%n", my_result);
		}
	}
}
