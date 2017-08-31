class whatami {
    public static void main (String[] args) {
    String OS = System.getProperty("os.name");
    if (OS.equals("Linux")) {
        OS = "GNU/Linux";
    }
    // System.getenv("PROCESSOR_ARCHITECTURE");
    System.out.printf("---WHATAMI---%nI'm %s%n", OS);
    }
}