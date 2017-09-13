class linuxentropy {
	public static void main(String[] args) {
		String entrpy;
		System.out.println("---LINUXENTROPY---");
		entrpy = java.lang.Runtime.getRuntime().exec("cat /proc/sys/kernel/random/entropy_avail");
	}
}
