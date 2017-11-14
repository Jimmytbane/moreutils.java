/*
BSD 3-Clause License

Copyright (c) 2017, JimmyBot
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, this
  list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice,
  this list of conditions and the following disclaimer in the documentation
  and/or other materials provided with the distribution.

* Neither the name of the copyright holder nor the names of its
  contributors may be used to endorse or promote products derived from
  this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

import java.util.Scanner;

class interject {
	public static void main (String[] args) {
		System.out.println("---INTERJECT---");
		System.out.printf("What is the number one server OS in the world?%nInput your answer  --> ");
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
